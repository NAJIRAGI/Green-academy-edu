package exception;

public class ex02 {

	public static void main(String[] args) {
		int[] num = {1,2,3};
		try {
			System.out.println(num[5]/0); // 에러 발생 순서  1. 인덱스 범위 벗어남 => 2. 0으로 나눌 수 없음
										 // 에러 발생 순서에 따라서 catch 되기 때문에 catch 구문의 순서에 상관없이 인덱스범위 에러만 나온다.
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누는 것은 불가능");
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 벗어남");
		}catch (Exception e) { // 예상하지 못한 에러가 발생했을 경우를 대비하여 예외처리 진행!
			System.out.println("예상치 못한 예외처리!");
		}finally { // 해당 명령어 사용 시 에러가 발생하던 안하던 아래 실행문을 출력하게 한다!
			System.out.println("에러가 있든 없든 실행!");
		}

	}

}
