package chapter04;

public class iffor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for (int i=1; i<=10; i++) {
			if(i <= 9) {
				System.out.print(i + "+");
			} else if (i == 10) {
				System.out.print(i + "=");
			}			
			sum += i;
		}
		System.out.print(sum);
	}
}
