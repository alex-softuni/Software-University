CREATE TABLE `categories`(
`id` INT PRIMARY KEY AUTO_INCREMENT,
`category` VARCHAR(30) NOT NULL,
`daily_rate` DOUBLE,
`weekly_rate` DOUBLE,
`monthly_rate` DOUBLE,
`weekend_rate` DOUBLE
);

INSERT INTO `categories` (`category`)
VALUES 
('TestName1'),
('TestName2'),
('TestName3');

CREATE TABLE `cars`(
 `id` INT PRIMARY KEY AUTO_INCREMENT,
`plate_number` VARCHAR(30), 
 `make`INT, 
 `model` VARCHAR(30), 
 `car_year` INT, 
 `category_id` INT, 
 `doors` INT, 
 `picture` BLOB, 
 `car_condition` TEXT, 
 `available` BOOLEAN
 );
 
INSERT INTO `cars` (`plate_number`)
VALUES 
('TestName1'),
('TestName2'),
('TestName3');

 CREATE TABLE `employees`(
 `id` INT PRIMARY KEY AUTO_INCREMENT, 
 `first_name` VARCHAR(30), 
 `last_name`  VARCHAR(30), 
 `title`      VARCHAR(30), 
 `notes`      TEXT
 );
 
 INSERT INTO `employees` (`first_name`, `last_name`)
VALUES 
('TestName1', 'TestName1'),
('TestName2', 'TestName2'),
('TestName3', 'TestName3');
 
 CREATE TABLE `customers`(
 `id` INT PRIMARY KEY AUTO_INCREMENT, 
 `driver_license_number` INT, 
 `full_name` VARCHAR(60), 
 `address` VARCHAR(60), 
 `city` VARCHAR(30), 
 `zip_code` INT, 
 `notes` TEXT
 );
 
 INSERT INTO `customers` (`driver_license_number`, `full_name`)
VALUES 
('123', 'TestName1'),
('1234', 'TestName2'),
('12345', 'TestName3');
 
 
 CREATE TABLE `rental_orders`(
 `id` INT PRIMARY KEY AUTO_INCREMENT, 
 `employee_id` INT, 
 `customer_id` INT, 
 `car_id` INT, 
 `car_condition` TEXT, 
 `tank_level` INT, 
 `kilometrage_start` INT,
 `kilometrage_end` INT, 
 `total_kilometrage` INT, 
 `start_date` DATETIME, 
 `end_date` DATETIME,
 `total_days` INT,
 `rate_applied` DOUBLE, 
 `tax_rate` DOUBLE, 
 `order_status` BOOLEAN, 
 `notes` TEXT
 );
 
INSERT INTO `rental_orders` (`employee_id`, `customer_id`)
VALUES 
(1, 2),
(2, 3),
(3, 1);