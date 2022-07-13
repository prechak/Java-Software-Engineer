package main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;
import org.springframework.context.support.GenericApplicationContext;

class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = new AnnotationConfigApplicationContext
                                        (Setup.class);
        //Cashier c = context.getBean(Cashier.class);
        Cashier c = (Cashier) context.getBean("xxx");
        double total = c.getTotal(180.0);
        System.out.printf("%.2f\n", total);
    }
}

//@Configuration ไส่ไม่ใส่ก็ได้
class Setup {
    @Bean 
        Cashier xxx(){
        Cashier c = new Cashier();
        c.setTax(15.0);
        return c;
    }
    @Bean 
        Cashier yyy(){
        Cashier c = new Cashier();
        c.setTax(10.0);
        return c;
    }
    
}

class Cashier {
    double multiplier = 1.0;
    
    void setTax(double t){
        multiplier = (100.0 + t) /100;
    }
    
    double getTotal(double price){
        return price * multiplier;
    }
}