package chapter09;

public class Exam01 {

	public static void main(String[] args) {
		
		Child01 child = new Child01("자바폰","검정",10);
		
		System.out.println("상속받은 모델 : " + child.model);
		System.out.println("상속받은 색상 : " + child.color);
		
		System.out.println("자식 클래스 채널 : " + child.channel);
		
		child.powerOn();
		child.bell();
		child.sendM("하이");
		child.receiveM("리하이");
		child.sendM("오키");
		child.hangUp();
		
		child.turnOn();
		child.changeChannel(59);
		child.turnOff();

	}

}
