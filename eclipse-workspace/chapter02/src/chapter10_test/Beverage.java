package chapter10_test;

abstract public class Beverage {
	private String name;
	private int price;
	
	Beverage(String name) {
		this.name = name;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	abstract void calcPrice();
	
	void prt(int i) {		
		System.out.println(i + "번째 판매 음료는 " + name + ", 가격은 " + price);
	}
}

class Coffe extends Beverage{
	static int amount;
	private String name;
	
	Coffe (String name) {
		super(name);
		this.name = name;
		amount += 1;
		calcPrice();
		
	}
	
	void calcPrice() {
		if(name.equals("americano")) {
			setPrice(1500);		
		} else if(name.equals("cafelatte")) {
			setPrice(2500);	
		} else if(name.equals("cappuccino")) {
			setPrice(3000);			
		}
	}
}

class Tea extends Beverage{
	static int amount;
	private String name;
	
	Tea (String name) {
		super(name);
		this.name = name;
		amount += 1;
		calcPrice();
		
	}
	
	void calcPrice() {
		if(name.equals("lemontea")) {
			setPrice(1500);		
		} else if(name.equals("ginsengtea")) {
			setPrice(2000);	
		} else if(name.equals("redginsengtea")) {
			setPrice(2500);			
		}
	}
}
