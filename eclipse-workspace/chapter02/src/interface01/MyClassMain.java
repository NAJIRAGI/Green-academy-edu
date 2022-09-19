package interface01;

public class MyClassMain {

	public static void main(String[] args) {
		System.out.println("1.-------------"); // MyClass 처음에 필드에 TV 클래스 객체를 사용하였으므로
		MyClass my1 = new MyClass();			// 현재 불러오는 MyClass는 TV 클래스가 저장되어 있음
		my1.rc.turnOn();
		my1.rc.setVolume(5);
		
		System.out.println("2.-------------");
		MyClass my2 = new MyClass(new Audio()); // MyClass 생성자 매개변수에 Audio 클래스 객체를 주었기 때문에 해당 생성자 안에 구문들은 Audio로 실행됨
		
		System.out.println("3.-------------");
		MyClass my3 = new MyClass();	// MyClass의 MethodA는 Audio 클래스 객체를 가지고 있으므로 Audio가 실행됨
		my3.methodA();
		
		System.out.println("3.-------------");	 // MyClass의 MethodB는 매개변수값을 받오는 것으로 저장하고
		MyClass my4 = new MyClass();
		my4.methodB(new TV());	// 매개변수로 TV클래스 객체를 사용하였으므로 TV가 실행됨

	}

}
