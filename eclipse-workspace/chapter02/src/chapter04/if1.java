package chapter04;

import java.util.Scanner;

public class if1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int score = a.nextInt();
		
		if(score >= 60) {
			System.out.println("합겹");
		} else {
			System.out.println("불합격");
		}
		System.out.println("종료");
		a.close();

	}
}
   
