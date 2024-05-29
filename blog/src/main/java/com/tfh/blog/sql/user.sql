create table if not exists user
(
    id       bigint primary key not null comment '用户id',
    user_name varchar(64)        not null comment '用户账号',
    password char(128)          not null comment '密码',
    nick_name varchar(64) not null comment '昵称'
);
