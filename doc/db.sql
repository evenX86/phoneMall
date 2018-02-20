CREATE TABLE `pm_user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键，用户id',
  `user_name` varchar(50) DEFAULT NULL,
  `user_mail` varchar(50) DEFAULT NULL,
  `user_tel` varchar(20) DEFAULT NULL,
  `user_passwd` varchar(255) DEFAULT NULL,
  `user_addr` varchar(255) DEFAULT NULL,
  `user_type` enum('admin','common') DEFAULT 'common' COMMENT '用户类型,普通用户 or 管理员',
  `status` tinyint(4) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建日期',
  PRIMARY KEY (`id`),
  KEY `idx_username` (`user_name`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='用户表';


CREATE TABLE `pm_phone_detail` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `phone_name` varchar(50) DEFAULT NULL,
  `phone_config` varchar(255) DEFAULT NULL,
  `phone_price` int(11) DEFAULT '0' COMMENT '手机价格',
  `phone_stock` int(11) DEFAULT '0' COMMENT '库存',
  `phone_img` varchar(255) DEFAULT NULL,
  `creator` varchar(50) DEFAULT NULL,
  `created` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `operator` varchar(50) DEFAULT NULL,
  `modified` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='手机信息表';

