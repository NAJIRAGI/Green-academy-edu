package chapter05;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		//금액 권수를 배열로 정렬
		int[] money = new int[] {50000, 10000, 1000, 500, 100, 50, 10};
		
		//권수를 계산 할 금액을 입력할 스캐너 변수 사용.
		int k = a.nextInt();
		
		//변수 i를 0으로 선언 및 초기화
		//i가 권수금액보다 작으면 반복
		//i는 반복할 때마다 1씩 증가
		for (int i = 0; i < money.length; i++) {
			//권수금액 i값과 계산할 금액을 권수금액으로 나눈 몫의 값 (ex : 65730 / 50000 = 1(몫)
			//오만원권이 계산되었으므로 money[i]에는 65370 - 50000 = 15370이 저장되고
			//반복문을 다시 실행한다.
			 System.out.println(money[i] + "원 : " + (k/money[i]));
			 //권수금액을 계산할 금액과 나누고 그 나머지를 계산할 금액에 누적한다.
			 // ex : 50000 / 65370 = 15370(나머지)
			 // k는 65370에서 15370으로 바뀌어서 저장된 후 반복문 시작으로 이동.
             k %= money[i];
             
             // 계산하면 65370으로 제일 높은 권수로 나누고 그 몫을 권수에 출력하고
             // 나머지 금액을 계산할 금액에 대입하여 계산할 금액의 액수를 변경하고
             // 변경된 계산할 금액을 다시 제일 높은 권수와 비교하여 나눌 수 있는 권수와 나누고 그 몫을 권수에 출력하는 것을 반복.
             
        a.close();
		}
		
		
		
		
		

	}

}
