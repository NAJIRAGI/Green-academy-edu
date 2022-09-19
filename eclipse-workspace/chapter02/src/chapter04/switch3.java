package chapter04;

import java.util.Scanner;

public class switch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);

		System.out.println("과목 선택 하시오");
		System.out.println("(1.수학 2.과학 3.영어 4.역사)");
		
		System.out.print("과목번호 : ");
		int num = a.nextInt();
		
	
		
		switch(num) {
		case 1 : 
			System.out.println("101호 입니다");
			break;
		case 2 :
			System.out.println("102호 입니다");
			break;
		case 3 :
			System.out.println("201호 입니다");
			break;
		case 4 :
			System.out.println("202호 입니다");
			break;
		default :
			System.out.println("상담원 문의 바랍니다");			
		}
		
		a.close();

	

	}

}
