package packges

public class Tire {
	int 최대회전수=5;
	int 누적회전수;
	String 타이어위치;
	public Tire() {
		
	}
	public int roll(int j){
		if (누적회전수 >= 최대회전수) {
			System.out.println(타이어위치+"타이어가 최대 회전수에 도달했습니다.");
			return 100;
		} else {
			System.out.println(타이어위치+"타이어 정상");
			누적회전수++;
			return j;
		}
	}
	public Tire(String 타이어위치) {
		this.타이어위치=타이어위치;
	}
}
class HankookTire extends Tire{
	public HankookTire(String 타이어위치) {
		super(타이어위치);
		this.최대회전수=7;
	}
}
class KumhoTire extends Tire{
	public KumhoTire(String 타이어위치) {
		super(타이어위치);
		this.최대회전수=8;
	}
}
class Car1 {
	Tire[] tire = new Tire[4];{
	
		tire[0]=new Tire("왼쪽앞");
	tire[1]=new Tire("왼쪽뒤");
	tire[2]=new Tire("오른쪽앞");
	tire[3]=new Tire("오른쪽뒤");
	}
	public void stop() {
		System.out.println("주행을 정지합니다.");

	}
	
	public void run(int km) {
		System.out.println(km+"만큼 주행을 시작합니다.");
		for(int j=0; j<km;j++) {
		for(int c =0; c<tire.length;c++) {
			tire[c].roll(j);
			if(tire[c].roll(j) == 100) {
				stop();
				return;
			}
		}
		}
	}
	public void 한국타이어로교체(int i) {
		System.out.println(tire[i].타이어위치+"에 있는 타이어를 한국 타이어로 교체합니다.");
		tire[i]= new HankookTire(tire[i].타이어위치);
	}
	public void 금호타이어로교체(int i) {
		System.out.println(tire[i].타이어위치+"에 있는 타이어를 금호 타이어로 교체합니다.");
		tire[i]= new KumhoTire(tire[i].타이어위치);
	}
}
