import java.util.*; // java.util.Scanner input = new java.util.Scanner(System.in);
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext; // ถ้าทำถูกมันจะ import ได้


class Start{
    public static void main(String[] z){
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("configuration.xml")
        Cashier primary = (Cashier)context.getBean("front");
        double total = primary.showTotal(200);
        System.out.println("Total is " + total);
    
    
    }
}

class Cashier{
    double multiplier = 1.0; // Field
    
    public void setTax(double t){       // Writable Property
        multiplier = (100.0 + t) / 100.0 ;
        
    }
    double showTotal(double price){
        return price * multiplier;
    }
}   // active
    // passive - inversion of control 
    //  -timer
    //  -configuration
    // application = program
    // context = environment (in spring call application context)