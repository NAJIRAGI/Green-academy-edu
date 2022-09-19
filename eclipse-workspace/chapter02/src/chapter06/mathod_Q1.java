package chapter06;

public class mathod_Q1 {

	public static void main(String[] args) {
		gugudan();
	}

	public static void gugudan() {
		for (int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for (int j = 1; j <= 9; j++)
				System.out.println(i + " x " + j + " = " + (i * j));
		}

	}

}
