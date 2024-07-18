select adddate('2022-12-07',19);
select addtime('10:45:30',15);

select curdate();
select curtime();
select current_date();
select current_time();
select current_timestamp();

select date_add('2023-12-06',interval 10 year);
select date_sub('2023-12-06',interval 10 year);
select datediff('2023-12-06','2023-10-06');
select date_format('2023-12-06','%Y-%M-%D');
select date_format('2023-12-06','%y-%m-%d');

select date('2023-12-06');
select day('2023-12-06');
select month('2023-12-06');
select year('2023-12-06');

select dayname('2023-12-06');
select dayofmonth('2023-12-06');
select dayofweek('2023-12-06');
select dayofyear('2023-12-06');
select last_day('2023-12-06');

select localtime();
select localtimestamp();

select makedate(2024,02);
select maketime(10,30,45);
select microsecond('2054-04-10 11:30:35.000045');

select now();
select hour(now());
select minute(now());
select second(now());
select monthname(now());

select period_add(202306,08);
select period_diff(2022306,08);

select quarter('2023-10-06');

select subdate('2023-12-06',05);
select str_to_date('2023 december 06','%Y %M %D');

select subdate('2023-12-06',05);
select subtime('10:45:30',15);

select sysdate();

select time_format('11:35:12','%H:%i:%S');
select time_to_sec('11:35:12');

select time(now());
select timediff(time(now()),'20:24:26');

select timestampadd(day, 10 ,now());
select timestampdiff(day, '2023-04-10','2024-04-10');

select week('2024-04-10');
select weekday('2024-04-10');
select weekofyear('2024-04-10');
select yearweek('2024-04-10');
