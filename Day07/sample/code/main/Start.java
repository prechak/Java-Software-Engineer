package main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.SpringVersion;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

class Start {
    public static void main(String[] data) {
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        context.registerBean(Cashier.class);
        context.registerBean(Department.class);
        context.refresh();
//        Setup s = new Setup(context);
//        s.Start();
//        
        Department d = context.getBean(Department.class);
        double total = d.cashier.getTotal(120);
        System.out.println(total);
        
    }
}

class Setup{
    Setup(GenericApplicationContext c){
        context = c;
    }
    GenericApplicationContext context;
    void Start(){
        Cashier c = context.getBean(Cashier.class);
        Department d = context.getBean(Department.class);
        d.cashier = c;      // Dependency Injection
        //d.setCashier(c);
    }
}

class Department{
    public Department(Cashier c) {
        cashier = c;
    }
    Cashier cashier;
    
    void setCashier(Cashier c){
        cashier = c;
    }
    
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
