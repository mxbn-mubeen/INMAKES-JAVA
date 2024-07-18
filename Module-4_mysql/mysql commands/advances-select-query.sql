create database ASQ;

use ASQ;

select * from employee_details;

select employee_id,first_name,last_name from employee_details;

select * from employee_details where manager_id=101;
select * from employee_details where manager_id=101 and job_id='hr_rep';
select * from employee_details where manager_id=101 or department_id=100;

select * from employee_details where job_id  in('sh_clerk','hr_rep');
select * from employee_details where job_id not in('sh_clerk','hr_rep');

select * from employee_details where salary>10000;
select * from employee_details where salary<10000;
select * from employee_details where salary>=10000;
select * from employee_details where salary between 5000 and 10000;

select * from employee_details order by first_name;
select * from employee_details order by employee_id desc;

select * from employee_details where first_name like 'A%';
select * from employee_details where first_name like 'D_%';
select * from employee_details where first_name like '_d%';
select * from employee_details where first_name like 'D[A-E]%';
select * from employee_details where first_name like 'D[^A-E]%';

select * from employee_details limit 5;
select * from employee_details limit 5,10;

select distinct(job_id) from employee_details;
select all(job_id) from employee_details;
