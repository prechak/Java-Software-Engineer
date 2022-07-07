class Start{
	public static void main(String[] data){
		Shirt s = new Shirt();	// Allocate memory space
		s.size = 'L';
		s.price = 180.0;
		double total = s.getSpecialPrice();
		System.out.println(total);
		
	}
}

class Shirt {
	char size;
	double price;
	double getSpecialPrice() {
		if( size == 'S' ) return price * 0.97;
		if( size == 'M' ) return price * 0.95;
		if( size == 'L' ) return price * 0.93;
		return price;
	}
}
