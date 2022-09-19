package test0101;

public class Tire {
	public int maxrot; // 최대 회전수 필드값 지정 
	public int accrot; // 누적 회전수 필드값 지정 
	public String loca; // 타이어 위치 필드값 지정  
	
	public Tire (String loca, int maxrot) { // 타이어 생성자 매개변수로 지정
		this.loca = loca;
		this.maxrot = maxrot;
	}
	
	public boolean roll() { // 타이어의 1 회전 시 메서드
		++accrot; // 누적값 우선 1 상승.
		if(accrot < maxrot) { // 만약 누적 회전 수가 최대값보다 작으면
			System.out.println(loca + "타이어 수명 : " + (maxrot - accrot) + "회"); // 타이어의 위치와 남은 수명을 출력
			return true; // 리턴값으로 트루를 리턴
		} else { // 누적 회전 수가 최대값보다 크면
			System.out.println(loca + "펑크!"); // 타이어의 위치와 펑크를 호출
			return false; // 리턴값으로 펄스를 리턴
		}
	}
}

class HTire extends Tire { // 새로운 타이어 클래스는 기존 타이어 클래스를 상속
	public HTire (String loca, int maxrot) { // 생성자를 통해 부모 클래스에 매개변수 전달
		super(loca, maxrot);
	}
	@Override
	public boolean roll() { // 타이어 1회전 메서드 재정의 (타이어 교체 후이므로 내용 변경)
 		++accrot;
		if(accrot < maxrot) {
			System.out.println(loca + " H 타이어 수명 : " + (maxrot - accrot) + "회");
			return true;
		} else {
			System.out.println(loca + "H 타이어 펑크!");
			return false;
		}
	}
}

class KTire extends Tire { // 새로운 타이어 클래스는 기존 타이어 클래스를 상속
	public KTire (String loca, int maxrot) { // 생성자를 통해 부모 클래스에 매개변수 전달
		super(loca, maxrot);
	}
	@Override
	public boolean roll() { // 타이어 1회전 메서드 재정의 (타이어 교체 후이므로 내용 변경)
		++accrot;
		if(accrot < maxrot) {
			System.out.println(loca +" K 타이어 수명 : " + (maxrot - accrot) + "회");
			return true;
		} else {
			System.out.println(loca + "K 타이어 펑크!");
			return false;
		}
	}
}
class BMW { // 자동차 하나를 설정
	Tire frontL = new Tire("앞 왼쪽",6); // 각 위치의 타이어를 지정하고 해당 위치의 수명을 설정
	Tire frontR= new Tire("앞 오른쪽",2);
	Tire BackL= new Tire("뒤 왼쪽",3);
	Tire BackR= new Tire("뒤 오른쪽",4);
		
	int run() { // 차가 달리는 기능에 대한 메서드
		System.out.println("달린다"); 
		if(frontL.roll() == false) { // 만약 해당 위치의 타이어가 1회전에 대한 값이 펄스로 들어오면
			stop(); // 멈추는 메서드 실행하고
			return 1; // 리턴값을 1로 반환
		}
		if(frontR.roll() == false) {
			stop();
			return 2;
		}
		if(BackL.roll() == false) {
			stop();
			return 3;
		}
		if(BackR.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("멈춤");
	}
}

	