import java.util.Scanner;
class Divisibility{
	public static void main(String [] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the age: ");
		 int number = input.nextInt();
		 if (number%5==0){
			 System.out.println("The given number is divisible by 5");
		 }
		 else{
			 System.out.println("The given number is not divisible by 5");
		 }
		input.close();
	}
}
		 