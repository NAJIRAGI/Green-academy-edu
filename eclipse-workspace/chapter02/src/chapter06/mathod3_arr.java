package chapter06;

public class mathod3_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] valuse = {1,2,3}; // valuse 배열 3개 생성 및 초기화
		int sum = sum1(valuse); // sum 변수는 return 된 sum1 메서드 값과 동일
		System.out.println("메인 합 : " + sum);

	}
	
	public static int sum1(int[] valuse) {
		int sum = 0; 
		for (int i = 0; i < valuse.length; i++) { // valuse 배열 값 만큼 반복
			sum += valuse[i]; // valuse의 i값을 sum에 누적하여 대입
		}
		System.out.println("메서드 합 : " + sum);
		return sum; // sum의 값을 return
	}

}
