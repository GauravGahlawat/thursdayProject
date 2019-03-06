CREATE TABLE `user` (
	`user_id` INT AUTO_INCREMENT PRIMARY KEY,
	`user_name` VARCHAR(50) NOT NULL,
	`company_name` VARCHAR(20) NOT NULL,
	`salary` VARCHAR(50) NULL DEFAULT NULL,
	`contact_no` VARCHAR(20) NOT NULL,
	`post` VARCHAR(50) NOT NULL,
	`location` VARCHAR(50) NULL DEFAULT NULL
	);


INSERT INTO user
	(user_name,company_name,salary,contact_no,post,location)
	VALUES ('Gaurav','NIIT','50000','9888988899','Developer','GreaterNoida'),
	('Himani','TCS','60000','9888988877','PhpDeveloper','Gurgaon'),
	('Rajitha','INFOSYS','65000','9888988866','Tester','Meerut'),
	('Sharmistha','EVIVE','70000','9888988855','Manager','Mumbai');


CREATE TABLE `company` (
	`company_id` INT NOT NULL PRIMARY KEY,
	`company_name` VARCHAR(20) NOT NULL,
	`date` Date NOT NULL,
	`time` Time NOT NULL,
	`location` varchar(50) NOT NULL,
	`user_id` INT  NOT NULL,
    FOREIGN KEY (user_id) REFERENCES user(user_id)
    ON UPDATE CASCADE
    ON DELETE CASCADE
);

INSERT INTO company
	(company_id,company_name,date,time,location,user_id)
	VALUES (1001,'NIIT','2019-02-25','13:30:00','techzone',1),
	(1002,'TCS','2019-02-15','10:30:00','cyberhub',2),
(1003,'INFOSYS','2019-02-20','15:00:00','friendscolony',1),
 (1004,'EVIVE','2019-01-11','15:30:00','dlfcolony',3);
 
 
 
 
	
	
	
	
	