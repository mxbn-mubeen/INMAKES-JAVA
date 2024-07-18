use constraints;

create table  employee (empid int primary key,empname varchar(50),doj datetime default now());

insert into employee(empid,empname)values(1001,'sushi');
insert into employee(empid,empname,doj)values(1002,'ramesh','2023-09-09');