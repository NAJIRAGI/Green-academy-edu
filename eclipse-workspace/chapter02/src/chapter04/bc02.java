package chapter04;

import java.util.Scanner;

public class bc02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a=0;
		int b = 0;
		int c = 0;
		while (a < 5) {
			a++;
			b = scan.nextInt();
			
			if (b <= 0) {
				continue;
			} c += b;
			
		}
		System.out.println(c);
		

	}

}
