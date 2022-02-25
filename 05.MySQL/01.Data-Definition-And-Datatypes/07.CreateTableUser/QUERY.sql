CREATE TABLE `users`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`username` VARCHAR(30) UNIQUE,
`password` VARCHAR(26) NOT NULL,
`profile_picture` BLOB,
`last_login_time` DATETIME,
`is_deleted` BOOLEAN
);

INSERT INTO `users`(`id`,`username`,`password`,`profile_picture`,`last_login_time`,`is_deleted`)
VALUES
(1,'Alex','password',NULL,DATE(NOW()),FALSE),
(2,'S','password',NULL,DATE(NOW()),FALSE),
(3,'Slex','password',NULL,DATE(NOW()),FALSE),
(4,'SDlex','password',NULL,DATE(NOW()),FALSE),
(5,'ASSex','password',NULL,DATE(NOW()),FALSE);