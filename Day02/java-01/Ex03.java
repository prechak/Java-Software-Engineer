import java.util.Scanner;

class Start{
	public static void main(String[] data){
		System.out.println("Enter the Price:");
		Scanner input = new Scanner(System.in);
		double price = input.nextDouble();
		int left  = (int)price;
		double right = price - left;
		int tmp = 00;
		if(right >= 75) tmp = 75;
		if(right >= 50) tmp = 50;
		if(right >= 25) tmp = 25;
		System.out.println(left+"."+tmp);
	}
}
