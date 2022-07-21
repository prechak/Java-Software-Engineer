import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Start{
    public static void main(String[] data){
        ArrayList a = new ArrayList();
        a.add("Latte");
        a.add(5);   // convert to instance of Integer
        a.add(7.5); // convert to instance of Double
        a.add("Mocha");
        a.add("Latte");
        a.add("Latte");
        
        //a.remove("Latte"); //remove first Latte
        a.remove(3);         //remove from index
        System.out.println(a);
        
        for(Object o : a){
            if( o instanceof String){
            System.out.println(o);
            }
        }
        // Write code to print only instanceof String
    }
}

class Player implements Comparable{
    String name;
    int number;
    
    Player(String name, int number){
        this.name = name;
        this.number = number;
    }
    
    @Override
    public int compareTo(Object o){
        Player p = (Player)o;
//        if (this.number < p.number) return -1;
//        if (this.number > p.number) return +1;
//        return 0;
          return this.name.compareTo(p.name);
    }
}