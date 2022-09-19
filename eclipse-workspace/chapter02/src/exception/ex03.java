package exception;

public class ex03 {
	static void method() throws NullPointerException{ // 메서드에서 발생한 오류를 메서드를 호출한 메인에서 처리
		String data = null;
		System.out.println(data.toString());
	}
	
	public static void main (String[] args) {
		try {
			method();
		}catch(NullPointerException e) {
			System.out.println("널포인터 에러 발생");
		}
		
		
	}
}

