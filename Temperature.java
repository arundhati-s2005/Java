import java.util.Scanner;

class Temperature {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take temperature input in Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5/9;

        // Output the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");
        
        // Close the scanner
        input.close();
    }
}
