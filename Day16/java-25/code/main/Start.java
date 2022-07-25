package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@RestController
//class Start{
//    public static void main(String[] data){
//        ApplicationContext context;
//        context = SpringApplication.run(Setup.class);
//    }
//    @RequestMapping("/check")
//    double showCheck(){
//        return 456.789;
//    }
//}





class Start{
    public static void main(String[] data){
        ApplicationContext context;
        context = SpringApplication.run(Setup.class);
    }
}

@SpringBootApplication
class Setup{
    // create bean here
    @Bean("dataSource")
    DriverManagerDataSource connect(){
        DriverManagerDataSource source;
        source = new DriverManagerDataSource();
        source.setUrl(connectionString);
        return source;
    }
    String connectionString = "jdbc:mysql://127.0.0.1/online?user=jeff" + "&password=bezos";
}

@RestController
class Sample{
    @RequestMapping("/check")
    double showCheck(){
        return 123.456;
    }
}
