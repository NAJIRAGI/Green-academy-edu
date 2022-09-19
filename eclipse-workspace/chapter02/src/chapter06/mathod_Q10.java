package chapter06;

import java.util.Scanner;

public class mathod_Q10 {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int balance = 0; // balance 변수 선언 및 초기화 (은행 문제에서 잔액을 확인하기 위한 변수)
		int end = 0; // 반복문의 종료를 위한 변수
		System.out.println("그린 은행입니다.");
		while (end == 0) {			
			System.out.println("[1.예금] [2.출금] [3.잔액조회] [4.종료]");			
			int select = scan.nextInt();
			switch (select) {
			case 1:
				balance = deposit(balance);
				break;
			case 2:
				balance = withdraw(balance);
				break;
			case 3:
				check(balance);
				break;
			case 4:
				end = end(end);
			}
		}

	}

	public static int deposit(int a) {
		System.out.println("입금할 금액을 입력해주세요.");
		int n = scan.nextInt();
		if ((a + n) > 1000000) {
			System.out.println("입금 한도액 초과입니다. 한도액 : 100만원");
			System.out.println(" ");
			System.out.println("메뉴를 다시 선택해 주세요.");		
			return a;
		} else {
			System.out.println("입금 완료 되었습니다.");
			System.out.println("입금된 금액 : " + n);
			a += n;
			System.out.println("현재 통장 잔액 : " + a);
			System.out.println(" ");
			System.out.println("메뉴를 다시 선택해 주세요.");			
			return a;
		}
	}
	public static int withdraw(int a) {
		System.out.println("출금한 금액을 입력해주세요.");
		int n = scan.nextInt();
		if (n > a) {
			System.out.println("잔액이 부족합니다.");
			System.out.println("현재 잔액 : " + a);
			System.out.println(" ");
			System.out.println("메뉴를 다시 선택해 주세요.");		
			return a;
		} else {
			System.out.println("출금 완료되었습니다.");
			System.out.println("출금된 금액 : " + n);
			a -=n;
			System.out.println("현재 잔액 : " + a);
			System.out.println(" ");
			System.out.println("메뉴를 다시 선택해 주세요.");

			return a;
		}
	}
	public static void check(int a) {
		System.out.println("잔액을 조회합니다.");
		System.out.println("현재 잔액 : " + a);
		System.out.println(" ");
		System.out.println("메뉴를 다시 선택해 주세요.");		
	}
	public static int end(int a) {
		System.out.println("은행 프로그램을 종료합니다.");
		int end = 1;
		return end;
	}
}

