
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

Git / GitHub







