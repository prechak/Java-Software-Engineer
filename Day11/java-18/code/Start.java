
class Start{
    public static void main(String[] data){
        Node root;
        root = new Node();
        root.name = "David";
        root.number = 7;
        
        root.right = new Node();
        root.right.name = "Micheal";
        root.right.number = 10;
        
        root.right.right = new Node();
        root.right.right.name = "Stephen";
        root.right.right.number = 4;
        
        Node x = new Node();
        x.name = "Frank";
        x.number = 8;
        
        root.left = x;
        Helper h = new Helper();
        h.print(root);
           
    }
}
class Helper{
    void print(Node c){
        if( c == null) return; // Base Case
        System.out.println(c.name);
        print(c.left);
        print(c.right);
    }
}

class Node {
    String name;    //null
    int number;     // 0
    Node left;      // null
    Node right;     // null
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