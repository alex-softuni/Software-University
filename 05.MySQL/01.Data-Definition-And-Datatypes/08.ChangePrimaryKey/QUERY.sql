ALTER TABLE `users` 
DROP PRIMARY KEY, 
ADD CONSTRAINT pk_users2
PRIMARY KEY `users`(`id`, `username`);