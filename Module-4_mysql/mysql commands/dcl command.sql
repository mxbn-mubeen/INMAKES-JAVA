create database department_db;

use department_db;

create table department(id bigint auto_increment primary key,department_address varchar(255),
department_code varchar(255),department_name varchar(255));

describe department;

/* mysql command line client 

 fisrts enetr the root password in mysql command line client 
 select current_user();// check current user
 system mysql -u root -p; // user login
 create user 'inmakes'identified by 'inmakes@kochi';//create user
 system mysql -u 'inmakes' -p;
 select current_user();
 alter user 'inmakes'identified by 'inmakes@123';//change user password
 
  system mysql -u root -p
  show database;// database view from user
  use department_db;// use db
  show tables;// view db tables;
  select * from department;
  desc department; // structure fro table
  
  -- permission to access for another users--
  grant insert on department_db.department to 'inmakes'; 
  grant select on department_db.department to 'inmakes';
  
  system mysql -u 'inmakes' -p;
  
  -- insert  values via another user--
  insert into department_db.department values(1,'chennai','TN01','HR');
  insert into department_db.department values(2,'coimbatore','TN02','technical');
  insert into department_db.department values(3,'salem','TN03','sales');
  insert into department_db.department values(4,'madurai','TN04','production');
  
  select * from department_db.department; //table view
  
  show grants; // check preveieges or which access given to another user//
  
  system mysql -u root -p;
  revoke all on department_db.department from 'inmakes'; // remove  access from another user
  show grants for 'inmakes'; check preveieges or which access given to another user via root user//
  
  */

drop table department;
