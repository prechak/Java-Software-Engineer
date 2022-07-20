
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
    }
}

class Vehicle{ }
class Car extends Vehicle { }
class Truck extends Vehicle { }

==========================================

