create table person2 (
person_id int unique ,
first_name varchar(50) not null,
last_name varchar(50) not null,
age int
);

insert into person2(person_id,first_name,last_name,age)values(100,'surya','kumar',23);
insert into person2(person_id,first_name,last_name,age)values(100,'ganesh','kumar',22);
insert into person2(first_name,last_name,age)values('gayathri','kumari',25);
insert into person2(first_name,last_name,age)values('sam','maxi',22);