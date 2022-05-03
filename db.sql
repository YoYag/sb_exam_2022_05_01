# 데이터베이스 생성
DROP DATABASE IF EXISTS demo;
CREATE DATABASE demo;
USE demo;

# 테이블 생성
CREATE TABLE `user` (
	`id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY,
	`reg_date` DATETIME NOT NULL,
	`update_date` DATETIME NOT NULL,
	`email` VARCHAR(100) NOT NULL,
	`password` VARCHAR(100) NOT NULL,
	`name` CHAR(50) NOT NULL
);

SHOW TABLES;

# 회원 데이터 생성
INSERT INTO `user`
SET `reg_date` = NOW(),
`update_date` = NOW(),
`email` = 'use1@test.com',
`password` = '1111',
`name` = '유저1';

INSERT INTO `user`
SET `reg_date` = NOW(),
`update_date` = NOW(),
`email` = 'use2@test.com',
`password` = '2222',
`name` = '유저2';

INSERT INTO `user`
SET `reg_date` = NOW(),
`update_date` = NOW(),
`email` = 'use3@test.com',
`password` = '3333',
`name` = '유저3';

SELECT * FROM `user`;