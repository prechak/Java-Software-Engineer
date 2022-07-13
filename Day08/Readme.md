
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


		Spring MVC		--> first Idea
		Ruby on Rails 	--> first Popular

		


Context ~ Environment


ClassPathXmlApplicationContext	~ Configure from XML file
GenericApplicationContext		~ Register Bean Manually
									- Constructor Injection


Dependency Injection			~ setup address of instance
								~ wiring

Manually Injection
Constructor Injection

