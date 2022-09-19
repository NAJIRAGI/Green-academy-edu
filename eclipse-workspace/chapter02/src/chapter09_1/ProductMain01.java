package chapter09_1;

public class ProductMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product01 p1 = new Tv01();
		Product01 p2 = new Com01();
		Product01 p3 = new Audio01();
		Buyer01 buy = new Buyer01();
		
		buy.buy(p1);
		buy.buy(p3);
		
		
		System.out.println("남은 돈 "+buy.money);
		System.out.println("보너스 점수 "+buy.bonusPoint);
		
	
	}

}
