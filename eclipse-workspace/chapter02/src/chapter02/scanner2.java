package chapter02;

import java.util.Scanner;

public class scanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		String Linetext = a.nextLine();
		a.nextLine();
		System.out.println(Linetext);
		System.out.println("==================");
		
		String name = a.next();
		String city = a.next();
		int age = a.nextInt();
		double weight = a.nextDouble();
		boolean single = a.nextBoolean();
		System.out.println(name + city + age + weight + single);
		
		a.close();

	}

}
