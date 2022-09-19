package test0704;

public class coffe {
	int price;
	
	coffe (int price) {
		this.price = price;
	}

}

class americano extends coffe{
	americano() {
		super(1500);
	}
	public String toString() {
		return "아메리카노";
	}
} 

class latte extends coffe{
	 latte() {
		super(2500);
	}
	public String toString() {
		return "카페라테";
	}
} 

class cappuccino extends coffe{
	cappuccino() {
		super(3000);
	}
	public String toString() {
		return "카푸치노";
	}
} 

class Buyers {
	coffe[] list = new coffe[3];
	int money = 10000;	
	int i;	
	
	public void buy(coffe c) {
		if (money <= c.price) {
			System.out.println("잔액이 부족함");
			return;
		}
		money -= c.price;		
		System.out.println(c + "을 구매함");
		
		add(c);
		
				
	}
	
	public void add(coffe c) {
		if (i >= list.length) {
			coffe[] temp = new coffe[list.length * 2];
			System.arraycopy(list, 0, temp, 0, list.length);
			list = temp;
		}
		list[i++] = c;
		return;
	}
	
	void summary() {
		String itemList = "";	
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null)
				break;
			itemList += list[i] + ",";
		
			sum += list[i].price;
		}
		System.out.println("구입목록 : " + itemList);	
		System.out.println("사용금액  : " + sum);
	}
}

class Bread {
	int price;
	
	Bread (int price) {
		this.price = price;
	}

}

class cream extends Bread{
	cream() {
		super(1500);
	}
	public String toString() {
		return "크림 도넛";
	}
} 

class redbin extends Bread{
	redbin() {
		super(2500);
	}
	public String toString() {
		return "단팥빵";
	}
} 

class moca extends Bread{
	moca() {
		super(3000);
	}
	public String toString() {
		return "모카빵";
	}
} 

class Buyer1 {
	Bread[] list = new Bread[3];
	int money = 10000;	
	int i;	
	
	public void buy(Bread c) {
		if (money <= c.price) {
			System.out.println("잔액이 부족함");
			return;
		}
		money -= c.price;		
		System.out.println(c + "을 구매함");
		
		add(c);
		
				
	}
	
	public void add(Bread c) {
		if (i >= list.length) {
			Bread[] temp = new Bread[list.length * 2];
			System.arraycopy(list, 0, temp, 0, list.length);
			list = temp;
		}
		list[i++] = c;
		return;
	}
	
	void summary() {
		String itemList = "";	
		int sum = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] == null)
				break;
			itemList += list[i] + ",";
		
			sum += list[i].price;
		}
		System.out.println("구입목록 : " + itemList);	
		System.out.println("사용금액  : " + sum);
	}
}