

macOS / Ubuntu
'--netbeans
	'--bin
		'-- netbeans64.exe
		'-- netbeans		--> Use this file

Windows
  C:\
	'-- tools
		'-- netbeans
		'	'-- bin
		'		'-- netbeans.exe	// NOT use this file
		'		'-- netbeans64.exe	// For Windows
		'		'-- netbeans		// For Linux and macOS
		'-- jdk	(jdk-18.0.1)		// Change name just jdk
		'	'-- bin
		'		'-- java.exe
		'
		-- sapmachine				// jdk มีหลายตัวเช่นอันนี้ของ sap
		'	'-- bin
		'		'-- java.exe
		'
		

// Checked --> \tools\jdk\bin\java -version
// Run	   --> \tools\netbeans\bin\netbeans64.exe --jdkhome \tools\jdk

For any OS, from NetBeans Main menu > Tools > Plugins > Installed > Select all > Activate

Next Week:
	https://codestar.work/spring-6.pdf
	https://codestar.work/spring.pdf
	https://codestar.work/spring-boot.pdf
							'-----------------> Maven

	https://codestar.work/java-stack.pdf

In a large project, you will need tools to manage source code and some packages 
that downloaded from the Internet

Package Manager:

in Java:
- Ant		Used to be the default package manage in NetBeans & Java EE
- Maven		Most popular to Java large project
- Gradle	Popular for Android develop

Python:		pip install Django	(Python Install Package)
Ruby:		gem install rails
PHP:		composer install laravel

MVC Web Allication Framework	//เกิดขึ้นใน Java เป็นที่แรก
Rudy on Rails (DRY, CoC)		// Handerson ไปเขียน MVC ใน Ruby
			   '    '
			   '	'----->	Convention over Configuration
			   '---------->	Don't Repeat Yourself

create folder "friday"
'-- pom.xml		(Project Object Model)
'-- src
	'-- main
		'-- java
			'-- Start.java

Windows								macOS / Ubuntu
cd \								cd ~
mkdir friday						mkdir friday
cd friday							cd friday
echo X > pom.xml					touch pom.xml
mkdir src							mkdir src
mkdir src\main						mkdir src/main
mkdir src\main\java					mkdir src/main/java
echo X > src\main\java\Start.java	touch src/main/java/Start.java


class Strat{
    public static void main(String[] z){
        Book b = new Book();
        b.title = "Sherlock Holmes";
        b.pages = 580;
        b.price = 270.0;
        b.showDetail();
        
    }
    
}

// Class ~ Data Type
class Book {
    String title;
    int pages;
    double price;
    void showDetail(){
        System.out.println(title + " " + pages + " " + price);
    }
}

----------------------------------------

class Strat{
    public static void main(String[] z){
        Book b = new Book("Sherlock Holmes", 580, 270.0);
        b.showDetail();
        
    }
    
}

class Book {
    Book(String t, int p, double x){        // Constructor
        title = t;  // รับ Sherlock Holmes
        pages = p;  // รับ 580
        price = x;  // รับ 270.0
    }
    String title;
    int pages;
    double price;
    void showDetail(){
        System.out.println(title + " " + pages + " " + price);
    }
}
-----------------------------------


import java.util.Scanner;

class Strat{
    public static void main(String[] z){
        Ellipse e;
        e = new Ellipse(8.0, 5.0);
        double a = e.getArea();
        System.out.println(a);
    }
    
}

class Ellipse {
    Ellipse(double a, double b){
        major = a;
        minor = b;
    }
    double major;
    double minor;
    double getArea(){
        return Math.PI * major * minor;     // Pi * r
    }
    
}















