package chapter04test;

import java.util.Scanner;

public class ex3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		System.out.println("5번 문제");
		
		int i = ((int)(Math.random()*3)+1);
		
		System.out.println("(1.가위 2.바위 3.보)");
		int num = a.nextInt();	
		
		switch(i) {
		case 1 : 
			System.out.println("컴퓨터는 가위");
			break;
		case 2 :
			System.out.println("컴퓨터는 바위");
			break;
		case 3 :
			System.out.println("컴퓨터는 보");
			break;			
		}
		
		if (num == 1) {
			System.out.println("나는 가위");
			if (i == 3) {
				System.out.println("이겼습니다");
			} else if (i == 2) {
				System.out.println("졌습니다");
			} else
				System.out.println("비겼습니다");
		} else if (num == 2) {
			System.out.println("나는 바위");
			if (i == 3) {
				System.out.println("졌습니다");
			} else if (i == 1) {
				System.out.println("이겼습니다");
			} else 
				System.out.println("비겼습니다");
		} else if (num == 3) {
			System.out.println("나는 보");
			if (i == 2) {
				System.out.println("이겼습니다");
			} else if (i == 1) {
				System.out.println("졌습니다");
			} else 
				System.out.println("비겼습니다");
		}
		
				
		a.close();

	}

}
