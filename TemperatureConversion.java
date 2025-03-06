import java.util.Scanner;

class TemperatureConversion {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take temperature input in Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Output the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit");
        
        // Close the scanner
        input.close();
    }
}
