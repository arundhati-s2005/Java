import java.util.Scanner;

class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Check if the age is greater than or equal to 18
        if (age >= 18) {
            // Person can vote
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            // Person cannot vote
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}


