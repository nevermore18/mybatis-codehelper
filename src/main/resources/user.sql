-- auto-generated definition
create table user
(
    id       int auto_increment
        primary key,
    username varchar(32)  not null comment '用户名称',
    birthday datetime     null comment '生日',
    sex      char         null comment '性别',
    address  varchar(256) null comment '地址'
)
    charset = utf8;

