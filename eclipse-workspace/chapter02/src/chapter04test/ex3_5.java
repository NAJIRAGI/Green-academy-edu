package chapter04test;

import java.util.Scanner;

public class ex3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("6번 문제");
		
		
		int balance	= 0; // 잔고
		int end = 0; // 종료
		
		while (end == 0) {
			System.out.println("[1.예금] [2.출금] [3.잔액조회] [4.종료]");
			int select = a.nextInt();
			switch(select) {
			case 1 :
				System.out.println("예금 입금");
				System.out.print("입금 금액 : ");
				int deposit = a.nextInt();
				balance += deposit;
				System.out.println("입금된 금액 : " + deposit);
				System.out.println("입금 완료");
				break;
			case 2 : 
				System.out.println("예금 출금");
				System.out.print("출금 금액 : ");
				int withdraw = a.nextInt();
				if(withdraw > balance) {
					System.out.println("잔액 부족");
				} else 
					System.out.println("출금된 금액 : " + withdraw);
					System.out.println("출금 완료");
					balance -= withdraw;
				break;
			case 3 : 
				System.out.println("잔액 조회");
				System.out.println("조회 : " + balance);
			case 4 :
				end++;
				System.out.println("종료되었습니다");
		} 		
			
		}
		
		
		
		
			
		
		a.close();


	}

}
