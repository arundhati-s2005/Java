import java.util.Scanner;
class WeightConverter {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();
        
        // Conversion factor from pounds to kilograms
        double conversionFactor = 2.2;
        
        // Convert the weight to kilograms
        double weightInKilograms = weightInPounds / conversionFactor;
        
        // Display the result
        System.out.printf("The weight of the person in pounds is %.2f and in kilograms is %.2f.\n", weightInPounds, weightInKilograms);
        
        // Close the scanner to avoid resource leak
        input.close();
    }
}
