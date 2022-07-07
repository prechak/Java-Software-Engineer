import java.util.Scanner;

class Start{
	public static void main(String[] z){
		System.out.println("Enter Text: ");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();	// AABBAAAA
		char[] a = s.toCharArray();	// A is 7, B is 2
		int count = 0;
		int i = 0;
		while(i < a.length){
			if(a[i] == 'A'){
			count++;
		}
		i++;
		}
		System.out.println("A is " + count);
		System.out.println("B is " + (a.length - count));
	}
}
