package chapter04test;

public class ex3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 100; i++) { // 변수 i를 1로 지정 ; i를 100이랑 같을 때까지 반복; i를 1씩 증가
			int a = i / 10; // 변수 a의 값은 i를 10으로 나눈 몫 ex) a = i(32) / 10 = 몫 (3) 
			int b = i % 10; // 변수 b의 값은 i를 10으로 나눈 나머지 ex) b = i(32) / 10 = 나머지 (2)
			if (a == 3 || a == 6 || a == 9) { // i와 10을 나눈 나머지가 3,6,9와 일치하면 작업하라
				if (b == 3 || b == 6 || b == 9) { // i와 10을 나눈 몫이 3,6,9와 일치하면 작업하라
					System.out.print(" 짝짝"); // a와 b의 if가 일치하면 짝짝을 발동
					continue; // 다시 조건 확인
				}
				System.out.print(" 짝"); //a의 if만 일치하면 짝을 발동

			} else if (b == 3 || b == 6 || b == 9) { //2자리수가 아닐 경우 i와 10을 나눈 몫이 3,6,9와 일치하면 작업하라
				System.out.print(" 짝"); //b의 if와 일치하면 짝을 발동
			}else {
				System.out.print(" " + i); //a,b 둘 다 일치 안하면 i를 그대로 출력하라
			}
			
		}
	}
}