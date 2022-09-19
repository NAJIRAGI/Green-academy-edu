package test;

import chapter09_1.Product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product man = new Product();
		man.buy(new Tv2());
		man.buy(new Com());
		man.buy(new Audio());
		
		man.summary();
	}

}
