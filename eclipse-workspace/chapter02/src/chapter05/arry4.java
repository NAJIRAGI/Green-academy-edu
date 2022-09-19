package chapter05;

public class arry4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[][] = {{100,100,100,100},{100,100,50,79}}; // 배열 변수 scores에 1학기 (4년 성적), 2학기 (4년 성적)을 초기화
		int count = 0; // 반복횟수를 입력할 변수 선언 및 초기화
		int sum = 0; // 합계를 입력할 변수 선언 및 초기화
		for (int i = 0; i < scores.length; i++) { // i와 1학기 2학기를 비교하고 i가 1,2학기 보다 작으면 발동.
			for (int j =0; j < scores[i].length; j++) { // j와 4년 성적을 비교하교 j가 4년 성적보다 작으면 발동.
				sum += scores[i][j]; // 합계 변수는 1,2학기 , 4년 성적의 배열을 누적하여 더하라.
				count++; // 반복한 횟수만큼 크기가 1씩 증가
			}		
			
		}
		double avg = (double) sum / count; // 성적 합계 / 1,2학기 / 4년 성적
		System.out.println("합은 : " + sum);
		System.out.println("평균 : " + avg);
		
	

	}

}
