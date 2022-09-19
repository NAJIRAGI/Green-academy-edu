package chapter04;

import java.util.Scanner;

public class if4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int number = a.nextInt();
		
		if(number < 0) {
			System.out.println("음수 입니다");
		} else if (number == 0) {
			System.out.println("0 입니다");			
		} else
			System.out.println("양수 입니다");
			
				
		a.close();

	}
	


}
