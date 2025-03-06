import java.util.Scanner;

class RocketLaunch2 {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the countdown start value
        System.out.print("Enter the countdown starting value: ");
        int counter = scanner.nextInt();
        
        // Countdown using a for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println("T-" + i + " seconds");
        }
        
        // Print launch message when countdown reaches 0
        System.out.println("Lift off!!");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
