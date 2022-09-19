package interface01;

public class Member implements Creature {	
	
	@Override
	public void method() {
		System.out.println("인터페이스에서 불러온(구현하고 Member클래스에서 재정의한) 메서드");
	}
	public void method1() {
		System.out.println("Member 클래스가 원래 가지고 있는 메서드");
	}

}
