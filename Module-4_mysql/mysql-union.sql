use constraints;

create table student(regno int primary key,student_name varchar(50),age int,
 gender varchar(10),dept varchar(50));
 
 create table student2(regno int primary key,student_name varchar(50),age int,
 gender varchar(10),dept varchar(50));
 
insert into student values(1000,'arun',20,'male','it');
insert into student values(1001,'priya',20,'female','ece');
insert into student values(1002,'sruthi',20,'female','cse');
insert into student values(1003,'tarun',20,'male','eee');

insert into student2 values(1000,'arun',20,'male','it');
insert into student2 values(1001,'john',20,'male','mech');
insert into student2 values(1002,'samu',20,'female','eee');
insert into student2 values(1003,'ganesh',20,'male','ece');


select regno,student_name from student
union			-- column not same we got error
select * from student2;

select regno,student_name from student
union
select age,dept from student2;

select regno,student_name from student
union
select gender,dept from student2;

select * from student
union all
select * from student2;