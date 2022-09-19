package test0704;

public class Price { // 최상위 부모 클래스
	int price;
	
	Price (int price) {
		this.price = price;
	}
}

class CoffeShop { // 커피 3개를 가지고 있는 클래스
	Price a; // 아메리카노 (부모타입으로 자동변환될 객체이므로 부모타입으로 필드 선언)
	Price cl; // 카페라테
	Price cc; // 카푸치노
	CoffeShop (int p1,int p2, int p3) { // 생성자의 매개변수 값으로 각 품목에 대한 가격을 받음.
		a = new Americano(p1); // 부모타입으로 선언된 변수에 자식 클래스를 객체화함.
		cl = new CaffeLatte(p2);
		cc = new Capucchino(p3);
	}
}

class Americano extends Price{ // 부모 클래스 상속 받은 자식 클래스1
	Americano(int price) {
		super(price);
	}
}

class CaffeLatte extends Price{
	CaffeLatte(int price) {
		super(price);
	}
}

class Capucchino extends Price{
	Capucchino(int price) {
		super(price);
	}
}



