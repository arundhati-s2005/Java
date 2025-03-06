class level1Q6 {
	public static void main(String[]args) {
		int fee=125000;
		int discount_percent=10;
		double discount=(double) fee*discount_percent/100;
		double discounted_fee= fee-discount;
		System.out.println("The discount amount is INR" +discount+"and final discounted fee is INR" +discounted_fee);
	}
}
