package chapter06;

import java.util.Scanner;

public class mathod6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력 하시오");
		System.out.print(">");
		int a = scan.nextInt();
		int b = scan.nextInt();		
		System.out.println("큰 수는 " + maxNumber(a,b)); // R : 매서드로 값을 보내는 것과 동시에 리턴값을 반환받는 객체다.
		
		scan.close();
		

	}
	// 리턴되는 값은 하나만 반환되며 반환된 값은 R에 저장된다.
	public static int maxNumber(int a, int b) {
		int max = 0;
		if (a > b) {
			max =a; // a가 b보다 크면 a는 max값에 저장된다.
		} else if (a < b) {
			max =b; // b가 a보다 크면  b는 max값에 저장된다.
		} 
		return max; // max에 저장된 값이 리턴된다.
	} 
}
