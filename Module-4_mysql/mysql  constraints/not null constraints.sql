create table person1 (
person_id int ,
first_name varchar(50) not null,
last_name varchar(50) not null,
age int
);

insert into person1(person_id,first_name,age)values(100,'surya',23);
insert into person1(person_id,first_name,last_name,age)values(100,'surya','kumar',23);

alter table person1 modify age int not null;
insert into person1(person_id,first_name,last_name)values(100,'ganesh','kumar');

drop table person1;