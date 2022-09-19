package chapter09_1;

public class listlistlist {
	int price;
	double bonusPoint;
	int count;
	
	Product02(int price, int count) {
		this.price = price;
		this.bonusPoint = price*0.1;
		this.count = count;
	}
}

class Tv204 extends Product02 {
	Tv204() {
		super(100, 1);
	}
	public String toString() {
		return "TV";
	}
} 
class Com04 extends Product02 {
	Com04() {
		super(200, 1);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio04 extends Product02 {
	Audio04() {
		super(150, 1);
	}
	public String toString() {
		return "Audio";
	}
}
class Buyer04 {
	Product02[] cart = new Product02[3];
	int money = 10000;
	int bonusPoint = 0;
	int i;
	int count = 0;
	
	public void buy(Product02 p) {
		if (money <= p.price) {
			System.out.println("잔액이 부족함");
			return;
		}
		money -= p.price;
		count += p.count;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을 구매함");
		
		add(p);
	}

	public void add(Product02 p) {
		if (i >= cart.length) {
			Product02[] temp = new Product02[cart.length * 2];
			System.arraycopy(cart, 0, temp, 0, cart.length);
			cart = temp;
		}
		cart[i++] = p;
		return;
	}
	void summary() {
		String itemList = "";
	
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			itemList += cart[i] + ",";
		
			sum += cart[i].price;
		}
		System.out.println("구입목록 : " + itemList);	
		System.out.println("사용금액  : " + sum);
		System.out.println("보너스 : " + bonusPoint);
		System.out.println("남은 금액 : " + money);
		System.out.println("총 구매 수량 : " + count);
	}
}