package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

class Start{
    public static void main(String[] data){
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        
        //Manager current = context.getBean(Manager.class);
        Manager current = (Manager)context.getBean("second");
        System.out.println( current.getSalary() );
        
        SpringApplication.exit(context);
    }
    
}

@SpringBootApplication
class Setup{
    @Bean("first")
    Manager createManager(){
        Manager m = new Manager();
        m.setName("Frank Lampard");
        m.setSalary(60000.0);
        return m;
    }
    @Bean("second")
    Manager createSecond(){
        Manager m = new Manager();
        m.setName("Stephen Gerrard");
        m.setSalary(55000.0);
        return m;
    }
}

class Manager{
    String fullname;                // Field
    void setName(String name){      // writable property
        fullname = name;
    }
    String getName(){               // readable property
        return fullname;
    }
    double salary;                  // Field
    void setSalary(double salary){  // Writable Proper
        this.salary = salary;
    }
    double getSalary(){             // Readable Property
        return salary;
    }
}