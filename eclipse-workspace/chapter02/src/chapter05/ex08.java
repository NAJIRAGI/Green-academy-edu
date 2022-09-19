package chapter05;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30}; // 배열 a 값 지정
		int b[] = {40,50,60}; // 배열 b 값 지정
		int c[] = new int[6]; // 배열 c 공간만 할당 6개
		int cnt = 0; // 배열 a와 b의 값을 가져올 변수 cnt 선언 후 값 0으로 초기화
		
		// 변수 i 선언 및 초기화
		// i 가 3보다 작을 경우 반복문 발동
		// 반복 후 i값 1씩 증가
		for(int i = 0; i < a.length; i++) {			
			// 배열 c의 index 첫번째와 배열 a의 index i번째와 같다.				
			c[cnt] = a[i];
			// 배열 c의 index + 1(두번째 index)와 배열 b의 i번째가 같다
			c[cnt + 1] = b[i];			
			// 배열 c의 index에 2를 대입하여 더한다. (첫 반복 이후 2씩 증가)
			cnt += 2;
		}
		// 변수 i 선언 및 초기화
		// i가 6보다 작을 경우 반복문 발동
		// i는 1씩 증가
		for (int i = 0; i < 6; i++) {
			
			// 전역 변수 c의 배열을 출력
			System.out.println(c[i]);
		}


		}
		
		

	}


