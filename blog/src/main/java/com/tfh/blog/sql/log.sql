# 日志信息

create table if not exists log
(
    id          bigint primary key auto_increment comment '日志id',
    information longtext not null comment '日志信息'
);