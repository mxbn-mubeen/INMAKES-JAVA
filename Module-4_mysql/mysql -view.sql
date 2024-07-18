use constraints;

create view emp_view as select empid,empname from employee;

alter view  emp_view as select * from employee;

delete from employee where empid=100;

select * from emp_view;

insert into emp_view values(1003,'prasanth','2023-12-01');

drop view emp_view;