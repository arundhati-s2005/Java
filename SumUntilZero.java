import java.util.Scanner;

class SumUntilZero {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the total to 0.0 (double type)
        double total = 0.0;
        
        // Variable to store the user input
        double userInput;
        
        // Ask the user to enter numbers
        System.out.println("Enter numbers to sum up. Enter 0 to stop.");
        
        // While loop to sum numbers until the user enters 0
        while (true) {
            // Take input from the user
            System.out.print("Enter a number: ");
            userInput = scanner.nextDouble();
            
            // If the user enters 0, exit the loop
            if (userInput == 0) {
                break;
            }
            
            // Add the user input to total
            total += userInput;
        }
        
        // Print the total sum outside the loop
        System.out.println("The total sum is: " + total);
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
