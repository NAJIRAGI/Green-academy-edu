package chapter06;

public class mathod7_1 {

	int gas; //차량의 가스통 (필드로 지정하여 초기화 없이 사용 가능)
	
	void SetGas(int gas) { //가스의 주입							
 		this.gas = gas; //main에 설정한 gas 값 = mathod 안에 가스 값은 같다.
	}
	
	boolean isLeftGas() { // 남은 가스의 잔량 확인하는 구문
		if (gas > 0) { // 가스가 0보다 크면 아래 구문 실행
			System.out.println("가스가 있습니다");		
			return true; // 가스가 있으면 return 값을 true로 반환
		}else { // 가스가 0보다 작으면 아래 구문 실행
			System.out.println("가스가 없습니다");
			System.out.println("가스를 주입 해주세요");
		}	return false; // 가스가 없으면 return 값을 false로 반환
	}
	
	void run() {
		System.out.println("출발합니다");
		while(true) {
			if (gas > 0) {
				System.out.println("남은 가스 : " + gas);
				gas--;
			}else if (gas == 0) {
				System.out.println("멈춥니다, 남은 가스 : " + gas);
				return; //반복문의 종료
				}
			
		}
			
		}		
		
	}


