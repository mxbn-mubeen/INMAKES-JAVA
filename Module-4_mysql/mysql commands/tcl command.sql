/* mysql command line client 

   fisrts enetr the root password in mysql command line client 
   select current_user();// check current user
   system mysql -u root -p; // user login
 
   show database;// database view from user
   use department_db;// use db
   show tables;// view db tables;
   select * from department;
  
   delete from department where id=3;
   rollback; // roll back is just like ctrl+z= undo -- but this line does not happen beacuse we change auto commit in mysql--
   select * from department;
   delete * from department;
   rollback;
   select * from department;
   
   set autocommit=0;
   insert into department values(1,'chennai','TN01','HR');
   rollback;
   select * from department;
   
   insert into department_db.department values(1,'chennai','TN01','HR');
   insert into department_db.department values(2,'coimbatore','TN02','technical');
   select * from department;
   commit; // permenant save cannot change  even if we use rollback
   rollback;
   select * from department;
   delete * from department;
   
   select * from department;
   rollback;
   select * from department;
   delete * from department;
   commit;
   rollback;
   select * from department;
   
   insert into department_db.department values(1,'chennai','TN01','HR');
   savepoint A;
   insert into department_db.department values(2,'coimbatore','TN02','technical');
   savepoint B;
   insert into department_db.department values(3,'salem','TN03','sales');
   savepoint C;
   insert into department_db.department values(4,'madurai','TN04','production');
   savepoint D;
   
   select * from department;
   rollback to savepoint C; // certain piont to rollback
   select * from department;
   
   commit;
   rollback to savepoint A;
   select * from department;
   
   */