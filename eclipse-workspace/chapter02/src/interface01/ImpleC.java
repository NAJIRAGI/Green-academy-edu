package interface01;

public class ImpleC implements C {
	@Override
	public void methodA() {
		System.out.println("인터페이스 A를 C가 상속 받았으므로 C를 구현한 클래스에서 A에 있는 메서드를 재정의 해야한다!");
	}
	@Override
	public void methodB() {
		System.out.println("인터페이스 B를 C가 상속 받았으므로 C를 구현한 클래스에서 B에 있는 메서드를 재정의 해야한다!");
	}
	@Override
	public void methodC() {
		System.out.println("인터페이스 C를 구현한 클래스는 C에 있는 메서드를 재정의 해야한다!");
	}
}

