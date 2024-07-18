select bin(15);
select bin(27);

select binary('mysql');

select cast('2023-12-09' as date);
select cast(10125 as char);
select cast(15 as binary);

select convert('2023-12-09',date);

select conv(25,10,2);
select conv(25,10,8);
select conv(25,10,16);

select coalesce(15,45,78,45,78);
select coalesce(null,null,78,45,78);
select coalesce(null,null,'my','sw','kj');

select if(10>15,'10 is big','15 is big');
select if(10>5,'10 is big','5 is big');
select ifnull(null,'%%$##$"');

use dml;

select regno,ifnull(student_name,'&&&&&&&'),age,ifnull(gender,'%%%%%%'),department from student;
select nullif('amutha',student_name) from student;

select regno,isnull(student_name) from student;