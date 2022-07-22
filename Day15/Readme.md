
Day15:  

similar to zip

jar - Java Archive
web - Web Archive

...

nohub --> no hang up //ต่อให้วางสายโทรศัพท์มันก็ยังทำงานอยู่

use jenkins
java -jar jenkins.war --httpPort=4100 \  //-------> \ คือต่อบรรทัดล่างใน Unix Windows ใช้ ^
--enable-future-java

nohub java -jar jenkins.war \
--httpPort=4100 --enable-future-java &

Infrastructure as Code
Policy as Code

NGINX - has their own language to configure
Docker - has their own language
Jenkins - has their own language


Infrastructure as Code (IaC)
AWS - Amazon Web Services
GCP - Google Cloud Platform
...

import Server from "your-cloud"
let main = new Server()
main.setRAM(4096)
main.setSpace("20GB")
main.setOS( "Ubuntu-22.04" )
main.start()
while(true){
	let percent = main.getLoad()
	if(percent >= 80 ) {
		
	}
}

//Docker not use setRam & Space

=================================

Maven on Ubuntu
sudo apt install maven
mvn -version

'-- sample
	'-- pom.xml
	'-- target
		'-- sample-0.5.jar

cd sample
mvn package
mvn clean --> remove folder target


Microservice
============

e.g

	http://123.123.123.123/api/staff/search
	http://123.123.123.123/api/staff/insert	--> check permission
	http://123.123.123.123/api/staff/update --> check permission
	http://123.123.123.123/api/staff/delete --> check permission

C	http://123.123.123.123/api/product/insert
R	http://123.123.123.123/api/product/search	--> check permission
U	http://123.123.123.123/api/product/update 	--> check permission
D	http://123.123.123.123/api/product/delete 	--> check permission

C	http://123.123.123.123/api/branch/open
R	http://123.123.123.123/api/product/show		--> check permission
U	http://123.123.123.123/api/product/change 	--> check permission
D	http://123.123.123.123/api/product/remove 	--> check permission	




MySQL
- Ubuntu	- super easy
- macOS		- 
- Windows	- super hard

			https://codestar.work/mysql-windows.pdf


From Ubuntu:
sudo apt update
sudo apt install mysql-server
service mysql status --> Press 'q' to exit
sudo service mysql start

Operating System					Database Management System
OS									DBMS
-Windows, Linux, iOS				Oracle, SQL Server, MySQL

File: Text File						Database
'	  Binary File					^
'-----------------------------------'

Is Excel a DBMS? FOR ME : YES!

From OS to DBMS
sudo mysql

From DBMS to OS
exit

MySQL statement;
- show databases;
- create database ...(you db name) e.g. inventory;  //ไม่ต้องเติม s, create
- drop database ...(you db name) e.g. inventory;	//delete
- create database flying_turtle default character set 'UTF8';

use flying_turtle;
create table unit
(
	code		varchar(60),
	location	varchar(200),
	milk		float,
	head 		integer
);

create table staff
(
	name varchar(200),
	gender character,
    salary float
);

insert into staff(name, gender, salary)
  values('Mark Z', 'M', 40000.0);

insert into staff(name, gender, salary)
  values('Sheryl S', 'F', 50000.0); 



SQL Data Type

Traditional					Modern
int		`					integer					20
float						float					2.78
double						double					3.54
char						character				'A' or 'M'
varchar(20)					character varying(20)	'Latte'

How about crytocurrency?



				  Level 5: Prolog
				  Level 4: SQL
			  	  Level 3: Python, JavaScript
						   Java, 
						   C
				  Level 2: Assembler
						 : MOV R0, 15
						 : ADD R0, 17
				  
Computer Language Level 1: Machine Code


