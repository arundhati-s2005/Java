import java.util.Scanner;
class DistanceConverter {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feets:");
        int distance=input.nextInt();
        double yard = distance/3;
        double miles = distance/5280;
        System.out.println("The distance in yards is = "+yard+"and in miles = "+miles);
        input.close();
		}
}
