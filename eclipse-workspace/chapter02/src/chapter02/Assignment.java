package chapter02;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		a = a + 10;
		System.out.println("a : " + a);
		
		int b = 10;
		b += 10;
		System.out.println("b : " + b);
		
		int c = 10;
		
		System.out.println("c +=5 : " + (c+=5));
		System.out.println("c -=5 : " + (c-=5));
		System.out.println("c *=5 : " + (c*=5));
		System.out.println("c /=5 : " + (c/=5));
		System.out.println("c %=3 : " + (c%=3));		

	}

}
