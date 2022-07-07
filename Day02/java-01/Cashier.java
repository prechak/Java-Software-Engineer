import java.util.Scanner;

class Cashier{
	public static void main(String[] data){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Price: ");
		double price = input.nextDouble();
		int left = (int)price;
		double right = price - left;
		double tmp = 0.00;
		if(right >= 0.25) tmp = 0.25;
		if(right >= 0.50) tmp = 0.50;
		if(right >= 0.75) tmp = 0.75;
		System.out.println( left + tmp );
	
	}

}
