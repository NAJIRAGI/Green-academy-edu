package chapter07;

public class CarMain2 {
	public static void main(String[] args) {
		
		// 서로 다른 객체이다.
		Car car1 = new Car(); // 클래스 Car를 객체명 car1으로 불러오기
		Car car2 = new Car(); // 클래스 Car를 객체명 car2으로 불러오기
		
		System.out.println("차량의 색상 : " + car1.color); // Car 클래스에 저장된 color값을 객체 car1으로 불러오기
		System.out.println("차량의 색상 : " + car2.color); // Car 클래스에 저장된 color값을 객체 car2으로 불러오기
		
		System.out.println("-- 차량 도색 --");
		
		car1.color = "black"; // 객체 car1의 Car 클래스의 color 값을 변경
		car2.color = "blue"; // 객체 car2의 Car 클래스의 color 값을 변경
		System.out.println("차량의 색상 : " + car1.color);
		System.out.println("차량의 색상 : " + car2.color);
	}

}
