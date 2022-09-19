package chapter09_1;

public class Product01 {
	int price;
	double bonusPoint;
	Product01(int price) {
		this.price = price;
		this.bonusPoint = price*0.1;
	}
}

class Tv01 extends Product01 {
	Tv01 () {
		super(100);
	}
	public String toString() {
		return "TV";
	}
} 
class Com01 extends Product01 {
	Com01() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class Audio01 extends Product01 {
	Audio01() {
		super(150);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer01 {
	int money = 1000;
	int bonusPoint = 0;	
	
//	
//	void buy(Tv2 t) {
//		money -= t.price;
//		bonusPoint += t.bonusPoint;
//	}
//	void buy(Com c) {
//		money -= c.price;
//		bonusPoint += c.bonusPoint;
//	}
//	void buy(Audio a) {
//		money -= a.price;
//		bonusPoint += a.bonusPoint;
//	}
	void buy(Product01 p) {
		if(money < p.price) {
			System.out.println("잔액 부족");
			return;
		}else {
			money -= p.price;
			bonusPoint += p.bonusPoint;
			System.out.println(p.toString()+" 을/를 구입함");
		}
		
	}	
}
	

