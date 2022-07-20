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


class Product {
    String code;
    double price;
    double getSpecialPrice(){
        return this.price * 0.90;
    }
}

// Create a subtype of Product
class Book extends Product { 
    @Override
    double getSpecialPrice() {
        double previous = super.getSpecialPrice();
        return previous * 0.97;
    }
}
    // '-----------------------------> Define superclass or subtype
// Write a method getSpecialPrice() in Book to discount by 15%
// in Book to discount by 15%