import java.util.Scanner;	//Utility สิ่งอำนวยความสะดวก

class User{
	public static void main(String[] data){
	char grade = 'F';
	System.out.println("Enter your score");
	Scanner input = new Scanner(System.in);
	double score = input.nextDouble();
	if (score >= 50) grade = 'D';
	if (score >= 60) grade = 'C';
	if (score >= 70) grade = 'B';
	if (score >= 80) grade = 'A';
	System.out.println(grade);
	}
}
