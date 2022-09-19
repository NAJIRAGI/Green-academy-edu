package test;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int dan, num;
		
		//do while 문으로 구구단 출력
		System.out.println("==========================");
		
		int i = 2, j = 1;
		
		do {	
			j=1;
			do {
				System.out.println(i + "*" + j + "=" + i * j);
				j++;						
			} while(j < 10);
			i++;
			System.out.println("");
		} while( i < 10);
		
		//while 문으로 구구단 원하는 단수 입력 후 출력
		System.out.println("==========================");
		System.out.println("출력하고자 하는 단을 입력하세요");
		dan = scan.nextInt();
		j=1;
		
		while(j<10) {
			System.out.println(dan + "*" + j + "=" + dan*j);
			j++;
		}
		
		//for 문으로 구구단 원하는 단수의 배수만 입력 후 출력
		System.out.println("==========================");
		System.out.println("출력하고자 하는 단을 입력하세요");
		dan = scan.nextInt();
		System.out.println("출력하고자 하는 데이터(배수)를 입력하세요");
		num = scan.nextInt();		
		
		for(i = 1; i<=9; i++){			
			if(i % num == 0) {				
				System.out.println(dan + "*" + i + "=" + (dan*i));
			}
		}		
		scan.close();

	}

}
