import java.util.Scanner;

class Swapping {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take user input for number1
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        // Take user input for number2
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // Swap the numbers using a temporary variable
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Output the swapped result
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // Close the scanner
        input.close();
    }
}
