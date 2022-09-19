package chapter04;

public class breakcontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int cnt=1; cnt <= 5; cnt++) {  // 반복하라 / cnt를 1로 초기화, cnt의 숫자가 5와 같을 때까지 반복하라, 1씩 증가하라
			System.out.println("cnt : " + cnt); // 출력하라 cnt를 (반복한 횟수만큼)
		}
		System.out.println();
		System.out.println("break 사용 예");
		
		for (int cnt=1; cnt <=5; cnt++) { // 반복하라 / cnt를 1로 초기화, cnt의 숫자가 5와 같을 때까지 반복하라, 1씩 증가하라
			if(cnt == 3) break; // 만약에 / cnt가 3일 때, 멈춰라(반복을 멈춰라)
			System.out.println("cnt : " + cnt); // 출력하라 cnt를 (반복한 횟수만큼)
		}
	}

}
