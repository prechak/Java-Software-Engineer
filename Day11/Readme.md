
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

https://codestar.work/two-pointers.pdf
https://codestar.work/java-04.pdf


Given two variable, how can you interchange the
values between them.

โดยทั่วไป ทำไม่ได้ ต้องมี มือที่สาม มาช่วยด้วย

Primitive Data					Class
byte							Byte
short							Short
int								Int
long							Long
float							Float
double							Double
char							Character
boolean							Boolean

Coverting from primitive to instance:

int k = 5;
Integer u = k	// Boxing or Autoboxing ห่อของขวัญ

Converting from instance to primitive:

int m = u;		// Unboxing แกะกล่องของขวัญ


int w = Integer.parseInt("123")	// แปลง "123" ให้เป็น Promitive
int z = Interger.valueOf("123")	// แปลง "123" ให้เป็น Instance ก่อนแล้วค่อย Unbox

============

write a method to reverse the given linked list.

Write a method find the middle point of the given linked list.

Given two sorted linked list, write a method to merge them.



==========

Tonight's Missoion:
codestar.work/mission-java.pdf

==========

Merge Sort
https://codestar.work/merge-sort.pdf

ได้ข้อมูลมาแบ่งครึ่งไปเรื่อยๆ

	8	5	6	3 	4	1	9	7
	
	8	5	6	3|	4	1	9	7

	8	5|	6	3|	4	1	9	7

	8|	5|	6|	3|	4|	1|	9|	7		// Sorted block of 8 blocks


	5	8|	3	6|	1	4|	7	9
	3	5	6	8|	1	4	7	9

