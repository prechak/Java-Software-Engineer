class Start{
	public static void main(String[] data){
		Student s; 		// create a variable s, no default value
		s = new Student();	//allcate memory, return address to s
		System.out.println(s);	// 0x123456 ---> address
		System.out.ptintln(s.name);	//null
	}
}

class Student{
	String name;	// null
	double score;	// 0.0
}
