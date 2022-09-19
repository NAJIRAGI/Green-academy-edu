package exception;

public class ex04 extends Exception {
	public ex04() {}
	public ex04(String msg) {
		super(msg);
	}
	
private static void method() throws ex04 {
	throw new ex04("강제 예외 발생"); // 예외 객체 생성
}
	public static void main(String[] args) {
		
		try {
			method();
		}catch (ex04 e) {
			String msg = e.getMessage(); // getMessage = 저장된 문자열을 가져온다. 현재 저장된 문자열은 "강제 예외 발생"
			System.out.println(msg + " : 사용자 정의 예외 발생");
		}
	}

}
