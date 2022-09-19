package chapter04;

public class if3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 28;
		
		if(age >= 60) {
			System.out.println("무료 입장");
		} else if(age >= 20) {
			System.out.println("성인 요금");
		} else if(age >= 13) {
			System.out.println("청소년 요금");
		} else if(age >= 8) {
			System.out.println("어린이 요금");
		} else {
			System.out.println("유아 입장");
		}
		System.out.println("프로그램 종료");
	}
	
}
