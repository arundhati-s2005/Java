import java.util.Scanner;
class SimpleInterest {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to input Principal, Rate, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();
        
        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();
        
        System.out.print("Enter the Time period (in years): ");
        double time = input.nextDouble();
        
        // Calculate Simple Interest using the formula: SI = (P * R * T) / 100
        double simpleInterest = (principal * rate * time) / 100;
        
        // Display the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f, and Time %.2f years.\n", 
                          simpleInterest, principal, rate, time);
        
        // Close the scanner to avoid resource leak
        input.close();
    }
}
