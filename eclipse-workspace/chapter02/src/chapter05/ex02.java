package chapter05;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {10,15,47,23,51}; //arr 변수에 배열 인덱스를 입력
		
		int sum = 0; // 합계를 입력하기 위한 변수 초기화
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; // sum 변수에 arr[i]의 값을 누적하고 더하라.
		}
		System.out.println("합계  : " + sum); // 합계 출력

	}

}
