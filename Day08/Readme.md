
Day08:

1990+-	Tim Berners Lee	CERN
		HTTP (Hyper Text Transfer Protocol)
		'---------------> The World-Wide Web

		(Daemon)
		(Computer Program)			(Computer Program)
		HTTP Server					HTTP Client
		'-> Apache HTTP Server2			'-> Web Browser (Firefox, Chrome, ... )
			NGINX - Engine X				ALL Device connection to Internet (IoT)
											Smart Watch

		Response --> HTML --->
		CGI
		'-- Common Gateway Interface
		'-- C, PERL, PHP, JSP, Whatever
		'-- Print result in HTML

		booking using PERL > CGI
		
		index.html
		/cgi-bin/search


1995 +-	Combine both file fomt HTML + CGI

		index.php
		search.php
		login.php

		index.jsp
		search.jsp
		login.jsp

the largest company using php is Facebook.com




2003+- Write a simple program to intercept all request 
	
			
		/login		---> g()
			'---/	---> f()
		/search	'		
				'
				'
				'--> Dispatcher (OR any name, Center, Router)


		Spring MVC		--> first Idea 		// people concern about bottleneck
		Ruby on Rails 	--> first Popular	// get popular people forget


		MVC Web Application Framework
		~ for large web project
		
		MVC WAF										Microframework
Java	Spring MVC									Spark
Ruby	Ruby on Rails								Sinatra
Python	Django										Flask
PHP		Laravel ~ The PHP framework 				Lumen ~ The stunningly fast
					for web artisans. 						microframework by Laravel
		CodeIgniter

Node.js	~ not Hits									Express

2004	AJAX ~ Asynchronus Javascript API for XML
		'
		'----> 	Request for only some parts,
				Refresh or update only some parts

		Web Service ~ A program that produced data, such as XML, JSON, ...

Spring Boot ~ Framework that prepare everything for us.
				Default web server in Spring Boot is Tomcat.




Recommend MVC for Large Web Project


Context ~ Environment


ClassPathXmlApplicationContext			~ Configure from XML file
GenericApplicationContext				~ Register Bean Manually
											- Constructor Injection
AnnotationConfigApplicationContext		~ Use Annotation to create bean


Dependency Injection			~ setup address of instance
								~ wiring

Manually Injection
Constructor Injection


https://codestar.work/spring-6.pdf

'-- sample-13
	'-- pom.xml
	'-- code
	'	'-- main					--> Package
	'		'-- Start.java
	'		'-- Sample.java
	'		'-- Initialize.java
	'-- test
		'-- main
			'-- Test.java

MVC - Model View Controller ~ 3 part
		'--> main()
		'--> Setup (Initialize)
		'--> Controller (Web Service have only Controller)

@Annitation is keyword ใน Java มี Keyword อยู่ 59 คำ
				ซึ่งน้อยมาก ไม่เพียงพอต่อการใช้งาน
				มันมีวิธีสร้าง Keyword ขึ้นมาใหม่
				Keyword ที่สร้างขึ้นพวกนี้ เรียกว่า Annotation
				ตัวอย่างของ Annotation ที่ Java สร้างไว้
				@Deprecated และ @Override				//@Deprecated คือยกเลิก
				

Create BeanAnnotationApplicationContext

package main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;
import org.springframework.context.support.GenericApplicationContext;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = new AnnotationConfigApplicationContext
                                        (Setup.class);
        //Cashier c = context.getBean(Cashier.class);
        Cashier c = (Cashier) context.getBean("xxx");
        double total = c.getTotal(180.0);
        System.out.printf("%.2f\n", total);
    }
}

//@Configuration ไส่ไม่ใส่ก็ได้
class Setup {
    @Bean 
        Cashier xxx(){
        Cashier c = new Cashier();
        c.setTax(15.0);
        return c;
    }
    @Bean 
        Cashier yyy(){
        Cashier c = new Cashier();
        c.setTax(10.0);
        return c;
    }
    
}

class Cashier {
    double multiplier = 1.0;
    
    void setTax(double t){
        multiplier = (100.0 + t) /100;
    }
    
    double getTotal(double price){
        return price * multiplier;
    }
}
