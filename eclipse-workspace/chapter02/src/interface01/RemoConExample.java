package interface01;

public class RemoConExample {

	public static void main(String[] args) {
		RemoCon rc; // 인터페이스를 사용하기 쉽도록 변수에 저장하여 사용.
		
		rc = new Audio(); // 인터페이스 변수에 오디오 클래스 객체 저장
//		rc = new TV(); // 인터페이스 변수에 tv 클래스 객체 저장	
		
		rc.turnOn(); // 각각의 클래스에서 재정의 된 메서드들이 출력됨
		rc.setVolume(5);
		rc.turnOff();
	}

}
