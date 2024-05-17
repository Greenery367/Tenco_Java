package basic.ch02;

public class quiz {
	
	public static void main(String[] args) {
		final double PRICE=59.99;
		final double DISCOUNT=0.3;
		
		double discounted_price=PRICE*(1-DISCOUNT);
		int real_price=(int)discounted_price;
		
		System.out.println(real_price);
		
	}//end of main
}//end of class
