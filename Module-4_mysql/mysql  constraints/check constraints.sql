use constraints;

create table vote(voter_id int primary key,voter_name varchar(50),age int, constraint chk_age check (age>=18));

describe vote;

insert into vote values(1000,'dinesh',15);
insert into vote values(1001,'ramesh',18);

alter table vote drop constraint chk_age;
alter table vote add constraint chk_age check (age>=18);

drop table vote;