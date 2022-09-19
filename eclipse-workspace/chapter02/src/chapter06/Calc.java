package chapter06;

	public class Calc {
		
		void powerOn() {
			System.out.println("전원이 켜집니다");
		}
		int plus(int x, int y) {
			int result = x+y;
			return result;
		}
		double divide(int x, int y) {
			double result = (double)x / (double)y;
			return result;
		}
		void powerOff() {
			System.out.println("전원을 종료합니다");
		}

}
