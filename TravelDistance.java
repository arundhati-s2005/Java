import java.util.Scanner;
class TravelDistance {
   
   public static void main(String[] args) {
      
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);
      
      // Take user input for name
      System.out.print("Enter your name: ");
      String name = input.next();
      
      // Take user input for cities
      System.out.print("Enter the city you are traveling from: ");
      String fromCity = input.next();
      
      System.out.print("Enter the city you are traveling via: ");
      String viaCity = input.next();
      
      System.out.print("Enter the city you are traveling to: ");
      String toCity = input.next();
      
      // Take user input for distances in miles
      System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
      double distanceFromToVia = input.nextDouble();
      
      System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
      double distanceViaToFinalCity = input.nextDouble();
      
      // Take user input for time taken (in minutes)
      System.out.print("Enter the time taken to travel from " + fromCity + " to " + viaCity + " in minutes: ");
      int timeFromToVia = input.nextInt();
      
      System.out.print("Enter the time taken to travel from " + viaCity + " to " + toCity + " in minutes: ");
      int timeViaToFinalCity = input.nextInt();
      
      // Calculate total distance and time
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;
      
      // Print the travel details
      System.out.println("\nThe Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + 
	  " via " + viaCity + " is " + totalDistance + " miles and the Total Time taken is " + totalTime + " minutes.");
      
      // Take input for fee and discountPercent                      
      System.out.print("\nEnter the fee: ");
      int fee = input.nextInt();
      
      System.out.print("Enter the discount percentage: ");
      int discountPercent = input.nextInt();
      
      
      int discountedFee = fee - (fee * discountPercent / 100);
      int totalFee = fee + discountedFee; 
      int finalFee = discountedFee * 2; 
      
      // Output the results of integer operations
      System.out.println("\nThe results of integer operations are:");
      System.out.println("Discounted Fee: " + discountedFee);
      System.out.println("Total Fee (Original + Discounted): " + totalFee);
      System.out.println("Final Fee (Discounted Fee * 2): " + finalFee);
      
      // Close the scanner
      input.close();
   }
}


