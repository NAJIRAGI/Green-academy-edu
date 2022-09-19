package chapter09_1;

public class ProductMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Buyer04 buy = new Buyer04();
		
		
		buy.buy(new Tv204());
		buy.buy(new Audio04());
		buy.buy(new Com04());
		buy.buy(new Com04());
		buy.summary();
	
	}

}
