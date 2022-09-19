package chapter04;

import java.util.Scanner;

public class while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int a;			
		int b = 0;
		float c = 0f;
		while ((a = scan.nextInt()) != 0) {
			b++;
			c += a;
		}
		System.out.println("입력된 수의 개수 : " + b);
		System.out.println("입력된 수의 평균 : " + (c/b));
		
		scan.close();

	}

}
