package main;
import org.springframework.context.ApplicationContext;
import org.springframework.core.SpringVersion;
import org.springframework.context.support.GenericApplicationContext;

class Start {
    public static void main(String[] data) {
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        context.registerBean(Party.class);
    }
}


class Party {
    int point;
    void setName(String name){  // Writable property
        
    }
    void setPoint(int point){   // When hava set is Writable property
        this.point = point;
    }
    boolean isOK(){
        return point >= 50;     // Readable
    }
}