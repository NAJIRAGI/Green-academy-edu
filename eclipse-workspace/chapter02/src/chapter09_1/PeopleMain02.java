package chapter09_1;

public class PeopleMain02 {

	public static void main(String[] args) {
		People02 man = new Man02();
		People02 woman = new Woman02();
		
		man.printinfo();
		((Man02)man).enlist(); // ((자식타입)변수).원하는 메서드();
		System.out.println();
		woman.printinfo();
		((Woman02)woman).working(); // ((자식타입)변수).원하는 메서드();
		
		

	}

}
