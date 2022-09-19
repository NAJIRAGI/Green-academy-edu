package chapter07;

public class Car02 {
	String color = "Yellow";
	int speed = 0;
	
	public Car02(String color) {
		this.color = color;
	}
	
	public void forward() {		
		speed++;
		System.out.println("전진");
		System.out.println("속도가 1씩 증가합니다.");
		System.out.println("현재 속도 : " + speed);
	}
	public void backward() {		
		speed--;
		System.out.println("후진");
		System.out.println("속도가 1씩 감소합니다");
		System.out.println("현재 속도 : " + speed);
	}
}
