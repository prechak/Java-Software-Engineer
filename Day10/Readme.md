

Java Instance
Instance can be created by keyword "new"
Instance can be referenced by address in memory.

'-- java-15
	'-- pom.xml
	'-- code
	'	'-- Start.java
	'-- test
		'-- Test.java

In Java, Unit Test is a testing of method.
									'-- subroutine
									'-- subprogram
									'-- function

FILE pom.xml

<project>
	<modelVersion> 4.0.0 </modelVersion>
	<groupId> daeng-guitar </groupId>
	<artifactId> sample-15 </artifactId>
	<version> 0.5 </version>

	<build>
		<sourceDirectory> code </sourceDirectory>
		<testSourceDirectory> test </testSourceDirectory>
	</build>

	<properties>
		<maven.complier.source> 18 </maven.complier.source>
		<maven.complier.target> 18 </maven.complier.target>
	</properties>
	
</project>

// Live Coding should know 12 command of Java
// https://codestar.work/java-fundamental.pdf


// Manhattan Distance
	1. Euclidean Distance - Pythagoras --> (sqrt (a^2+b^2))
	2. Manhattan Distance is have square block 

===========

Test-Driven Development	(TDD)
-->Writing Unit test before writing real code.
	'--> test001(), test002()

Behavior-Driver Development (BDD)
-->Write test case by English 


Domain-Driven Development (DDD)
	naming everything like in business.

	class Member { } --> class Investor { }


