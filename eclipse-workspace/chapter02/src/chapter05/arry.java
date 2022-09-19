package chapter05;

public class arry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] score = { 90, 99, 100}; //배열 
		
		System.out.println("score [0] :" + score[0] );
		System.out.println("score [1] :" + score[1] );
		System.out.println("score [2] :" + score[2] );
		
		int sum = 0;
		int count = 0;
		for (int i = 0; i < 3; i++) {
			sum += score[i];
			count++;
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / count; //double로 sum과 count 중에 하나라도 실수면 실수로 출력되도록 설정
		System.out.println("평균 : " + avg);

	}

}
