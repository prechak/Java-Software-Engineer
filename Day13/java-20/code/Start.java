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
class Book extends Product { 
    double getSpecialPrice() {
        double previous = super.getSpecialPrice();
        return previous * 0.97;
    }
}
    // '-----------------------------> Define superclass or subtype
// Write a method getSpecialPrice() in Book to discount by 15%
// in Book to discount by 15%