import java.util.Scanner;
class level2Q3 {
	public static void main(String[]args) {
	Scanner input = new Scanner(System.in);
    System.out.print("Enter Perimeter of the Square:");
    int square = input.nextInt();
    double side=square/4;
    System.out.println("The side of the Square is = "+side);
    input.close();
	}
}
	