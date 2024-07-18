use asq ;
select * from employee_details;

select count(employee_id) from employee_details;
select avg(salary) from employee_details;
select max(salary) from employee_details;
select min(salary) from employee_details;
select sum(salary) from employee_details;   

select * from employee_details where job_id='it_prog';
select job_id,avg(salary) from employee_details group by job_id;
select job_id,max(salary) from employee_details group by job_id;
select job_id,min(salary) from employee_details group by job_id;
select job_id,count(salary) from employee_details group by job_id;
select job_id,avg(salary) from employee_details group by job_id having job_id='it_prog';