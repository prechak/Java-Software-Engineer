Day09:

- 	Web Service & Microservice
	ใช้ Spring Boot ฐานข้อมูล MySQL
	Spring Data JDBC / Spring Data JPA

	Spring Boot Web Service - Servlet Stack default web server is Tomcat
							- Reactive Stack

	Web Service							DBMS(Data Base Management Sysyem)
	============						====
eg.	http://192.168.1.22					MySQL 192.168.1.23
	http://192.168.1.22/user-register
	http://192.168.1.22/user-login
	http://192.168.1.22/user-logout

	Web Service (Branch Management)
	http://192.168.1.32					SQL Server 192.168.1.33
	http://192.168.1.32/brach-update	
	http://192.168.1.32/branch-report

	API Gateway / Reverse Proxy
	Apache Kafka
	Apache HTTP Server
	NGINX	--> Short Command

									  '----------------> 192.168.1.22
	http://192.168.1.15				--'----------------> 192.168.1.32
									  '----------------> 192.168.1.42

- DevOps Skill (Unix, SQL, Apache, NGINX, CGI, PHP, Docker, Firewall
				Unit Test, UAT - User Acceptance Test)

- Frontend Toolkit (Bootstrap, Common CSS)


Spring Dependency Injection & Stereotype

https://codestar.work/spring-6.pdf

'-- sample-14
	'-- pom.xml
	'-- code
	'	'--main
	'		'-- Start.java
	'-- test
		'-- main
			'-- Test.java

File: pom.xml

<project>
	<modelVersion> 4.0.0 </modelVersion>
	<groupId> jp.co.liquid </groupId>
	<artifactId> my-project-14 </artifactId>
	<version> 0.8 </version>
        
        <repositories>
            <repository>
                <id>spring</id>
                <url>https://repo.spring.io</url>
            </repository>   
        </repositories>
        
        <dependencies>
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
                <version>3.0.0-M3</version>
            </dependency>
        </dependencies>

	<build>
		<sourceDirectory> code </sourceDirectory>
		<testSourceDirectory> test </testSourceDirectory>
        </build>

	<properties>
		<maven.compiler.source> 18 </maven.compiler.source>
		<maven.compiler.target> 18 </maven.compiler.target>
	</properties>
</project>

Spring Dependency Injection ~ Instance Injection
Maven Dependency ~ Additional Java Classes


	
	