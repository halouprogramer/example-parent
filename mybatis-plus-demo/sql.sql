

drop database if exists  mybatis-plus-demo ;
create database mybatis-plus-demo default charset utf8;




use mybatis-plus-demo ;

#用户表
create table user(
    id int(11) not null primary key comment '主键值',
    username varchar(20) not null default '用户名',
)Engine=InnoDB default charset utf8 comment '用户表';

#订单表
create table order(
    id int(11) not null primary key comment '主键值',
)Engine=InnoDB default charset utf8 comment '订单表';
