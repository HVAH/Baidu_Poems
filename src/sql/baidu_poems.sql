CREATE DATABASE `baiduhanyu`;
USE `baiduhanyu`;
CREATE TABLE `t_poem`(
`id` INT AUTO_INCREMENT PRIMARY KEY,
`type` VARCHAR(10) COMMENT '����',
`dynasty` VARCHAR(10) COMMENT '����',
`literatureAuthor` VARCHAR(20) COMMENT '����',
`displayName` VARCHAR(40) COMMENT '����',
`body` TEXT COMMENT '����',
`time` TIMESTAMP DEFAULT NOW() COMMENT '����ʱ��'
)