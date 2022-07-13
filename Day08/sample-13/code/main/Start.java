package main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        Cashier c = context.getBean(Cashier.class);
        double t = c.getTotal(180.0);
        System.out.println(t);
        SpringApplication.exit(context);
        
    }
}

@SpringBootApplication
class Setup {
    @Bean Cashier createCashier(){
        Cashier c = new Cashier();
        c.setTax(20.0);
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