CREATE DATABASE `baiduhanyu`;
USE `baiduhanyu`;
CREATE TABLE `t_poem`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`type` VARCHAR(10) COMMENT '类型',
`dynasty` VARCHAR(10) COMMENT '朝代',
`literatureAuthor` VARCHAR(20) COMMENT '作者',
`displayName` VARCHAR(40) COMMENT '名称',
`body` TEXT COMMENT '内容',
`time` TIMESTAMP DEFAULT NOW() COMMENT '更新时间'
)