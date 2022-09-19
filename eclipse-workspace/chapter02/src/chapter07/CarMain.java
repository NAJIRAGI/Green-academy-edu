package chapter07;

public class CarMain {

	public static void main(String[] args) {
		Car Car = new Car(); // Car 클래스 객체화
		
		System.out.println("차량 속도 : " + Car.speed); // Car 클래스의 speed(필드)를 출력하라.
		System.out.println("차량 색상 : " + Car.color); // Car 클래스의 color(필드)를 출력하라.			
		
		for (int i = 0; i < 5; i++) { // 5번 반복하면서 i 값을 1씩 증가시켜라
			Car.forward(); // Car 클래스의 forward 메서드를 호출하라 (반복문이므로 반복횟수 만큼 반복)
						   // forward 메서드 안에는 사용될때마다 speed를 1씩 증가시키는 구문이 있음.
		}
		System.out.println("차량 속도 : " + Car.speed); // Car 클래스의 speed 출력. 5번 반복되어 총 값은 0(초기값) -> 1 -> 2 -> 3 -> 4 -> 5

	}

}
