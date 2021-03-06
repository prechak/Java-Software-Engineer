import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

class Start{
    public static void main(String[] data){
        try{
            File f = new File("data.txt");
            Scanner in = new Scanner(f);
            while(in.hasNextLine()){
                String s = in.nextLine();
                String[] a = s.split(",");
                raw.add(a);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        int count = 0;
        String all = new String[raw.size()][];
        for(Object o : raw){
            String[] a = (String[])o;
            all[count] = a;
            count++;
        }
        
        String[][] a = { 
                                {"L", "C", "W"},
                                {"FR", "KR"},
                                {"BL", "LC", "SRM" }
                          };
        
        ArrayList<String> everything = new ArrayList<>();
        Tool t = new Tool();
        t.list(0, "", all, everything);
        System.out.println(everything);
        System.out.println(everything.size());
    }
}

class Tool{
    void list(int layer, String result, String[][] all, ArrayList everything){
        if(layer == all.length){
            everything.add(result);
            return;
        }
        for(int i = 0; i < all[layer].length; i++){
            //result += all[layer][i] + "/";
            var sep = "/";
            if(layer == all.length-1) sep = "";
            list(layer+1, result + all[layer][i]+"/", all, everything);
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