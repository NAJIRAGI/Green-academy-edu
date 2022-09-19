package test0101;

public class BMWMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BMW bmw = new BMW();
		
		for (int i = 0; i <=5; i++) {
			int problemloca = bmw.run(); // 달리는 기능 메서드에서 반환된 값을 변수에 지정하고
			switch(problemloca) { // 그 번호에 따른 조건문을 사용
			case 1: // 1이 반환되면 
				System.out.println("앞 왼쪽 H 타이어로 교체"); // 원하는 타이어로 교체하고
				bmw.frontL = new HTire("앞 왼쪽", 15); // 해당 위치와 타이어의 수명을 재설정
				break;
			case 2:
				System.out.println("앞 오른쪽 K 타이어로 교체");
				bmw.frontR = new KTire("앞 오른쪽", 12);
				break;
			case 3:
				System.out.println("뒤 왼쪽 K 타이어로 교체");
				bmw.BackL = new KTire("뒤 왼쪽", 10);
				break;
			case 4:
				System.out.println("뒤 오른쪽 H 타이어로 교체");
				bmw.BackR = new HTire("뒤 오른쪽", 14);
				break;
			}
			System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		
		}
	}

}
