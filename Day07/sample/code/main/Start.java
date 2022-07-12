package main;
import org.springframework.context.ApplicationContext;
import org.springframework.core.SpringVersion;
import org.springframework.context.support.GenericApplicationContext;

class Start {
    public static void main(String[] data) {
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        context.registerBean(Party.class);
        context.registerBean(Member.class);
        context.registerBean(Cashier.class);
        context.refresh();
        
               
    }
}

class Cashier{
    double thereshold = 100;
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

class Setup {
    Setup(GenericApplicationContext c){
        context = c;
    }
    GenericApplicationContext context;
    void go(){
        Party p = (Party)context.getBean(Party.class);
        p.setName("Liberty");
        p.setPoint(42);
    }
}

class Party {
    int point;
    public void setName(String name){  // Writable property
        
    }
    public void setPoint(int point){   // When hava set is Writable property
        this.point = point;
    }
    public boolean isOK(){
        return point >= 50;     // Readable
    }
}

class Member{}