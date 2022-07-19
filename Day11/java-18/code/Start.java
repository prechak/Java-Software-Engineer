
class Start{
    public static void main(String[] data){
        int[] a = { 3, 6, 8, 4, 2, 1, 9 };
        Helper h = new Helper();
        Node root = h.build(a);
        //h.display(root);
        h.show(root, "");
           
    }
}
class Helper{
    void show(Node c, String s){
        if(c == null) return;
        if(c.left == null && c.right == null){
            System.out.println(s + c.number);
            return;
        }
        show(c.left,  s + c.number);
        show(c.right, s + c.number);
    }
    int sum(Node c){
        if(c == null) return 0;
        return c.number + sum(c.left) + sum(c.right);
    }
    void display(Node c){
        if(c == null) return;
        System.out.println(c.number);
        display(c.left); display(c.right);
    }
    Node build(int[] a){
        int mid = a.length / 2;
        Node c = new Node();
        c.number = a[mid];
        c.left = build(a, 0, mid -1);
        c.right = build(a, mid+1, a.length -1);
        return c;
    }
    Node build(int[] a, int left, int right){
        if(left > right) return null;
        int mid = (left+right) /2;
        Node c = new Node();
        c.number = a[mid];
        c.left = build(a, left, mid -1);
        c.right = build(a, mid+1, right);
        return c;
    }
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