package chapter05;

import java.util.Random;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		

		// 배열 변수 ballarr 에 1부터 9까지의 수를 할당
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		// 배열 변수 number 에 3자리수 표기를 위한 3개의 공간 할당
		int[] number = new int[3];
		// i 변수 선언 및 초기화
		// 배열 변수 ballarr의 수만큼 반복
		// i 1씩 증가
		for(int i=0;i<ballArr.length;i++) {
			// int j 변수 는 랜덤변수 1~9까지(배열 변수 ballarr 길이) 생성
			int j = (int)(Math.random() * ballArr.length);
			// 교환할 변수 선언 및 초기화
			int tmp = 0;
			// ballarr i번째에 있는 숫자를 tmp에 저장
			// ex : ballarr에 저장된 1,2,3,4,5,6,7,8,9 중에 처음은 1번을 선택해서 tmp에 저장
			tmp = ballArr[i];
			// ballarr i번째에 있는 숫자는 랜덤으로 뽑힌 숫자가 저장된 j로 변환
			// ex : 1~9의 무작위 숫자(예를 들어 5)가 처음에는 1번에 저장됨
			ballArr[i] = ballArr[j];
			// 랜덤으로 뽑힌 숫자가 저장된 j는 tmp로 변환
			// ex : i에 있던 1이 tmp를 거쳐서 j의 5로 이동 
			ballArr[j]=tmp;
		}
		System.arraycopy(ballArr,0, number,0,3);
		for(int i=0; i<3;i++) {
			System.out.print(number[i]);
		}				
	}

}
