package chapter10_test;

public class CoffeShop {

	public static void main(String[] args) {
		System.out.println("*** 자바 커피샵 ***");
		Beverage[] bever = new Beverage[5];
		bever[0] = new Coffe("americano");
		bever[1] = new Coffe("cafelatte");
		bever[2] = new Coffe("cappuccino");
		bever[3] = new Coffe("americano");
		bever[4] = new Coffe("cafelatte");
		getSalesInfo(bever);
     	System.out.println("총 판매 금액==>" + getTotalPrice(bever));
		System.out.println("Coffe의 판매 개수=>" + Coffe.amount + "잔");
		System.out.println("Tea의 판매 개수=>" + Tea.amount + "잔");
		
	}
	static void getSalesInfo(Beverage[] bever) {
		for (int i = 0; i < bever.length; i++) { // 배열 수 만큼 반복
			bever[i].prt(i+1); // 배열 인덱스 i의 prt 메서드를 출력하면서 i값에 1을 더하라!
			// bever(배열)[0]번째가 가리키는 prt 메서드를 사용. => i = 1 , name = americano , price = 1500
		}
	}
	static int getTotalPrice(Beverage[] bever) {
		int sum = 0;
		for (int i = 0; i < bever.length; i++) {
			sum += bever[i].getPrice();
		}
		return sum;
	}	
		
	}

	

