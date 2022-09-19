package chapter04;

public class switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
		case 'a' :
		case 'A' :
			System.out.println("우수 회원");
			break;
		case 'b' :
		case 'B' :
			System.out.println("일반 회원");
			break;
		default :
			System.out.println("게스트 입니다");
		}

	}

}
