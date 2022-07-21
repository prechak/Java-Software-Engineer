import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;

class Start{
    public static void main(String[] data){
        HashSet<String> set = new HashSet<>();
        
        set.add("Latte");
        set.add("Mocha");
        set.add("Latte");
        set.add("Espresso");
        
        System.out.println( set );

    }
}