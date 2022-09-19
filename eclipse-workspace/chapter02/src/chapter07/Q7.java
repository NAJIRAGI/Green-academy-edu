package chapter07;

import java.util.Scanner;

public class Q7 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >> :");
		int math = sc.nextInt();
		int sci = sc.nextInt();
		int eng = sc.nextInt();
		
		Grade me = new Grade(math,sci,eng);
		System.out.println("평균은 : " + me.Average());

	}

}
