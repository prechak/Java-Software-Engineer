package main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


class Start {
    public static void main(String[] data) {
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        
        
    }
}

@SpringBootApplication
class Setup {
    
    }
    
    
@RestController
class Sample {
    
    @RequestMapping("/check") // http://localhost:8080/check
    double showCheck(){
        return 123.4567;
    }
    // http://localhost:8080/get-total?price=150
    @RequestMapping("/get-total")
    double showTotal(double price){
        return 1.15 * price;
    }
    // http://locathost:8080/find-branch?city=Bangkok
    
    String[] branches = {"Bangkok", "London", "New York", "Paris" };
    @RequestMapping("/find-branch")
    boolean search(String city){
        boolean result = false;
        for(int i = 0; i < branches.length; i++){
            if(branches[i].equals(city)) {
                result = true;
            }
        }
        return result;
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