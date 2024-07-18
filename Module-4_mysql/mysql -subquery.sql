use asq;

select employee_id,first_name,last_name,job_id,salary from employee_details
 where salary in(select max(salary) from employee_details group by job_id);
 
 select employee_id,first_name,last_name,job_id,salary from employee_details
 where salary in(select min(salary) from employee_details group by job_id);
 
 