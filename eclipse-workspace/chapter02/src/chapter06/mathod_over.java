package chapter06;

public class mathod_over {

	public static void main(String[] args) {
		System.out.println("int형 add : " + add(3,5));
		System.out.println("double형 add : " + add(3.14,5.78));

	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	public static double add(double a, double b) {
		return a + b; 
	}
}	
