package chapter07;

import java.util.Scanner;

public class Q52{
	static Account[] Acc = new Account[100]; // 100개의 배열 객체 생성
	static Scanner scan = new Scanner(System.in);
	static int count = 0;

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("=========================");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.계좌 생성  2.은행 업무  3.종료");
			System.out.println("=========================");
			System.out.print(">>");
			int sel = scan.nextInt();
			switch (sel) {
			case 1:
				createAcc();
				break;
			case 2:
				AccList();
			}
		}

	}

	public static void createAcc() {
		System.out.println("계좌 생성 메뉴입니다.");
		System.out.println("계좌 번호 입력해주세요.");
		String AN = scan.next();

		System.out.println("계좌주의 성함을 입력해주세요.");
		String AH = scan.next();

		System.out.println("초기 입금액을 입력해주세요.");
		int Bal = scan.nextInt(); 

		Acc[count] = new Account(AN, AH, Bal);
		count++;
		System.out.println("생성 완료");
	}

	public static void AccList() {
		System.out.println("계좌 목록");
		for (int i = 0; i < count; i++) {
			System.out.println(Acc[i].getAN() + Acc[i].getAH() + Acc[i].getBal());
		}
	}

}
