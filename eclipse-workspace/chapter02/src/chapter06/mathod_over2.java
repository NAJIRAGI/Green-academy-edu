package chapter06;

public class mathod_over2 {

	public static void main(String[] args) {
		// 메서드 오버로딩의 예제
		info("고길동");  // info라는 메서드의 매개변수가 'String'인 타입을 불러와라
		info("고길동", 25); // info라는 메서드의 매개변수가 'String'과 'int'인 타입을 불러와라
		info("asdf","1234"); // info라는 메서드의 매개변수가 'String'과 'String'인 타입을 불러와라
		info(123,"코드 컴플리트"); // info라는 메서드의 매개변수가 'int'와 'String'인 타입을 불러와라

	}
	private static void info(String name) {
		System.out.println("이름 : " + name);
	}
	
	private static void info(String name, int age) {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	private static void info(String id, String pw) {
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + pw);
	}
	private static void info(int number, String title) {
		System.out.println("숫자 : " + number);
		System.out.println("제목 : " + title);
	}
	
}
