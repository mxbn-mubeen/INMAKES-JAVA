create database springbootdb;
use springbootdb;

CREATE TABLE product (
    product_id INT PRIMARY KEY AUTO_INCREMENT,
    product_name VARCHAR(100),
    price DOUBLE,
    quantity INT
);


INSERT INTO product (product_name, price, quantity) VALUES 
('Dates', 500.99, 50),
('Rice', 267.49, 100),
('Soap', 145.25, 200),
('Almond', 600.98, 500);

SELECT * FROM springbootdb.product;
SELECT * FROM springbootdb.product_seq;
SET SQL_SAFE_UPDATES=0;
DELETE FROM PRODUCT WHERE PRODUCT_NAME IS NULL;
 
CREATE TABLE LAPTOP (
	
    ID INT PRIMARY KEY auto_increment,
    NAME VARCHAR(59),
    PRICE DOUBLE
);

INSERT INTO LAPTOP (NAME,PRICE) VALUES 
('DELL',56900.00),
('ASUS',78900.98),
('MAC',100000.00),
('LENOVO',60000.72);