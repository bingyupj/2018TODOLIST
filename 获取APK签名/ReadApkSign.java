package cn.ycmedia;//package cn.ycmedia;


import sun.security.pkcs.PKCS7;
import sun.security.x509.X509CertImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * 打包 https://www.zhihu.com/question/265736604/answer/332090714
 * http://tieba.baidu.com/p/4206532998?traceid=
 * 拖拽文件至文本框显示文件路径
 * @author bingYu (174486424@qq.com)
 *
 * 新建classes目录
  1 编译 javac ReadApkInfo.java -d classes
    验证可用 java -cp classes ReadApkInfo
    2 打jar包 javapackager -createjar -appclass ReadApkInfo -srcdir classes -outdir archive -outfile ReadApkInfo.jar
  3 打exe
    javapackager -deploy -appclass ReadApkInfo -native image -srcdir archive -outdir deploy -outfile ReadApkInfo -Bruntime="C:/Program Files/Java/jre1.8.0_152/"
 *
 */
public class ReadApkSign extends JFrame implements ClipboardOwner {

  public void lostOwnership(Clipboard clip,Transferable transferable) {
  }


  Clipboard clipboard;

  private JTextField fieldSign;

  private JButton BtnCopySign;

  private JTextField field;

  public ReadApkSign(){

    this.setTitle("Android Sign");
    this.setSize(600, 500);
    this.setLocationRelativeTo(null);
    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    clipboard= Toolkit.getDefaultToolkit().getSystemClipboard();

    fieldSign = new JTextField();
    fieldSign.setBounds(50, 50, 300, 20);
    fieldSign.setEditable(false);

    BtnCopySign = new JButton();
    BtnCopySign.setBounds(360, 50, 48, 20);
    BtnCopySign.setText("c");

    field = new JTextField();
    field.setBounds(50, 90, 300, 300);
    field.setText("apk Put Here");


    BtnCopySign.addActionListener(new CopyListener());


    field.setTransferHandler(new TransferHandler()
    {
      private static final long serialVersionUID = 1L;
      @Override
      public boolean importData(JComponent comp, Transferable t) {
        try {
          Object o = t.getTransferData(DataFlavor.javaFileListFlavor);

          String filepath = o.toString();
          if (filepath.startsWith("[")) {
            filepath = filepath.substring(1);
          }
          if (filepath.endsWith("]")) {
            filepath = filepath.substring(0, filepath.length() - 1);
          }
          String sign = readSignature(filepath);
          System.out.println(filepath + "->" + sign);
          fieldSign.setText(sign);
          return true;
        }
        catch (Exception e) {
          e.printStackTrace();
        }
        return false;
      }
      @Override
      public boolean canImport(JComponent comp, DataFlavor[] flavors) {
        for (int i = 0; i < flavors.length; i++) {
          if (DataFlavor.javaFileListFlavor.equals(flavors[i])) {
            return true;
          }
        }
        return false;
      }
    });

    //this.add(BtnCopySign);
    this.add(fieldSign);
    this.add(field);
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new ReadApkSign();
  }


  class CopyListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      StringSelection contents=new StringSelection(fieldSign.getText());
      clipboard.setContents(contents, ReadApkSign.this);
    }
  }


  private static final char[] digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

  public static String bytes2HexStr(byte[] bytes) {
    if (bytes == null || bytes.length == 0) {
      return null;
    }
    char[] buf = new char[(bytes.length * 2)];
    for (int i = 0; i < bytes.length; i++) {
      byte b = bytes[i];
      buf[(i * 2) + 1] = digits[b & 15];
      buf[(i * 2) + 0] = digits[((byte) (b >>> 4)) & 15];
    }
    return new String(buf);
  }

  public static String getStringMD5(String paramString) {
    try {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes());
      String str = bytes2HexStr(localMessageDigest.digest());
      return str;
    } catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {
      localNoSuchAlgorithmException.printStackTrace();
    }
    return paramString;

  }

  private static Map<String,String> unZip(String apkFile) throws Exception {
    Map<String, String> kv = new HashMap();
    ZipFile zipFile;
    zipFile = new ZipFile(new File(apkFile));
    Enumeration enumeration = zipFile.entries();
    ZipEntry zipEntry = null;
    while (enumeration.hasMoreElements()) {
      zipEntry = (ZipEntry) enumeration.nextElement();
      if (zipEntry.getName().startsWith("META-INF") && zipEntry.getName().endsWith("RSA") ){
        X509Certificate publicKey = readSignatureBlock(zipFile.getInputStream(zipEntry));
        //System.out.println(publicKey);
        //String sign = getStringMD5(bytes2HexStr(publicKey.getSignature()));
        String sign = getStringMD5(Arrays.toString(((X509CertImpl) publicKey).getEncodedInternal())).toLowerCase();
        //kv.put("publicKey",publicKey.getPublicKey().toString());
        kv.put("sign",sign);

      }
    }
    return kv;
  }

  public static X509Certificate readSignatureBlock(InputStream inputstream) throws Exception{
    PKCS7 pkcs7 = new PKCS7(inputstream);
    return pkcs7.getCertificates()[0];
  }

  public static String readSignature(String apkFile) throws Exception{
    Map<String, String> kv = unZip(apkFile);
    return kv.get("sign");
  }

}
