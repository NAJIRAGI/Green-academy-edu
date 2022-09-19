package chapter05;

import java.util.Scanner;

public class arry2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int[] score = new int[5]; //score 변수에 길이가 5인 배열 선언. 메모리 주소이므로 값이 저장이 안됨
		int max = 0; //비교를 위한 값을 저장하기 위한 변수를 선언
		System.out.println("5개의 숫자 입력 " );
		for (int i = 0; i < 5; i++) {			
			score[i] = a.nextInt(); //score[]를 이용하여 일반 변수처럼 초기화 가능.
			if (max < score[i]) { // 만약 max값을 입력받은 score와 비교했을 때 max값이 score보다 작다면
				max = score[i]; // max에 score 값을 집어넣어라
			}
		}
		System.out.println("가장 큰 수는  : " + max); //max값에 들어간 score 값이 max값 보다 작다면 출력문을 발동.
		
		
		
		
		
		
				
		
		
		
		
	
			
		a.close();

	}

}
