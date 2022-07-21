import java.util.Set;
import java.util.TreeSet;

class Start{
    public static void main(String[] data){
        TreeSet<String> s = new TreeSet<>();
        s.add("Latte");
        s.add("Mocha");
        s.add("Cappuccino");
        s.add("Mocha");
        s.add("Latte");
        System.out.println(s);

    }
}