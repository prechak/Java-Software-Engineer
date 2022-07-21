import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

class Start{
    public static void main(String[] data){
        //ArrayList a = new ArrayList();
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<>();
        List<String> c = new ArrayList<>();
        var d = new ArrayList<String>();
        
        a.add("Latte");
        a.add("Mocha");
        a.add("Latte");
        a.add("Latte");
        
        //a.remove("Latte"); //remove first Latte
        //a.remove(3);         //remove from index
        Object o = a.get(0);
        System.out.println(a);
        
        int size = a.size();
        System.out.println(size);

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