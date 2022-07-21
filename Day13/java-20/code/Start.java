import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;

class Start{
    public static void main(String[] data){
        TreeMap<String, Integer> storage = new TreeMap<>();
        storage.put("Bang Rak", 10500);
        storage.put("Bang Plad", 10700);
        storage.put("Patumwan", 10330);
        
        storage.put("Bang Rak", 10501);     // มาทีหลังเลือกอันหลัง
        
//        Integer w = storage.get("Bang Rak");
//        System.out.println(w);

          for(String s : storage.keySet()) {
              System.out.println(s);
          }
    }
}