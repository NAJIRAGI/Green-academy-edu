package chapter07;

import java.util.Scanner;

public class Q5 {
	static Scanner scan = new Scanner(System.in);
	static Account[] accounts = new Account[100];// 100명분 계좌를 저장할 수 있는 배열

	
	public static void main(String[] args) {
		boolean run =true;
		
		main:while(run) {
			System.out.println("그린 뱅크에 오신것을 환영합니다.");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 업무");
			System.out.println("3. 종료");
			System.out.print("선택>");
			
			int selectMenu = Integer.parseInt(scan.nextLine());
			
			switch(selectMenu) {
			case 1: // 계좌 생성 기능
				System.out.println("계좌를 생성합니다.");
				System.out.println("예금주 이름을 입력하세요.");
				System.out.print(">");
				String name = scan.nextLine();
				System.out.println("계좌번호을 입력하세요.");
				System.out.print(">");
				String accountNum = scan.nextLine();
				System.out.println("초기 입금액을 입력하세요.");
				System.out.print(">");
				int balance = Integer.parseInt(scan.nextLine());
				
				Account newAccount = new Account(accountNum,balance,name);
				
				for(int i=0;i<accounts.length;i++) {
					if(accounts[i]==null) {
						accounts[i]=newAccount;
						break;
					}
				}
				System.out.println("계좌 생성");
				break;
			case 2: // 계좌 업무  : 입금, 출금, 조회
				int chkAccIdx = -1;
				System.out.println("사용하고자 하는 계좌 번호를 입력하세요.");
				System.out.print(">");
				String selectAccountNum = scan.nextLine();
				
				for(int i=0;i<accounts.length;i++) {
					if(accounts[i] == null) {
						continue;
					}else if(accounts[i].getAccountNum().equals(selectAccountNum)) {
						chkAccIdx = i;
						break;
					}
				}
				
				if(chkAccIdx == -1) {
					System.out.println("해당 계좌를 찾을수 없습니다.");
				}else {
					bankFunction(chkAccIdx);
				}
				
				break;
			case 3: //종료
				System.out.println("프로그램 종료합니다.");
//				System.exit(0);
				run = false;
//				return;
//				break main;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 확인해 주세요.");
			}	
		}
	}

	private static void bankFunction(int chkAccIdx) {
		//실제 계좌를 가지고 업무를 사용하는 메서드
		
		while(true) {
			System.out.println(accounts[chkAccIdx].getName()+"님 환영합니다.");
			System.out.println("업무를 선택하세요.");
			System.out.println("1. 입금");
			System.out.println("2. 출금");
			System.out.println("3. 잔액 조회");
			System.out.println("0. 메인메뉴 돌아가기");
 			System.out.print(">");
			
			int selectNum = Integer.parseInt(scan.nextLine());
			int money = 0;
			
			switch(selectNum) {
			case 1://입금
				System.out.println("입금 금액을 입력하세요.");
				money = Integer.parseInt(scan.nextLine());
				accounts[chkAccIdx].deposit(money);
				
				break;
			case 2://출금
				System.out.println("출금 금액을 입력하세요.");
				money = Integer.parseInt(scan.nextLine());
				accounts[chkAccIdx].withdraw(money);
				break;
			case 3://조회
				accounts[chkAccIdx].checkMyBalance();
				break;
			case 0:
				System.out.println("메인 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 확인해 주세요.");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}