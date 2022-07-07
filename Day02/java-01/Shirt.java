class Start{
	public static void main(String[] z){
	Shirt s = new Shirt();
	s.size = 'M';
	s.price = 180.0;
	System.out.println(s.price);
	}
}

class Shirt {
	char size;
	double price;
}
