create database constraints;
use constraints;

 create table student1(id int auto_increment unique,student_id int primary key,student_name varchar(30),
 email_id varchar(20),place char(30),age int);
 
 insert into student1(student_id,student_name,email_id,place,age) 
 values(10,'janni','janni@gmail.com','chennai',20);
 
 insert into student1(student_id,student_name,email_id,place,age) 
 values(10,'sam','sam@gmail.com','coimabatore',20);
 
 select * from student1;
 
 drop  table student1;