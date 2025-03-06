import java.util.Scanner;
class TotalPrice{
	public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    System.out.print("Enter the unit price of the item:");

    double unitprice= input.nextDouble();
    System.out.print("Enter the quantity required:");
    int quantity= input.nextInt();
    double totalprice = unitprice * quantity;
   System.out.println("The total price of the items are:"+totalprice);
    input.close();
	}
}
