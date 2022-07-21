

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