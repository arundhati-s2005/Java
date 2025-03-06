import java.util.Scanner;
class Handshake {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate the maximum number of handshakes using the combination formula
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Display the result
        System.out.println("The maximum number of possible handshakes is: " + handshakes);
        
        // Close the scanner to avoid resource leak
        input.close();
    }
}
