
import java.util.Scanner;

class Strat{
    public static void main(String[] z){
        Cashier c = new Cashier(270.0);
        double total = c.getTotal();
        System.out.println(total);
        // Discount 5% for price at least 100.0
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

class Cashier{
    Cashier(double c){
        cash = c;
    }
    double cash;
    double getTotal(){
        if( cash > 100) 
        return cash * 0.95;
        return 0;
    }
}

