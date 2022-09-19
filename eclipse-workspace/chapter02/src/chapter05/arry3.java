package chapter05;

public class arry3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = { 83, 90, 87}; //scores 라는 변수에 배열을 선언하고 83, 90, 87 이라는 숫자를 초기화한다.
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) { //i와 scores를 비교해서 i가 scores보다 작다면 
			sum += scores[i]; //sum 변수에 scores를 누적하여 저장하라
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		System.out.println("배열의 수 : " + scores.length);
	}

}
