package chapter06;

import java.util.Scanner;

public class mathod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 2개를 입력해주세요");
		System.out.print(">");
		int ai = scan.nextInt();

		System.out.print(">");
		int bi = scan.nextInt();

		maxNumber(ai, bi); // 매서드 매개변수 (a와 b에) 각각 ai와 bi를 대입한다
		
		scan.close();

	}

	public static void maxNumber(int a, int b) {		
		if (a > b) {
			System.out.println(a + " 와(과) " + b + " 중에 큰 수는 ==> " + a);
		} else if (a == b) {
			System.out.println(a + " 와(과) " + b + " 는 같습니다");
		} else {
			System.out.println(a + " 와(과) " + b + " 중에 큰 수는 ==> " + b);
		}

	}
}
