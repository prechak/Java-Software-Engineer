
MySQL
on Cloud & Ubuntu
join & subquery
- join
- left join
- subquery

Spring Data JDBC


--

MySQL on Local Computer
- Windows - Super Hard
			https://codestar.work/mysql-windows.pdf

- Ubuntu  - Nothing to do

- macOS	  - Download mySQL community server (DMG) and install to your system it will ask
			you to create a password
		  -> /usr/local/mysql/bin/mysql --user root --password

---

MySQL on Ubuntu on Cloud
			-> sudo apt update
install		-> sudo apt install mysql-server
status		-> service mysql status -> press 'q' to exit
exit		-> sudo exit

From MySQL:

create database online default character set = 'UTF8';
if exist use drop;

create user jeff identified with mysql_native_password by 'bezos';
grant all on online.* to jeff;

use online;

create table users	
(	
	 code	  integer not null unique auto_increment,
	 email	  varchar(200) unique not null,
	 password varchar(200) not null,
	 name	  varchar(200) not null
);
//หลีกเลี่ยงโดยใช้ พหูพจน์ users เติม s
//normally use id and int
//character varying(200)
//professtional use first_name, last_name


insert into users(email,password,name)
	 values('mark@fb.com', sha2('mark123', 512), 'Mark Zuckerberg');
insert into users(email,password,name)
	 values('bill@msn.com', sha2('bill123', 512), 'Bill Gates');

create table posts
(
	 code	 integer unique not null auto_increment,
	 topic	 varchar(200) not null,
	 detail	 varchar(4000),
	 photo	 varchar(200),
	 user	 integer 
);


add later --> alter table posts add starting_price float;
		  --> alter table posts add finishing_price float;

//any value can be add default
// foreign key อ้างอิงกับอีก table

			// Know mark number 1
		--> insert into posts(topic, detail, user, starting_price, finishing_price)
				 values('Ford 2020 for sale', '...', 1, 600000, 700000);

			// Unknow number
		--> insert into posts(topic, detail, user, starting_price, finishing_price)
				 select 'Toyota 2019', 'Detail 2', code, 450000, 500000
				 from users where email = 'mark@fb.com;

		--> insert into posts(topic, detail, user, starting_price, finishing_price)
				 select 'Honda Accord 2021', 'Detail 3', code, 800000, 850000
				 from users where email = 'mark@fb.com;

		--> insert into posts(topic, detail, user, starting_price, finishing_price)
				 select 'Benz 2020', 'Detail 4', code, 1800000, 2000000
				 from users where email = 'bill@msn.com;


Encrypting Password
===================
One-way Encrytion (Hashing is confused, please avoid using "hashing")

(Almost) no one can be able to convert it to original message.

select md5('mark123');
+----------------------------------+
| md5('mark123')                   |
+----------------------------------+
| 6d295738eb6579053ac46a9ca1902583 |
+----------------------------------+

select sha2('mark123', 256);		-- Please pronounce it as "ES-EDH-AE"
select sha2('mark123', 384);
select sha2('mark123', 512);

There are two kinds of password
- password create by user
- password create by the system owner (e.g Vk3@E%7)
								'----------> Salt
select sha2 ( concat('mark123', 'Vk3@E%7'),512 );

Join ( means multiply ) --> create cartesian Product
=======================
1.select * from users join post;
2.select * from users join posts on user.code = posts.user;
3.select users.code, users.email, users.name, post.topic
	 from users join posts on users.code = posts.user;


Left Join (Recommended) or Right Join
=======================
-- use the left table as the main table


CORRECT:
select users.code, users.email, users.name, post.topic
	 from posts left join users on users.code = posts.user;

Subquery:
=========
1.select * from post;

2.select *,
( select users.email from users where posts.users = users.code) as email  
from posts;

3. select code, topic, detail, user,
	 (select users.email from users where posts.user = users.code) as email
	 from posts;


Using query without subquery:

select starting_price from posts where user = 1; //if know query

(select code from users where email = 'mark@fb.com');	<-- this is subquery

Mix (Using query ending with subquery)
===
select starting_price from posts where user = 
(select code from users where email = 'mark@fb.com');

Average
=======
select avg(starting_price) from posts where user = 
(select code from users where email = 'mark@fb.com');

JOIN -> Avoid
LEFT JOIN -> Much Better
SUBQUERY - Simple Way


Git / GitHub
============
How to use 8-decimal percision in SQL as in Cryptocurrency


macOS: /usr/local/mysql/bin/mysql --user root -password [enter]


Spring Data
===========
'-- JDBC
'-- JPA
'-- MongoDB

Spring Data JDBC

java-25
'--pom.xml
'--code
'	'--main
'		'--Start.java
'		'--User.java
'		'--Post.java
'
'--test
	'--main
		'--Test.java


Servlet Stack	-> Blocking
Reactive Stack -> Non-Blocking

https://codestar.work/spring.pdf
https://codestar.work/spring-boot.pdf
https://codestar.work/spring-6.pdf


=======
ไม่ว่าจะอ่านฐานข้อมูลอะไรก็ตามต้องมีสิ่งที่เรียกว่า Connection String ก่อน

Java
--> jdbc:mysql://127.0.0.1/online?user=jeff&password=bezos

In Node.js
mysql://jeff:bezos@127.0.0.1/online

