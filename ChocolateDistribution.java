import java.util.Scanner;
class ChocolateDistribution {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user for the number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = input.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = input.nextInt();
        
        // Calculate the number of chocolates each child gets and the remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        
        // Display the results
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining chocolates are %d.\n", chocolatesPerChild, remainingChocolates);
        
        // Close the scanner to avoid resource leak
        input.close();
    }
}
