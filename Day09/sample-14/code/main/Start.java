package main;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

class Start{
    public static void main(String[] data){
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
        
        Team t = context.getBean(Team.class);
        System.out.println(t.getManager().getSalary() );
        
        SpringApplication.exit(context);
    }
    
}

@SpringBootApplication
class Setup{
    @Bean("primary")
    Team createTeam(@Qualifier("second")Manager m){      //parameter injection
        Team t = new Team();
        t.setName("Laliga - Barcelona");
        t.setManager(m);
        return t;   //if return t manager is null
    }
    
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

class Team{
    String isoName;
    void setName(String name){
        isoName = name;
    }
    Manager head;
    String getName(){
        return isoName;
    }
    void setManager(Manager m){     // Manual Injection
        head = m;
    }
    Manager getManager(){
        return head;
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