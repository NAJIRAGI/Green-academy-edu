package chapter09_1;

public class Product {
	int price;
	double bonusPoint;
	Product(int price) {
		this.price = price;
		this.bonusPoint = price*0.1;
	}
}

class Tv2 extends Product {
	Tv2() {
		super(100);
	}
} 
class Com extends Product {
	Com() {
		super(200);
	}
}
class Audio extends Product {
	Audio() {
		super(150);
	}
}
public class Buyer {
	Product[] cart = new Product[3];
	int money = 10000;
	int bonusPoint = 0;
	int i;

	public void buy(Product p) {
		if (money <= p.price) {
			System.out.println("잔액이 부족함");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을 구매함");
		add(p);
	}

	public void add(Product p) {
		if (i >= cart.length) {
			Product[] temp = new Product[cart.length * 2];
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
	}
}


	

