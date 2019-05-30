## 码匠社区

## 资料
- [Spring文档](https://spring.io/guides)
- [Spring Web文档](https://spring.io/guides/gs/serving-web-content/)
- [ES社区](https://elasticsearch.cn/explore)
- [BootStrap](https://v3.bootstrap.com/getting-started/)
- [GitHub OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)
- [Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-embeded-database-support)

## 工具
- [Git](https://git-scm.com/download)
- [VP](https://www.visual-paradigm.com)

## 脚本
```sql
create table USER
(
    ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_A60BBC28_2410_40F7_84BA_755341F40D14) auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);
```