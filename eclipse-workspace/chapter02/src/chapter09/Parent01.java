package chapter09;

public class Parent01 {
	
	String model;
	String color;
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendM(String msg) {
		System.out.println("자신 : " + msg);
	}
	void receiveM(String msg) {
		System.out.println("상대방 : " + msg);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
