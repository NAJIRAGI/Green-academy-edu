package chapter02;

import java.util.Scanner;

public class scanner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputData;
			
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : " + inputData );
		
		scanner.close();
	
	}

}
