
Engineering Disciplinary มาตราฐานในการทำงาน


SSH - Secure Shell
	  ^		 ^^

Shell - Command Interpreter
		A computer program to translate user's command to OS.
		/bin/sh ======> Unix
		/usr/bin/sh ==> Ubuntu
		
		Bourne Shell

	-	C-Shell - Bill Joy
	
	-	Born-Again Shell - Bash
		/usr/bin/bash

		echo $0

'-- java-18
	'-- pom.xml
	'-- code
	'	'-- Start.java
	'-- test
		'-- Test.java

FILE: pom.xml

<project>
	<modelVersion> 4.0.0 </modelVersion>
	<groupId> app.artfully </groupId>
	<artifactId> java-18 </artifactId>
	<version> 0.5 </version>

	<build>
		<sourceDirectory> code </sourceDirectory>
		<testSourceDirectory> test </testSourceDirectory>
	</build>

	<properties> 
		<maven.complier.source> 18 </maven.complier.source>
		<maven.complier.target> 18  </maven.complier.target>
	</properties>

</project>

