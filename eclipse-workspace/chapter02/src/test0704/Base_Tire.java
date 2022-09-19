package test0704;

public class Base_Tire {
	public int maxrot ; // 타이어의 최대회전수
	public int accrot; // 타이어의 누적회전수
	public String loca; // 타이어의 각 위치
	
	// 생성자로 각 위치와 최대 회전수를 반환해서 받는다.
	Base_Tire (String loca, int maxrot) {
		this.loca = loca;
		this.maxrot = maxrot;
	}
	
	public boolean roll() { //부울린으로 트루,펄스를 반환받아 런으로 전송.
		++accrot; // roll 메서드 실행 시 누적회전부터 증가.
		if (accrot < maxrot) {
			System.out.println(loca + "타이어 의 남은 수명은 : " + (maxrot-accrot) + "회");
			return true;
		} else {
			System.out.println(loca + "수명이 다하여 펑크가 발생!");
			return false;
		}
		
	}
}

class Kumho_Tire extends Base_Tire{ // 베이스 타이어를 상속

	public Kumho_Tire (String loca, int maxrot) {
		super(loca, maxrot); // 생성자의 매개값은 부모클래스 베이스 타이어의 값
	}
	
	public boolean roll() { //부울린으로 트루,펄스를 반환받아 런으로 전송.
		++accrot; // roll 메서드 실행 시 누적회전부터 증가.
		if (accrot < maxrot) {
			System.out.println(loca + "금호 타이어 의 남은 수명은 : " + (maxrot-accrot) + "회");
			return true;
		} else {
			System.out.println(loca + "수명이 다하여 펑크가 발생!");
			return false;
		}
		
	}
	
}

class Hankook_Tire extends Base_Tire { // 베이스 타이어를 상속
	
	public Hankook_Tire (String loca, int maxrot) {
		super(loca, maxrot); // 생성자의 매개값은 부모클래스 베이스 타이어의 값
	}
	
	public boolean roll() { //부울린으로 트루,펄스를 반환받아 런으로 전송.
		++accrot; // roll 메서드 실행 시 누적회전부터 증가.
		if (accrot < maxrot) {
			System.out.println(loca + "한국 타이어 의 남은 수명은 : " + (maxrot-accrot) + "회");
			return true;
		} else {
			System.out.println(loca + "수명이 다하여 펑크가 발생!");
			return false;
		}
		
	}
}

