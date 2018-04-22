CREATE TABLE `db_version` (
  `version` int(11) NOT NULL COMMENT '数据库版本',
  `exec_sql` varbinary(1024) NOT NULL COMMENT '执行的sql',
  `exec_time` int(10) unsigned NOT NULL COMMENT '执行时间',
  PRIMARY KEY (`version`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci