
class Start{
    public static void main(String[] data){
        int[] a = { 6, 8, 3, 5, 1, 9, 5, 6, 5, 6 };
        Node root = null;
        Helper h = new Helper();
        
        for(int i = 0; i < a.length; i++){
          root = h.insert(a[i], root);  
        }
        //System.out.println(root.value);
        h.print(root);
    }
}

class Helper {
    void print(Node c){
        if(c == null) return;
        print(c.left);
        System.out.println(c.value);
        print(c.right);
    }
    Node insert(int key, Node c){
        if(c == null){
            c = new Node();
            c.value = key;
            return c;
        }
        if(key < c.value) c.left = insert(key, c.left);
        if(key >= c.value) c.right = insert(key, c.right); // ใส่ = เข้าไปจะเก็บตัวซ้ำ
        return c;
    }
}

class Node{
    int value;
    Node left, right;
}

// In football, there are three result: W, D, L
// write code to print all possible results
// from 4 mathes.
class Engine {
    void play(String s){
        if(s.length() == 4){
            System.out.println(s);
            return;
        }
        play(s + "W");
        play(s + "D");
        play(s + "L");
    }
    void create(String s){
        if(s.length() == 3){
            System.out.println(s);
            return;
        }
        create(s + "W");
        create(s + "D");
        create(s + "L");
    }
    void show(int N){
        if(N==0) return;
        show(N-1);
        System.out.println(N);
    }
}