
import java.util.Scanner;

class Strat{
    public static void main(String[] z){
        Ellipse e;
        e = new Ellipse(8.0, 5.0);
        double a = e.getArea();
        System.out.println(a);
    }
    
}

class Ellipse {
    Ellipse(double a, double b){
        major = a;
        minor = b;
    }
    double major;
    double minor;
    double getArea(){
        return Math.PI * major * minor;
    }
    
}
