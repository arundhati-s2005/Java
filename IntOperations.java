import java.util.Scanner;
class IntOperations{
	public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter first number:");
   int a=input.nextInt();
   System.out.print("Enter second number:");
   int b=input.nextInt();
   System.out.print("Enter third number:");
   int c=input.nextInt();
   int op1=a + b *c;
   int op2=a * b + c;
   int op3=c + a / b;
   int op4=a % b + c;
   System.out.println("The operation1"+op1+" operation2 "+op2+" operation3 "+op3+" operation4 "+op4);
   input.close();
	}
}
