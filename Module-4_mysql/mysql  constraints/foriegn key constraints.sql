use constraints;

create table branch_table(branch_code varchar(10) primary key,branch_name varchar(60),hod varchar(30));
 
describe branch_table;
 
insert into branch_table(branch_code,branch_name,hod)values('civ','civil engineering','megnathan');
insert into branch_table(branch_code,branch_name,hod)values('mech','mechanical engineering','ramesh');
insert into branch_table(branch_code,branch_name,hod)values('cse','computer science and engineering','ganesh');
insert into branch_table(branch_code,branch_name,hod)values('it','information technology engineering','suresh');
insert into branch_table(branch_code,branch_name,hod)values('ece','electronic&comm engineering','magesh');
insert into branch_table(branch_code,branch_name,hod)values('eee','electronic&electronicss engineering','ravi');

 create table student2(id int auto_increment unique,student_id int primary key,student_name varchar(30),
 email_id varchar(20),place char(30),age int,branch_code varchar(10) ,foreign key (branch_code) references branch_table(branch_code));
 
 describe student2;
 
 insert into student2(student_id,student_name,email_id,place,age,branch_code) 
 values(10,'janni','janni@gmail.com','chennai',20,'robotics');
 
 insert into student2(student_id,student_name,email_id,place,age,branch_code) 
 values(20,'sam','sam@gmail.com','coimabatore',20,'it');
 
 insert into student2(student_id,student_name,email_id,place,age,branch_code) 
 values(30,'sami','sami@gmail.com','cochin',23,'it');
 
 insert into student2(student_id,student_name,email_id,place,age,branch_code) 
 values(40,'samesh','samesh@gmail.com','bombay',18,'it');
 
 drop table branch_table;
 drop table student2;