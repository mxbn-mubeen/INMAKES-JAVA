create database dml;

use dml;
create table student(regno int,student_name varchar(50),age int,gender varchar(10),department varchar(20));

describe student;

insert into student(regno,student_name)values(1000,'Amutha');
insert into student(regno,student_name,gender)values(1001,'Barath','Male');
insert into student(student_name,gender,department)values('Gayathri','feMale','sales');

insert into student values(1003,'alex',22,'Male','technical');
insert into student values(1004,'sam',24,'male','hr');
insert into student values(1005,'thulsi');

set sql_safe_updates=0;
update student set age=20,gender='female',department='production' where regno=1000;
update student set age=21,department='Accountant' where regno=1001;

delete from student where regno=1001;
delete from student where regno is null;

select * from student;
select regno,student_name from student;
select * from student where department="hr";