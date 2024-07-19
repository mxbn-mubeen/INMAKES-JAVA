CREATE DATABASE HIBERNATE;
USE HIBERNATE;
CREATE TABLE CUSTOMER
( 
	customerid int primary key,
	customername varchar(40),
	address varchar(100),
	city varchar(30),
	state varchar(30),
	country varchar(30),
	pincode int
);

select * from customer;

INSERT INTO customer (customerid, customername, address, city, state, country, pincode) VALUES
(1002, 'Arunkumar', 'Bharathidasan Street', 'Trichy', 'TamilNadu', 'India', 686651),
(1003, 'Balamurugan', 'Bharathiyar Street', 'Thiruneveli', 'TamilNadu', 'India', 645434),
(1004, 'Chandrasekar', '12, Temple Street', 'Cuddalore', 'TamilNadu', 'India', 525685),
(1005, 'Divya', '56, Gandhi Street', 'Chennai', 'TamilNadu', 'India', 610236),
(1006, 'Emmanuel', '23, Nehru Street', 'Bangalore', 'Karnataka', 'India', 512980),
(1007, 'Faizal', '42/43, Thrissur Road', 'KK', 'Kerala', 'India', 631350),
(1008, 'Gokul', '3213, Richards Road', 'Mysore', 'Karnataka', 'India', 673621);

CREATE TABLE STUDENT 
(
	ROLLNO INT,
    STUDENT_NAME VARCHAR(100),
    GENDER VARCHAR(30),
    AGE INT
);

INSERT INTO STUDENT (ROLLNO, STUDENT_NAME, GENDER, AGE) VALUES
(1, 'ANAND', 'MALE', 15),
(2, 'BRINDHA', 'FEMALE', 16),
(3, 'CHITRA', 'FEMALE', 16),
(4, 'DINESH', 'MALE', 18);


/* starts from here hibernate coding challenge */

-- hibernate challenge 1.0--
CREATE TABLE employee
( 
	empno int primary key,
	employeename varchar(40),
	salary int,
	job varchar(30),
	deptno varchar(30)
	
);

-- hibernate challenge 2.0--
INSERT INTO employee (empno, employeename, salary, job, deptno)
VALUES
(1, 'John Doe', 5000, 'Manager', '101'),
(2, 'Jane Smith', 45000, 'Developer', '101'),
(3, 'Michael Johnson', 6000, 'Analyst', '104'),
(4, 'Emily Davis', 55000, 'Designer', '103');

