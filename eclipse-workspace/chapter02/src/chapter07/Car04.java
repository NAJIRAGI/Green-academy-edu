package chapter07;

public class Car04 {
	String company = "현대 자동차";
	String Model;
	String color;
	int maxSpeed;
	
	Car04() {}
	Car04(String Model) {
		this.Model = Model;
	}
	Car04(String Model, String color) {
		this.Model = Model;
		this.color = color;
	}
	Car04(String Model, String color, int maxSpeed) {
		this.Model = Model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
