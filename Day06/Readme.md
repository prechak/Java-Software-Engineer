สิ่งที่มนุษย์สร้างขึ้นมาเพื่อทำงานอย่างนึง
พอเวลาผ่านไป 2-3 ปี ปัญหาเดิมที่เคยมี ไม่มีอยู่แล้ว
บางครั้งเลยเปลี่ยนแนวทาง ให้ไปทำงานอีกอย่างนึง

Docker เคยถูกสร้างขึ้นมาเพื่อทำ Application Virtualization
ผ่านมา 2-3 ปี ส่วนใหญ่ใช้ทำ Virtualization
เพื่อจำลองการทำงานของเครื่องคอมพิวเตอร์ 1 เครื่อง

NGINX เคยถูกสร้างเพื่อเป็น Web Server แต่ต่อมาเริ่มมีการใช้งานเพื่อทำหน้าที่อื่น
เช่น Reverse Proxy

Maven is Package Manager in Java


Last Week [

1. Primitive Data : 8 types, int, char, double
2. Non-primitive Data Type:
   '-- Reference Data Type: class, interface, enum, record

Class:  1. Field (Instance Variable)
		2. Method, Function

The operator new: 	1. Allowcate memory space
					2. Create an instance

คำบางคำ มีความหมายตามที่คนจะให้คำนิยาม
	เช่น ประชาธิปไตย คืออะไร
		ธุรกิจ คืออะไร

Special class that can use without creating instance:

String s = new String("I love you");		// จองพื้นที่ก่อน
String t = "I love you";					// ไม่ต้องจอง มันเก็บคนละที่กัน

]

custom folder : monday
'-- pom.xml
'-- code
'	'-- Start.java
'-- test
	'-- Test.java

FILE: pom.xml
<project>
	<modelVersion> 4.0.0 </modelVersion>
	<groupId>iCoffee</groupId>
	<artifactId> com.precha </artifactId>
        <version> 0.77 </version>

	<properties>
		<maven.compiler.source> 18 </maven.compiler.source>
		<maven.compiler.target> 18 </maven.compiler.target>
	</properties>

	<build>
		<sourceDirectory> code </sourceDirectory>
		<testSourceDirectory> test </testSourceDirectory>
	</build>

</project>

_____________________________________

Given a binary string, write code to find all
consecutive 0-block and the longest block.

Enter Binary String: 00100010
					  2   3 1

output: 

2
3
1
The longest is 3



Mission|
https://codestar.work/mission-cloud.pdf
https://artfully.app/check.html

______________________________________

Sentinel คือ ข้อมูลตัวสุดท้ายที่ทำให้โปรแกรมทำงาน

______________________________________

import java.util.*; // java.util.Scanner input = new java.util.Scanner(System.in);

class Start{
    public static void main(String[] z){
        Vote[] d = new Vote[3];
        d[0] = new Vote("Democrat", 82);
        d[1] = new Vote("Labor", 85);
        d[2] = new Vote("Liberty", 83);
        int total = 0;
        for(int i = 0; i < d.length; i++)
            total = total + d[i].point;            // ได้คะแนนรวมมาแล้ว
        for(int i = 0; i < d.length; i++){
            double percent = (double)d[i].point / total * 100 ;
        
        System.out.printf("%s %.2f\n", d[i].party, percent);
        }
    }
}

class Vote{
    String party;
    int point;
    Vote(String p, int s){
        party = p;
        point = s;
        
    }
}
