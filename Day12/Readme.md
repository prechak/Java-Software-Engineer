
Day12:

Merge Sort ~ Use Buffer
https://codestar.work/java-05.pdf

Imperative 
where functions are implicitly
coded in every step required
to solve a problem

Bohm & Jacopini Theorem
=======================
ไม่ว่าจะเขียน Code เพื่อสร้างระบบอะไรก็ตาม
จะเขียน Web Service, Social Media,
Deep Learning, Machine Learning หรืออะไรก็ตาม
สามารถใช้โครงสร้าง 3 อย่างนี้ เขียนได้เสมอ
- Sequential
- Condition
- Iteration

Sequential 
A --> B --> C

Condition
A --> if --> B --> C
     '-- true------^

Iteration
A --> while -- B     C
      ^--------'     '
	  '--------------'


Functional Programming
- Sequentail
- Condition
- Functional

e.g Write code to print 1 ... N using 1. Loop 2. Functional

1.
int i = 1;
while (i < N) {
	System.out.println(i);
	i++;
}

-----

Print 1 ... N without loop, use functional programming or recursive fuction

class Start{
    public static void main(String[] data){
        Engine e = new Engine();
        e.create("");
    }
}

class Engine {
    void create(String s){
        if(s.length() == 3){
            System.out.println(s);
            return;
        }
        create(s + "0");
        create(s + "1");
		//create(s + "W");
		//create(s + "D");
		//create(s + "L");
    }
    void show(int N){
        if(N==0) return;
        show(N-1);
        System.out.println(N);
    }
}

===================

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

===============================

Write code to print binary string length N
N=3		000 001 010 011 100 101 110 111

Gauss ~ Fourier Transform
=====
An + An-1 + An-2 + ... + A0
Bn + Bn-1 + Bn-2 + ... + B0

John von Neumann
================
Top Secret ~ Merge Sort (Sort by Merging)

A0 A1 A2 ... An

Tony Hoare ~ Quick Sort
==========
ใช้หลักการเดียวกับ Gauss แต่กลับด้าน

Divine & Conquer ~ 1972

=======================


class Start{
    public static void main(String[] data){
        int[] a = { 3, 6, 8, 4, 2, 1, 9 };
        Helper h = new Helper();
        Node root = h.build(a);
        h.display(root);
           
    }
}
class Helper{
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

=====================

Binary Tree			--> Expresstion Tree --> ไม่่ค่อยมีประโยชน์เท่าไหร่
Binary Search Tree 	--> ค่าด้านซ้ายจะน้อยกว่า parent ค่าด้านขวาจะมากกว่า 
						ถ้าเท่ากันตัดทิ้ง


class Start{
    public static void main(String[] data){
        int[] a = { 3, 6, 8, 4, 2, 1, 9 };
        Helper h = new Helper();
        Node root = h.build(a);
        //h.display(root);
        //h.show(root, "");
        h.go(root, 0);
           
    }
}
class Helper{
    void go(Node c, int s) {
        if(c == null) return;
        if(c.left == null && c.right == null){
            System.out.println( s * 10 + c.number);
            return;
        }
        go(c.left, s * 10 + c.number);      //เคิมหลักเข้าไปโดยการ * 10
        go(c.right, s * 10 + c.number);
    }
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

================================


Storing one value to a variable, you don't need any structure.

Stroring multiple values, you need a structure.

1. Array
2. Linked List
3. Binary Tree ~ Expresstion Tree (2+3)-(2*1)
4. Binary Search Tree  (B-Tree ~ running on harddisk)
5. Matrix (Table[][])





