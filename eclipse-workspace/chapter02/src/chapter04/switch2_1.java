package chapter04;

import java.util.Scanner;

public class switch2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("등급을 입력하시오");
		
		String grade = a.next();
		
		switch(grade) {
		case "a" :
		case "A" :
			System.out.println("우수 회원");
			break;
		case "b" :
		case "B" :
			System.out.println("일반 회원");
			break;
		default :
			System.out.println("게스트 입니다");
		}
		a.close();

	}

}
