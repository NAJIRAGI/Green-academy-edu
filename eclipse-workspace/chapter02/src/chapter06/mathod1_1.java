package chapter06;

import java.util.Scanner;

public class mathod1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		Calc myCalc = new Calc();
		myCalc.powerOn();
		
		int num = a.nextInt();
		int num2 = a.nextInt();
		
		int result1 = myCalc.plus(num, num2);
		System.out.println("result 1 : " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result 2 : " + result2);
		
		myCalc.powerOff();
		
		a.close();

	}
	
	
}
