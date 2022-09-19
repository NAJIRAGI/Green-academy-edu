package chapter04;

public class dowhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int sum = 0;
		
		do {
			i++; // i를 1씩 증가하라.
			System.out.println(i);
			sum += i; // 변수 sum에 i를 누적하여 증가하라.			
		} while (i<10); // i가 10 미만이 될때까지 반복하라. 
		System.out.println("sum :" + sum); // 현재 변수 sum의 상태를 출력하

	}

}
