package main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.SpringVersion;
import org.springframework.context.support.GenericApplicationContext;

class Start {
    public static void main(String[] data) {
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        context.registerBean(Cashier.class);
        context.registerBean(Department.class);
        context.refresh();
        
        Department d = context.getBean(Department.class);
        double total = d.cashier.getTotal(120);
        System.out.println(total);
        
    }
}

class Department{
    @Autowired Cashier cashier;
    
    String name;
    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }
}

class Cashier{
    double thereshold = 100;    // Default
    void setThresold(double t){
        thereshold = t;
    }
    double getTheresold(){
        return thereshold;
    }
    double getTotal(double price){
        if(price >= thereshold){
            return price * 0.95;
            
        }
        return price;
    }
}
