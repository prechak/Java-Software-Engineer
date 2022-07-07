import java.util.Scanner;

class Vending{
	public static void main(String[] data){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Change: ");
		int cash = input.nextInt();
		if(cash < 0){
			System.out.println("Please enter positive value: ");
			return;
		}
		int a = cash/10;
		cash = cash - ( 10 * a);
		int b = cash/5;
		cash = cash - ( 5 * b);
		int c = cash/2;
		cash = cash - ( 2 * c);

		System.out.println("10 x " + a);
		System.out.println(" 5 x " + b);
		System.out.println(" 2 x " + c);
		System.out.println(" 1 x " + cash);
		
		
		
		
	}
}
