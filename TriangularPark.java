import java.util.Scanner;
class TriangularPark {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
     
        System.out.print("Enter the length of side1: ");
        int side1 = input.nextInt();
        
        System.out.print("Enter the length of side2: ");
        int side2 = input.nextInt();
        
        System.out.print("Enter the length of side3: ");
        int side3 = input.nextInt();
        
        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;
        
        // The athlete wants to run 5 km
        double targetDistance = 5;
        
        // Calculate the number of rounds
        double rounds = targetDistance / perimeter;
        
        // Output the result
        System.out.println("The total number of rounds the athlete will run to complete 5 km = "+rounds);
        
        // Close the scanner to avoid resource leak
        input.close();
    }
}

