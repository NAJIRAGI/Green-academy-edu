package chapter04test;

public class ex3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("4번 문제");
		System.out.println("구구단 출력");

		for (int i = 2; i <= 9; i+=2) {			
				System.out.println("\n" + i + "단");
			for (int j = 1; j <= 9; j++){
					System.out.println(i + " x " + j + " = " + (i * j));
				}

		}

	}

}
