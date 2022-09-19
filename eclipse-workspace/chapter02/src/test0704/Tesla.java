package test0704;

public class Tesla {
	Base_Tire FL = new Base_Tire("앞 오른쪽", 4); // 타이어의 위치와 수명을 매개변수로 반환하는 객체생성
	Base_Tire FR = new Base_Tire("앞 왼쪽", 5);
	Base_Tire BL = new Base_Tire("뒤 오른쪽", 1);
	Base_Tire BR = new Base_Tire("뒤 왼쪽", 1);

	int run() {
		System.out.println("달립니다.");
		if (FL.roll() == false) {
			stop();
			return 1;
		}
		if (FR.roll() == false) {
			stop();
			return 2;
		}
		if (BL.roll() == false) {
			stop();
			return 3;
		}
		if (BR.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("타이어 펑크로 차량을 멈추고 점검합니다.");
	}

	public static void main(String[] args) {

		Tesla car = new Tesla();

		for (int i = 0; i < 10; i++) {
			int num = car.run();
			if (num == 1) {
				System.out.println("앞 오른쪽의 타이어를 한국 타이어로 교체합니다.");
				car.FL = new Hankook_Tire("앞 오른쪽 ", 8);
			}
			if (num == 2) {
				System.out.println("앞 왼쪽의 타이어를 한국 타이어로 교체합니다.");
				car.FR = new Hankook_Tire("앞 왼쪽 ", 5);
			}
			if (num == 3) {
				System.out.println("뒤 오른쪽의 타이어를 금호 타이어로 교체합니다.");
				car.BL = new Kumho_Tire("뒤 오른쪽 ", 7);
			}
			if (num == 4) {
				System.out.println("뒤 왼쪽의 타이어를 금호 타이어로 교체합니다.");
				car.BR = new Kumho_Tire("뒤 왼쪽 ", 6);
			}
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		}

	}

}
