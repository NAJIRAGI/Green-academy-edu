package chapter04;

import java.util.Scanner;

public class bc01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int a;
		for (int i = 0; i < 5; i++) {
			a = scan.nextInt();
			if (a < 0) {
				continue;
			} sum += a;
		}	
		System.out.println("합 : " + sum);
		scan.close();
	}

}
