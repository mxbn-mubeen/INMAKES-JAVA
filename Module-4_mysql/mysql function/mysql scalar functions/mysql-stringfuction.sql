select concat("hello"," ","world");

select instr("hello world",'e');

select length('hello world');
select length('helloworld');

select format(5679529,'#,##,###');

select lower('HELLO WORLD');
select upper('hello world');

select replace('hello world','l','$');

select ltrim(						'hello world');
select rtrim('hello world'					);
select trim(						'hello world'				);

select concat("hello",	ltrim("				 world					"));
select concat("hello",	rtrim("				 world					"));
select concat("hello",	trim("				 world					"));

select left('hello world',5);
select right('hello world',5);
select mid('hello world',3,3);

select substring("hello world",2);
select substring_index("hello world",'l',3);

select ascii('A');
select ascii('a');

