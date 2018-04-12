ʹ��springboot �̳߳�����MySQLʱ��mysql���ݿ�wait_timeout Ϊ8��Сʱ�����Գ���ڶ��췢�ֱ�����url������ autoReconnect=true Ҳ���У���ѯ��������



#��֤���ӵ���Ч��

spring.datasource.test-while-idle=true

#��ȡ����ʱ����֤����Ӱ������
spring.datasource.test-on-borrow=true


spring.datasource.validation-query=SELECT 1 FROM DUAL

#�������ӻ��յ�ʱ��������test-while-idleһ��ʹ�ã�����5����
spring.datasource.time-between-eviction-runs-millis=300000

#���ӳؿ������ӵ���Чʱ�� ������30����
spring.datasource.min-evictable-idle-time-millis=1800000

 

================  

SpringBoot��������֮DataSource  
https://segmentfault.com/a/1190000004316491

datasource
spring.dao.exceptiontranslation.enabled�Ƿ���PersistenceExceptionTranslationPostProcessor��Ĭ��Ϊtrue

spring.datasource.abandon-when-percentage-full�趨��ʱ������������ռ�����ٱ���ʱҪ���رջ��ϱ�

spring.datasource.allow-pool-suspensionʹ��Hikari poolʱ���Ƿ��������ӳ���ͣ��Ĭ��Ϊ: false

spring.datasource.alternate-username-allowed�Ƿ�����������û���.

spring.datasource.auto-commitָ��updates�Ƿ��Զ��ύ.

spring.datasource.catalogָ��Ĭ�ϵ�catalog.

spring.datasource.commit-on-return���õ����ӱ��黹ʱ���Ƿ�Ҫ�ύ���л�δ��ɵ�����

spring.datasource.connection-init-sqlָ�����ӱ��������ٱ���ӵ����ӳ�֮ǰִ�е�sql.

spring.datasource.connection-init-sqlsʹ��DBCP connection poolʱ��ָ����ʼ��ʱҪִ�е�sql

spring.datasource.connection-properties.[key]��ʹ��DBCP connection poolʱָ��Ҫ���õ�����

spring.datasource.connection-test-queryָ��У�����ӺϷ���ִ�е�sql���

spring.datasource.connection-timeoutָ�����ӵĳ�ʱʱ�䣬���뵥λ.

spring.datasource.continue-on-error�ڳ�ʼ�����ݿ�ʱ�����������Ƿ������Ĭ��false

spring.datasource.dataָ��Data (DML)�ű�

spring.datasource.data-source-class-nameָ������Դ��ȫ�޶���.

spring.datasource.data-source-jndiָ��jndi�ĵ�ַ

spring.datasource.data-source-properties.[key]ʹ��Hikari connection poolʱ��ָ��Ҫ���õ�����

spring.datasource.db-propertiesʹ��Tomcat connection pool��ָ��Ҫ���õ�����

spring.datasource.default-auto-commit�Ƿ��Զ��ύ.

spring.datasource.default-catalogָ������Ĭ�ϵ�catalog.

spring.datasource.default-read-only�Ƿ�����Ĭ������ֻ��.

spring.datasource.default-transaction-isolationָ�����ӵ������Ĭ�ϸ��뼶��.

spring.datasource.driver-class-nameָ��driver��������Ĭ�ϴ�jdbc url���Զ�̽��.

spring.datasource.fair-queue�Ƿ����FIFO��������.

spring.datasource.health-check-properties.[key]ʹ��Hikari connection poolʱ�����������ʱ���ݵ�����

spring.datasource.idle-timeoutָ�����Ӷ��û��ʹ��ʱ��������Ϊ���У�Ĭ��Ϊ10ms

spring.datasource.ignore-exception-on-pre-load����ʼ�����ӳ�ʱ���Ƿ�����쳣.

spring.datasource.init-sql�����Ӵ���ʱ��ִ�е�sql

spring.datasource.initial-sizeָ���������ӳ�ʱ����ʼ��������������

spring.datasource.initialization-fail-fast���������ӳ�ʱ��û������ָ����С���������Ƿ����쳣

spring.datasource.initializeָ����ʼ������Դ���Ƿ���data.sql����ʼ����Ĭ��: true

spring.datasource.isolate-internal-queriesָ���ڲ���ѯ�Ƿ�Ҫ�����룬Ĭ��Ϊfalse

spring.datasource.jdbc-interceptorsʹ��Tomcat connection poolʱ��ָ��jdbc���������ֺŷָ�

spring.datasource.jdbc-urlָ��JDBC URL.

spring.datasource.jmx-enabled�Ƿ���JMX��Ĭ��Ϊ: false

spring.datasource.jndi-nameָ��jndi������.

spring.datasource.leak-detection-thresholdʹ��Hikari connection poolʱ�����ٺ�����һ������й¶.

spring.datasource.log-abandonedʹ��DBCP connection pool���Ƿ�׷�ٷ���statement�����ӣ�Ĭ��Ϊ: false

spring.datasource.log-validation-errors��ʹ��Tomcat connection pool�Ƿ��ӡУ�����.

spring.datasource.login-timeoutָ���������ݿ�ĳ�ʱʱ��.

spring.datasource.max-activeָ�����ӳ������Ļ�Ծ������.

spring.datasource.max-ageָ�����ӳ������ӵ��������

spring.datasource.max-idleָ�����ӳ����Ŀ�����������.

spring.datasource.max-lifetimeָ�����ӳ������ӵ��������ʱ�䣬���뵥λ.

spring.datasource.max-open-prepared-statementsָ�����Ĵ򿪵�prepared statements����.

spring.datasource.max-waitָ�����ӳصȴ����ӷ��ص����ȴ�ʱ�䣬���뵥λ.

spring.datasource.maximum-pool-sizeָ�����ӳ�����������������ʹ���еĺͿ��е�����.

spring.datasource.min-evictable-idle-time-millisָ��һ�������������ٿ��ж�ú�ɱ����.

spring.datasource.min-idleָ�����뱣�����ӵ���Сֵ(For DBCP and Tomcat connection pools)

spring.datasource.minimum-idleָ������ά������С��������������ʹ��HikariCPʱָ��.

spring.datasource.nameָ������Դ��.

spring.datasource.num-tests-per-eviction-runָ������ÿ��idle object evictor�߳�ʱ�Ķ�������

spring.datasource.passwordָ�����ݿ�����.

spring.datasource.platformָ��schemaҪʹ�õ�Platform(schema-${platform}.sql)��Ĭ��Ϊ: all

spring.datasource.pool-nameָ�����ӳ�����.

spring.datasource.pool-prepared-statementsָ���Ƿ�ػ�statements.

spring.datasource.propagate-interrupt-state�ڵȴ�����ʱ������̱߳��жϣ��Ƿ񴫲��ж�״̬.

spring.datasource.read-only��ʹ��Hikari connection poolʱ���Ƿ�������Դֻ��

spring.datasource.register-mbeansָ��Hikari connection pool�Ƿ�ע��JMX MBeans.

spring.datasource.remove-abandonedָ�������ӳ���������ʱʱ��ʱ���Ƿ�����ɾ��������.

spring.datasource.remove-abandoned-timeoutָ������Ӧ�ñ�������ʱ��.

spring.datasource.rollback-on-return�ڹ黹����ʱ���Ƿ�ع��ȴ��е�����.

spring.datasource.schemaָ��Schema (DDL)�ű�.

spring.datasource.separatorָ����ʼ���ű������ָ�����Ĭ��: ;

spring.datasource.sql-script-encodingָ��SQL scripts����.

spring.datasource.suspect-timeoutָ����ӡ��������ǰ�ĳ�ʱʱ��.

spring.datasource.test-on-borrow�������ӳؽ�������ʱ���Ƿ���Ը�����.

spring.datasource.test-on-connect����ʱ���Ƿ��������

spring.datasource.test-on-return�����ӹ黹�����ӳ�ʱ�Ƿ���Ը�����.

spring.datasource.test-while-idle�����ӿ���ʱ���Ƿ�ִ�����Ӳ���.

spring.datasource.time-between-eviction-runs-millisָ���������Ӽ�顢�������������������ӳش�С����֮��Ĳ���ʱ����

spring.datasource.transaction-isolationָ��������뼶��ʹ��Hikari connection poolʱָ��

spring.datasource.urlָ��JDBC URL.

spring.datasource.use-disposable-connection-facade�Ƿ�����ӽ��а�װ����ֹ���ӹر�֮��ʹ��.

spring.datasource.use-equals�ȽϷ�����ʱ�Ƿ�ʹ��String.equals()�滻==.

spring.datasource.use-lock�Ƿ�����Ӳ�������

spring.datasource.usernameָ�����ݿ���.

spring.datasource.validation-intervalָ������msִ��һ������У��.

spring.datasource.validation-queryָ����ȡ����ʱ����У���sql��ѯ���.

spring.datasource.validation-query-timeoutָ������У���ѯ�ĳ�ʱʱ��.

spring.datasource.validation-timeout�趨����У��ĳ�ʱʱ�䣬��ʹ��Hikari connection poolʱָ��

spring.datasource.validator-class-name�������Բ�ѯ��validatorȫ�޶���.

spring.datasource.xa.data-source-class-nameָ������Դ��ȫ�޶���.

spring.datasource.xa.propertiesָ�����ݸ�XA data source������

JPA
spring.jpa.databaseָ��Ŀ�����ݿ�.

spring.jpa.database-platformָ��Ŀ�����ݿ������.

spring.jpa.generate-ddl�Ƿ�������ʱ��ʼ��schema��Ĭ��Ϊfalse

spring.jpa.hibernate.ddl-autoָ��DDL mode (none, validate, update, create, create-drop). ��ʹ����Ƕ���ݿ�ʱ��Ĭ����create-drop������Ϊnone.

spring.jpa.hibernate.naming-strategyָ����������.

spring.jpa.open-in-view�Ƿ�ע��OpenEntityManagerInViewInterceptor����JPA EntityManager�������߳��У�Ĭ��Ϊ: true

spring.jpa.properties��Ӷ�������Ե�JPA provider.

spring.jpa.show-sql�Ƿ���sql��log��Ĭ��Ϊ: false

jooq
spring.jooq.sql-dialectָ��JOOQʹ�õ�SQLDialect������POSTGRES.

h2
spring.h2.console.enabled�Ƿ�������̨��Ĭ��Ϊfalse

spring.h2.console.pathָ������̨·����Ĭ��Ϊ: /h2-console

JTA
spring.jta.allow-multiple-lrc�Ƿ����� multiple LRC��Ĭ��Ϊ: false

spring.jta.asynchronous2-pcָ�����׶��ύ�Ƿ�����첽��Ĭ��Ϊ: false

spring.jta.background-recovery-intervalָ�����ٷ�����һ��recovery process��Ĭ��Ϊ: 1

spring.jta.background-recovery-interval-secondsָ�������һ��recovery process��Ĭ��: 60

spring.jta.current-node-only-recovery�Ƿ���˵������Ǳ�JVM��recovery��Ĭ��Ϊ: true

spring.jta.debug-zero-resource-transaction�Ƿ�׷��û��ʹ��ָ����Դ������Ĭ��Ϊ: false

spring.jta.default-transaction-timeout�趨Ĭ�ϵ�����ʱʱ�䣬Ĭ��Ϊ60

spring.jta.disable-jmx�Ƿ����jmx��Ĭ��Ϊfalse

spring.jta.enabled�Ƿ���JTA support��Ĭ��Ϊ: true

spring.jta.exception-analyzer����ָ�����쳣������

spring.jta.filter-log-statusʹ��Bitronix Transaction Managerʱ���Ƿ�дmandatory logs�������Ļ������Խ�ʡ���̿ռ䣬���ǵ��ԻḴ��д��Ĭ��Ϊfalse

spring.jta.force-batching-enabledʹ��Bitronix Transaction Managerʱ���Ƿ�����д���̣�Ĭ��Ϊtrue.

spring.jta.forced-write-enabledʹ��Bitronix Transaction Managerʱ���Ƿ�ǿ��д��־�����̣�Ĭ��Ϊtrue

spring.jta.graceful-shutdown-interval��ʹ��Bitronix Transaction Manager��ָ��shutdownʱ�ȴ����������ʱ�䣬�������жϣ�Ĭ��Ϊ60

spring.jta.jndi-transaction-synchronization-registry-name��ʹ��Bitronix Transaction Managerʱ����JNDI�µ�����ͬ��registry��Ĭ��Ϊ: java:comp/TransactionSynchronizationRegistry

spring.jta.jndi-user-transaction-nameָ����JNDIʹ��Bitronix Transaction Manager�����ƣ�Ĭ��:java:comp/UserTransaction

spring.jta.journal��ʹ��Bitronix Transaction Manager��ָ��The journal�Ƿ�disk����null����һ�����ȫ�޶�����Ĭ��disk

spring.jta.log-dirTransaction logs directory.

spring.jta.log-part1-filenameָ��The journal fragment�ļ�1�����֣�Ĭ��: btm1.tlog

spring.jta.log-part2-filenameָ��The journal fragment�ļ�2�����֣�Ĭ��: btm2.tlog

spring.jta.max-log-size-in-mbָ��journal fragments��С�����ֵ. Ĭ��: 2M

spring.jta.resource-configuration-filenameָ��Bitronix Transaction Manager�����ļ���.

spring.jta.server-idָ��Bitronix Transaction Managerʵ����id.

spring.jta.skip-corrupted-logs�Ƿ����corrupted log files�ļ���Ĭ��Ϊfalse.

spring.jta.transaction-manager-idָ��Transaction manager��Ψһ��ʶ.

spring.jta.warn-about-zero-resource-transaction��ʹ��Bitronix Transaction Managerʱ���Ƿ��û��ʹ��ָ����Դ��������о��棬Ĭ��Ϊ: true