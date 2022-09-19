package chapter07;

public class Account {
	String accountNum;
	int balance=0;
	String name;
	
	public Account(String accountNum, int balance, String name){	
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	//입금
		public void deposit(int money) {
			System.out.println(money+"원 입금합니다.");
			this.balance+=money;
			System.out.println("입금완료");
		}
		
		//출금
		 public void withdraw(int money) {
			 System.out.println(money+"원 출금합니다.");
			 if(money > balance) {
				 System.out.println("잔액 부족");
			 }else {
				 this.balance -= money;
				 System.out.println("출금 완료");
			 } 
		 }
		
		 // 잔액 조회
		 public void checkMyBalance() {
			 System.out.println("잔액을 조회합니다.");
			 System.out.println("잔액 : "+this.balance);
		 }
	

}
