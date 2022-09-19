package chapter05;

import java.util.Scanner;

public class for_up2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		int sum = 0;
		String Str = " ";
		
		
		int[] nums = new int[5]; // 비어있는 배열 칸 5개를 생성.
		String[] name = new String[5]; // 비어있는 배열 칸 5개를 생성.
		
		for (int n:nums) { // n 배열의 값을 가져온다.
			n=a.nextInt(); // n이라는 변수의 값을 입력
			System.out.print(n + " "); // 입력된 n의 값 출력
			sum += n; // sum 변수에 n의 값을 하나씩 누적하여 더하기
		}
		System.out.println();
		System.out.println("합계 : " + sum);
		
		for (String b:name) {
			b=a.next();
			Str +=b;				
		}	System.out.println(Str + " ");	
		
		
		
		
		
		a.close();
	}

}
