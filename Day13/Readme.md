
Day13:

Construcction (Developing)				Operation
										-> Install
										-> Help Desk
										-> Backuo
										-> Configure

Devops
Jenkins 	- Not Tomcat
			- Use Eclipse Web Server

Docker 		- Share CPU / Hard Disk / Memory
			- Has its own OS, Application

Non-Primitive Data
- Class
- Interface
- Enum
- Record

Type of Data (Data Type_

'-- java-20
	'-- pom.xml
	'-- code
	'	'-- Start.java
	'-- test
		'-- Test.java
	
FILE: code/Start.java

class Start{
    public static void main(String[] data){
        Book b = new Book();
        b.code = "123456";
        b.price = 250.0;
        double t = b.getSpecialPrice();
        System.out.println(t);
    }
}

class Product {
    String code;
    double price;
    double getSpecialPrice(){
        return this.price * 0.90;
    }
}

// Create a subtype of Product
class Book extends Product { }
    // '-----------------------------> Define superclass or subtype
// Write a method getSpecialPrice() in Book to discount by 15%
// in Book to discount by 15%
// extends คือ ขยาย
// Book ขยายมาจาก Product

===============================

class Book extends Product { 
    double getSpecialPrice() {
        double previous = super.getSpecialPrice();
        return previous * 0.97;
    }
}

===============================

Java Annotation: @Deprecated, @Override

The keyword "new":			use for createing an instance
The keyword "instanceof":	use for checking an instance with class

===============================

class Start{
    public static void main(String[] data){
        Vehicle[] all = { new Car(), new Truck(),
                          new Truck(), new Car(),
                          new Car(), new Car() };
    // Write code to count number of instance of Car
        int count = 0;
        for(int i = 0; i < all.length; i++){
            if(all[i] instanceof Car) {
                System.out.println("OK");
                count++;
            }
        }
        System.out.println("Count is" + count);
        for(Vehicle v : all){
            if(v instanceof Car){
                System.out.println("Yes");
            }
        }

        Truck t = new Truck();
        System.out.println( t instanceof Truck ); //true
        System.out.println( t instanceof Vehicle); //true
        System.out.println( t instanceof Object);   //true
    }
}

class Vehicle{ }
class Car extends Vehicle { }
class Truck extends Vehicle { }

==========================================

In some language, e.g. VB.net

class Car inherits Vehicle { }



Computer Languages:
'-- Root Class: Java, C#, JavaScript
'-- No Root Class: C++, Swift

in Java,

class User { }
			'----> extends Object

===========================================

Multiple Superclasses : C++, Python

class User { }
class Yearly { }

class Premium extends User, Yearly { }


Single Superclasses: Java, C#, Swift, JavaScript
class A { }
class B { }
class C extends A { }		// OK
class D extends A, B { }	// Error


Interface
interface I { }
interface J { }
interface K extends I, J { } // OK

Java  - Interface
C# 	  - Interface
Swift - Protocol


In Java, interface usually ending with -able, -ible
e.g 
Runnable - it can run independently

Multiple threading application
in Java has 2 way

-> class Printer extends Thread { }
-> class Worker implements Runnable { }

Create thread in Java
=====================
class Start{
    public static void main(String[] data){
        Printer p = new Printer();
        p.start();  //start() will initialize CPU
                    // and call run() for you
        for(int i = 0; i < 1000; i++){
            System.out.print('A');
        }
    }
}

class Printer extends Thread {
    @Override
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.print('P');
        }
    }
}
====================//Update

class Start{
    public static void main(String[] data){
        Printer p = new Printer();
        p.start();  //start() will initialize CPU
                    // and call run() for you
        Worker w = new Worker();
        Thread t = new Thread(w);
        t.start();
        for(int i = 0; i < 1000; i++){
            System.out.print('A');
        }
    }
}

class Worker implements Runnable{
    @Override public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.print('W');
        }
    }
}

======================

Sorting in Java: Comparable, Comparator

interface Comparable {
	int compareto(Object x);
}

interface Comparator {
	int compare(Object x, Object y);
}

Tricotomy: 
Let u and v are real number. The following situation will be exclusively true.
1. u < v			return -1
2. u > v			return +1
3. u = v			return 0

Three-Way Comparison

 import java.util.*;

class Start{
    public static void main(String[] data){
        Team[] list = { new Team("Bangkok", 3, 5, 4),
                        new Team("Pattaya", 2, 7, 3),
                        new Team("Chiang Mai", 4, 3, 1)
                       };
		Arrays.sort(list, (p,q) -> p.gold - q.gold);
        //Arrays.sort(list, new SportComparator());
        for (Team t : list) System.out.println(t);
        
    }
}

class SportComparator implements Comparator{
    @Override
    public int compare(Object x, Object y){
        /* Team u = (Team)x;
        Team v = (Team)y;
        if(u.gold > v.gold) return -1;
        if(u.gold < v.gold) return +1;
        if(u.silver > v.silver) return -1;
        if(u.silver < v.silver) return +1;
        if(u.bronze > v.bronze) return -1;
        if(u.silver < v.silver) return +1;
        return 0; */
		return u.gold - v.gold;
    }
}

class Team {
    Team(String name, int gold, int silver, int bronze){
        this.name = name;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
    }
    String name;
    int gold, silver, bronze;
    
    @Override
    public String toString(){
        return name;
    }
}

==================================

Comparing in CPU instruction, CMP = CISC - RISC (MINUS)

Complex Instruction Set Computer : CISC - contains many instruction
Reduce Instruction Set Computer  : RISC - contain only few instructions



