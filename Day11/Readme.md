
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
		<maven.complier.source> 18  </maven.complier.source>
		<maven.complier.target> 18  </maven.complier.target>
	</properties>

</project>

========================

Given an array of integers:

	int[] a = { 8, 6, 5, 3, 7, 5, 4, 1 };
					  ^           ^
					  '-----------'

	int start = 2;
	int finish = 6;
	
		// 8 6 4 5 7 3 5 1	
	
	
	
class Start{
    public static void main(String[] z){
        int[] a = { 8, 6, 5, 3, 7, 5, 4, 1 };
        int start = 2;
        int finish = 6;
        int left = start;
        int right = finish;
        while(left < right){
            int y = a[left];
            int x = a[right];
            a[right] = y;
            a[left] = x;
            left++;
            right--;
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}

	


And Starting and ending position,
write code to reverse from starting to finishing position.

https://codestar.work/two-pointer.pdf


Given two variable, how can you interchange the
values between them.

โดยทั่วไป ทำไม่ได้ ต้องมี มือที่สาม มาช่วยด้วย




