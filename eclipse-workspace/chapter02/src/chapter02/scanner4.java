package chapter02;

import java.util.Scanner;

public class scanner4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("이름, 전화번호, 나이, 오늘의 날짜를 빈칸으로 분리하여 입력하세요");
				
		String name = a.next();
		String number = a.next();
		int age = a.nextInt();
		String day = a.next();		
		
		System.out.println("당신의 이름은 " + name + "입니다");
		System.out.println("당신의 번호는 " + number + "입니다");
		System.out.println("당신의 나이는 " + age + "살 입니다");
		System.out.println("오늘의 날짜는 " + day + "입니다");
		a.close();

	}

}
