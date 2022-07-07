class Start{
	public static void main(String[] data){
		int [] a;		// create variable “a” as an array of integer
		a = new int[5];	// allocate 5 slots of integer
					// each slot has default value of 0
		// a = [ 0, 0, 0, 0, 0 ]
		//	    0, 1, 2, 3, 4 <——— index
		a[3]	= 7;
		// a	= [ 0, 0, 0, 7, 0 ]
		//a[5] = 12;		// Error
		System.out.println( a.length ); // 5
	}
}
