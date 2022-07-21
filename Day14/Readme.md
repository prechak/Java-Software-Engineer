

Day13:

Non-Primitive
- Class
- Interface for create multiple supertype
- Enum					'---------------------> Multiple Inheritance
- Record

interface Runnable { 
	void run();
}

interface Comparable {
	int compareTo(Object o);
}

interface Comparator {
	int compare(Object x, Object y);
}


class Player implements Comparable {
	String name;
	int number;
	public int compareTo(Object x){
		return 0;
	}	
}

// class - class			extends
// class - interface		implements
// interface - interface 	extends


final class		---> not allow ti have subclass
  final class String

final class W { }
class X extends W { } // Error


JSP
<%
	String query = request.getParameter("XXX");
	out.println(...);
%>

Array is Java is smimilar to C, which is a low level array.
You must know the size of data before allocating spcace.

In practical, it is very to know the size.

====================
import java.util.*;

class Start{
    public static void main(String[] data){
        
//        int c = "Latte".compareTo("Mocha");
//        System.out.println(c);
        
        Player[] list = { new Player("David", 7),
                          new Player("Micheal", 10),
                          new Player("Frank", 8),
                          new Player("John", 2)
                        };
        Arrays.sort(list);
        for(Player p : list){
            System.out.println(p.name);
        }
    }
}

class Player implements Comparable{
    String name;
    int number;
    
    Player(String name, int number){
        this.name = name;
        this.number = number;
    }
    
    @Override
    public int compareTo(Object o){
        Player p = (Player)o;
//        if (this.number < p.number) return -1;
//        if (this.number > p.number) return +1;
//        return 0;
          return this.name.compareTo(p.name);
    }
}


=======================



List - A data structure that keep data without knowing the size
'-- LinkedList	คือ List ที่สร้างจากการเชื่อมโยง Instance
'-- ArrayList คือ List ที่สร้างจาก Array ที่ขยายตัวได้ (Dynamic Array)

interface List { 
	boolean add(Object x);
	int size;
	boolean remove(int index);
	boolean remove(Object x);
	Object get(int index);
}

class LinkedList implements List { }

class ArrayList implements List { }

Set - A data structure that keep only unique data (ไม่เก็บตัวซ้ำ) equals(), compareto()
'-- TreeSet คือ Set ที่สร้างจาก Binary Search Tree มี 20 แบบ, (Red Black Tree)
	TreeSet เป็น Red Black Tree ซึ่งเป็น Binary Search Tree แบบหนึ่ง

Map - A data structure that keep value in pair
'--
'--



In Mathematics:
A = { 2, 5, 8, 9 }
B = { 2, 2, 5, 5, 5, 8, 8 }

A = B

C = { 5, 8, 2, 9 }

A = C

========================

How to use ArrayList
--------------------

		//ArrayList a = new ArrayList();
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<String> b = new ArrayList<>();
        List<String> c = new ArrayList<>();
        var d = new ArrayList<String>();