package chapter02;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		String b = a.nextLine();
		int v = a.nextInt();
		System.out.println(b);
		System.out.println(v);
		
		a.close();

	}

}
