class List {
	public static void main(String[] data){
		double balance = 80000;
		int year = 0;
		while ( year <= 5) {
			System.out.println("Year " + year + " Balance : " + balance);
			double interest = 0.0125 * balance;
			balance += interest;
			year++;
		}
	}
}


