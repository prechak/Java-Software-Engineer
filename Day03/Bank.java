class Start{
	public static void main(String[] data){
	Bank b = new Bank();
	//double total = g(g(g(8000)));
	double total = b.g( b.g( b.g( 8000 ) ) );
	System.out.println( total );
	}
}

class Bank{
	double f(double b){	
		return b * 0.0125;
	}
	double g(double b){
		return b * 0.0125 + b;
	}
}
