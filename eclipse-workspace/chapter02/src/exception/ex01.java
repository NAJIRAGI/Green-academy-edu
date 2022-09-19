package exception;

public class ex01 {

	public static void main(String[] args) {
		String data = null;
		try { // 아래 구문을 실행 시 발생하는 에러가
			System.out.println(data.toString());
		} catch (NullPointerException e) { // catch 안에 있는 에러라면 밑에 실행문을 사용하라
			System.out.println("널포인터 에러 발생");
		}
		

	}

}
