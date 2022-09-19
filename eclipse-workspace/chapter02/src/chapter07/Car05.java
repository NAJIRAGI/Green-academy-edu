package chapter07;

public class Car05 {
	String company = "현대 자동차";
	String Model;
	String color;
	int maxSpeed;
	
	Car05() {}
	Car05(String Model) {
		this(Model, "은색", 30000);
	}
	Car05(String Model, String color) {
		this(Model, color, 30000);
		
	}
	Car05(String Model, String color, int maxSpeed) {
		this.Model = Model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
