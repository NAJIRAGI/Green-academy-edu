package test0704;

public class BuyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyers buy = new Buyers();
		Buyer1 buy1 = new Buyer1();
		
//		buy.buy(new americano());
		buy.buy(new cappuccino());
		buy.summary();
		buy1.buy(new moca());
		buy1.buy(new cream());
		buy1.summary();
	}

}
