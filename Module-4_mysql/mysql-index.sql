use asq;

create index emp_index on employee_details(employee_id);

select * from employee_details;

show indexes from employee_details;

drop index emp_index on employee_details;

create unique index emp_index on employee_details(employee_id);

select * from employee_details;

show indexes from employee_details;

drop index emp_index on employee_details;