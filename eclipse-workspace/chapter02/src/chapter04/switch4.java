package chapter04;

import java.util.Scanner;

public class switch4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.print("월 (1~12)을 입력하시오 : ");
		int num = a.nextInt();
		
		switch(num) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("봄 입니다");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름 입니다");
			break;
		case 9 :
		case 10 :
		case 11 : 
			System.out.println("가을 입니다");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println("겨울 입니다");
			break;
		default :
			System.out.println("개월 수를 잘 못 입력 하셨습니다");
		
		}
		
		
		a.close();

	}

}
