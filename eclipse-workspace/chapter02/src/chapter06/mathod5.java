package chapter06;

public class mathod5 {
	
	public static void main(String[] args) {
		
		hello();
		hello("고길동", 45);
		
		int r = dice();
		System.out.println("주사위 눈 : " + r);
		
		int num1 = 3;
		int num2 = 5;
		int result = addr(num1,num2);
		System.out.println("합계 : " + result);
		
	}
	
	//입력X 출력 X
	private static void hello() { // 메서드 hello 작성 
		System.out.println("안녕하세요"); 
	}
	//입력O 출력 X
	private static void hello(String name, int age) { // 메서드 hello와 매개변수 선언 
		System.out.println("내 이름은 " + name);
		System.out.println("내 나이는 " + age);
	}
	//입력X 출력O
	private static int dice() { // 메서드 dice 작성
		int dice = (int)((Math.random()*6)+1); // 랜덤 난수 작성
		return dice; // dice에 위에 있는 랜덤 난수 값을 저장하고 리턴함.
	}
	//입력 O 출력O
	private static int addr(int a, int b) {
		int c = a+b;
		return c;
	}
}
