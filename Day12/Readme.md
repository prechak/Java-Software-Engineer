
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




