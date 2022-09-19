package interface01;

public class Exam01 {

	public static void main(String[] args) {
		ImpleC im = new ImpleC(); // 인터페이스 A,B를 상속 받은 인터페이스 C를 구현한 ImpleC 클래스를 객체화
		A ia = im; // 인터페이스 A 타입이므로
		ia.methodA(); // 인터페이스 A에만 있는 메서드만 호출 가능
		System.out.println();
		
		B ib = im; // 인터페이스 B 타입이므로
		ib.methodB(); // 인터페이스 B에만 있는 메서드만 호출 가능
		System.out.println();
		
		C ic = im; // 인터페이스 C 타입이므로
		ic.methodA(); // 인터페이스 C에만 있는 메서드(A,B 상속이므로 메서드 A,B 도 같이 호출 가능)만 호출 가능
		ic.methodB(); 
		ic.methodC();
		System.out.println();
	}

}
