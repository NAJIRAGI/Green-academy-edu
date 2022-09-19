package chapter02;

public class truefalse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		System.out.println(result);
		System.out.println(num1);
		System.out.println(num2);
		
		result = ((num1 += 10) > 0) || ((num2 += 10) > 0);
		System.out.println(result);
		System.out.println(num1);
		System.out.println(num2);
		
		
	}

}
