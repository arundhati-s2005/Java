import java.util.Scanner;

class RocketLaunchCountdown {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the countdown start value
        System.out.print("Enter the countdown starting value: ");
        int counter = scanner.nextInt();
        
        // Countdown using a while loop
        while (counter >= 1) {
            System.out.println("T-" + counter + " seconds");
            counter--;  // Decrement the counter
        }
        
        // Print launch message when countdown reaches 0
        System.out.println("Lift off!!");
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
