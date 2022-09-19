package chapter06;

import java.util.Scanner;

public class mathod_Q2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		gugudan(a);

		scan.close();
	}

	public static void gugudan(int dan) {
		for(int i = 1; i<=9; i++){							
				System.out.println(dan + "*" + i + "=" + (dan*i));			
			}
		}
	}


