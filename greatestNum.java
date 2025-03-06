import java.util.Scanner;
class greatestNum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter num1: ");
		int num1= input.nextInt();
		
		System.out.println("Enter num2: ");
		int num2= input.nextInt();
		
		System.out.println("Enter num3: ");
		int num3= input.nextInt();
		
		if ( num1 < num3 && num1 < num2){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		input.close();
	}
}
