create database if not exists shardingsphere-demo default charset utf8;
use shardingsphere-demo;

CREATE TABLE `student` (
  `id` bigint(32) NOT NULL ,
  `name` varchar(32) NOT NULL COMMENT '学生姓名',
  `class_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '班级id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生表';


CREATE TABLE `student_detail` (
  `id` bigint(32) NOT NULL,
  `student_id` bigint(32) NOT NULL COMMENT '学生表id',
  `address` varchar(50) DEFAULT '' COMMENT '学生地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='学生详情表';
