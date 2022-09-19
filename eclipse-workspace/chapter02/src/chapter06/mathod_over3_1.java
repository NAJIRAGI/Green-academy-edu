package chapter06;

public class mathod_over3_1 {

	public static void main(String[] args) {
		// 메서드 오버로딩의 예제
		System.out.println("정수 + 정수  = " + info(6,6)); // info라는 메서드의 매개변수가 'int'와 'int'인 타입을 불러와라
		System.out.println("실수 + 실수  = " + info(2.5,3.0)); // info라는 메서드의 매개변수가 'double'과 'double'인 타입을 불러와라
		System.out.println("정수 + 실수  = " + info(30,5.5)); // info라는 메서드의 매개변수가 'int'와 'double'인 타입을 불러와라

	}
	private static int info(int a, int b) {
		return a+b;
	}
	
	private static double info(double a, double b) {
		return a+b;		
	}
	private static double info(int a, double b) {
		return a+b;			
	}
	
}
