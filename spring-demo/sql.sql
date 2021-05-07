CREATE TABLE `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `request_url` varchar(255) DEFAULT NULL COMMENT '请求地址',
  `request_data` longtext COMMENT '请求参数',
  `response_data` longtext COMMENT '响应数据',
  `clazz_method` longtext comment '接口方法名',
  `status` varchar(2) DEFAULT NULL COMMENT '状态：10-失效，20-有效',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '最后更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='log日志表';

