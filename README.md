# untitled-blog

```sh
clear && UNTITLED_DATABASE_HOST='127.0.0.1' UNTITLED_DATABASE_DATABASE=untitled UNTITLED_DATABASE_USERNAME=untitled UNTITLED_DATABASE_PASSWORD=untitled mvn clean spring-boot:run
```

```sql
DROP DATABASE IF EXISTS `untitled`;
CREATE DATABASE `untitled`;

DROP USER IF EXISTS 'untitled'@'127.0.0.1';
CREATE USER 'untitled'@'127.0.0.1' IDENTIFIED WITH mysql_native_password BY 'untitled';
GRANT ALL PRIVILEGES ON *.* TO 'untitled'@'127.0.0.1' WITH GRANT OPTION;

USE untitled;
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  CONSTRAINT UNIQUE `unique_username` (`username`),
  CONSTRAINT UNIQUE `unique_email` (`email`)
);
```