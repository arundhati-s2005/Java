import java.util.Scanner;
class QuotientRemainder{
	public static void main(String[] args){
            Scanner input = new Scanner(System.in);
           System.out.print("Enter the first number:");
           double number1=input.nextDouble();
           System.out.print("Enter the second number:");
           double number2=input.nextDouble();
           double quotient=number1%number2;
           double remainder=number1/number2;
      System.out.println("The quotient is "+quotient+"and the remainder is"+remainder);
      input.close();
	  }
}
