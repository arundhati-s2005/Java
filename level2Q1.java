//Write a program to create a basic calculator that can perform addition, subtraction, multiplication, and division. The program should 
//ask for two numbers (floating point) and perform all the operations
//Hint => 
//Create a variable number1 and number 2 and take user inputs.
//Perform Arithmetic Operations of addition, subtraction, multiplication and division and assign the result to a variable 
//and finally print the result
//I/P => number1, number2
//O/P => The addition, subtraction, multiplication and division value of 2 numbers ___ and ___ is ___, ____, ____, and ___

import java.util.Scanner;
class level2Q1 {
	public static void main(String[]args) {
		Scanner scanner=new Scanner (System.in);
		System.out.print("Enter the first number");
		int number1 =scanner.nextInt();
		System.out.print("Enter the second number");
		int number2 =scanner.nextInt();
		
		int sum=number1+number2;
		int subtraction=number1-number2;
		int multiplication=number1*number2;
		int division=number1/number2;
		
		System.out.println("The sum is" +sum+ "difference is" +subtraction+ "product is" +multiplication+ "division is" +division);
		scanner.close();
	}
}
