import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;

class Start{
    public static void main(String[] data){
        String[][] all = { 
                                {"Lemonade", "Cola", "Water"},
                                {"Fried Rice", "Kaprao Rice"},
                                {"Bua Loy", "Lod Chong", "Sticky Rice Mango" }
                          };
        for(int d = 0; d < all[0].length; d++){
            for(int r = 0; r < all[1].length; r++) {
                for (int s = 0; s < all[2].length; s++) {
                    System.out.println(d + " " + r + " " + s);
                }
            }
        }
        
//        TreeMap<String, Integer> storage = new TreeMap<>();
//        storage.put("Bang Rak", 10500);
//        storage.put("Bang Plad", 10700);
//        storage.put("Patumwan", 10330);
//        
//        storage.put("Bang Rak", 10501);     // มาทีหลังเลือกอันหลัง
//        
//        Integer w = storage.get("Bang Rak");
//        System.out.println(w);
//
//          for(String s : storage.keySet()) {
//              System.out.println(s);
          }
    }
}