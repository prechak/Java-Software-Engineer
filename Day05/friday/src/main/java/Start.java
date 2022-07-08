
import java.util.Scanner;

class Strat{
    public static void main(String[] z){

        Total [] total = {  new Total("Liberty", 85),
                            new Total("Democrat", 72),
                            new Total("Labour", 89) };
        if(total.length == 0) {
        System.out.println("NO DATA");
        return;
        }
        int best = 0;   // let the first element is the best
        
        int i = 0;
        while(i < total.length){
            //System.out.println( total[i].name + total[i].point );
            if(total[i].point > total[best].point){
                best = i;
            }
            i++;
        }
        System.out.println( total[best].name );
    }
    
}

class Total{
    Total(String p, int v){
        name = p;
        point = v;
    }
    String name;
    int point;
}

class Ellipse {
    Ellipse(double a, double b){
        major = a;
        minor = b;
    }
    double major;
    double minor;
    double getArea(){
        return Math.PI * major * minor;     // Pi * r
    }
    
}

class Cashier{
    Cashier(double c){
        cash = c;
    }
    double cash;
    double getTotal(){
        if( cash < 100) return cash;
        return cash * 0.95;
    }
}

