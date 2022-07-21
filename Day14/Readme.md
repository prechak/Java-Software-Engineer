

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

List - A data structure that keep data without knowing the size
'-- LinkedList	คือ List ที่สร้างจากการเชื่อมโยง Instance
'-- ArrayList คือ List ที่สร้างจาก Array ที่ขยายตัวได้ (Dynamic Array)

interface List { 
	boolean add(Object x);
	boolean remove(int index);
	boolean remove(Object x);
	Object get(int index);
}

class LinkedList implements List { }

class ArrayList implements List { }

Set - A data structure that keep only unique data
'--
'--

Map - A data structure that keep value in pair
'--
'--



In Mathematics:
A = { 2, 5, 8, 9 }
B = { 2, 2, 5, 5, 5, 8, 8 }

A = B

C = { 5, 8, 2, 9 }

A = C