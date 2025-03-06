import java.util.Scanner;

class TotalIncome {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take user input for salary
        System.out.print("Enter the salary (INR): ");
        double salary = input.nextDouble();

        // Take user input for bonus
        System.out.print("Enter the bonus (INR): ");
        double bonus = input.nextDouble();

        // Compute total income by adding salary and bonus
        double totalIncome = salary + bonus;

        // Output the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence, Total Income is INR " + totalIncome);
        
        // Close the scanner
        input.close();
    }
}
