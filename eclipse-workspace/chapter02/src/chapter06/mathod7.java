package chapter06;

public class mathod7 {

	public static void main(String[] args) {

		mathod7_1 LPG = new mathod7_1(); // 메서드를 사용하기 위한 구문 (메모리에 객체로 메서드 불러오기)
		
		LPG.SetGas(5); // 차(mathod)에 가스를 주입
		LPG.isLeftGas();
		LPG.run();
		LPG.isLeftGas();
	}

}

