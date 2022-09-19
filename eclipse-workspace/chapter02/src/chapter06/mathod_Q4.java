package chapter06;

import java.util.Scanner;

public class mathod_Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); 
			
		
		gugudan(a);
		int b = scan.nextInt();	
		gugudan(a,b);

		
		scan.close();

	}
	public static void gugudan(int dan1) {
		for(int i = 1; i<=9; i++){							
				System.out.println(dan1 + "*" + i + "=" + (dan1*i));			
			}
		}
	public static void gugudan(int dan1, int dan2) {
		if (dan1 < dan2) {
			for (int i = dan1; i <= dan2; i++) {
				System.out.println("\n" + i + "단");
				for (int j = 1; j <= 9; j++)
					System.out.println(i + " x " + j + " = " + (i * j));
			}
		} else if (dan1 > dan2) {
			for (int i = dan2; i <= dan1; i++) {
				System.out.println("\n" + i + "단");
				for (int j = 1; j <= 9; j++)
					System.out.println(i + " x " + j + " = " + (i * j));
			}
		}

	}

}
