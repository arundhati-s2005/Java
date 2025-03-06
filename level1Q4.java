//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
//Hint => 
//Use a single print statement to display multiline text and variables.
//Profit = selling price - cost price
//Profit Percentage = profit / cost price * 100
//I/P => NONE
//O/P =>  The Cost Price is INR ___ and Selling Price is INR ___
//The Profit is INR ___ and the Profit Percentage is ___

class level1Q4 {
	public static void main(String[]args) {
		int cost_price=129;
		int selling_price=191;
	    int profit=selling_price-cost_price;
		double profit_percentage=(double)profit/cost_price*100;
		System.out.println("The cost price is INR"+cost_price+ "The selling price is INR" +selling_price+ "\n"+  
		           "The profit is INR" +profit+ "and the profit percentage is" +profit_percentage);
}
}
