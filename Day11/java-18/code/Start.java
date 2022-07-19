
class Start{
    public static void main(String[] z){
        Tool t = new Tool();
        Element first = t.build( 8, 5, 4, 2, 1, 9, 4, 7);
        Element second = t.cut(first);
        
        for(Element e = first; e != null; e = e.next)
            System.out.println();
        System.out.println();
        for(Element e = secondl e != null; e = e.next)
            System.out.println(e.number + " ");
    }
}

class Tool {
    Element create(int[] a){    // Accept Array
        Element head = null;
        Element last = null;
        for(int i = a.length - 1; i >= 0; i--){
            last = new Element();
            last.number = a[i];
            if(last == null) {last = e; }
        }
    }
    Element build(int ... a){   // Variadic Method
        Element first = null;
        Element last  = null;
        for(int i = 0; i < a.length; i++){
            Element e = new Element();
            e.number = a[i];
            if(head == null){
                first
                
            }
        }
    }
}

class Element {
    String name;    // default value null
    int number;     // default 0
    Element next;   // null
    
    
}