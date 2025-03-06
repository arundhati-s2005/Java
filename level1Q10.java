import java.util.Scanner;
class level1Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // 1 inch = 2.54 cm
        double heightInches = heightCm / 2.54;

        // 1 foot = 12 inches
        int feet = (int) (heightInches / 12); 
        double remainingInches = heightInches % 12; 
		System.out.println("Your Height in cm is " + heightCm+ "while in feet is " + feet+ "and inches is " + remainingInches);
        input.close();
    }
}
