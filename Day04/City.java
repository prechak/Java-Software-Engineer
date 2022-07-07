class Start{
	public static void main(String[] data){
		String[] city;			// city is an array of String
		city = new String[5];	// create array of 5 slots, each slot is String
		city[2] = "Bangkok";
		int i = 0;
		while ( i < city.length) {
			System.out.println( city[i]);
			i++;
		}
	}
}
