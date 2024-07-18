create database ddl;

use ddl;
create table student(regno int,Student_name varchar(50),department varchar(20));

describe student;

alter table student add column age int,add column gender varchar(2);

alter table student modify department varchar(50)after gender,modify column gender varchar(10);

alter table student drop column gender,drop column department;

alter table student rename to student2;

drop table student2;

drop database ddl;