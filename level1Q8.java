import java.util.Scanner;
class level1Q8 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        double miles = km / 1.60934; // 1 mile = 1.60934 km

        System.out.println("The total miles is " + miles + " miles for the given " + km + " km.");
        input.close();
    }
}

		