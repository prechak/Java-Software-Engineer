
Day12:

Merge Sort
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

Write code to print binary string length N
N=3		000 001 010 011 100 101 110 111



