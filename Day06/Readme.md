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

custom folder
'-- pom.xml
'-- code
'	'-- Start.java
'-- test
	'-- Test.java

FILE: pom.xml
<project>
	<modelVersion> 4.0.0 </modelVersion>
	<groupId>iCoffee</groudId>
	<artifactId> 0.85 </version>

	<properties>
		<maven.compiler.source> 18 </maven.complier.source>
		<maven.compiler.target> 18 </maven.complier.target>
	</properties>

	<build>
		<sourecDirectory> code </sourseDirectory>
		<testSourceDirectory> test </testSourceDirectory>
	</build>

</project>




