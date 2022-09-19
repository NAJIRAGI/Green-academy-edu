package chapter09_1;

public class PeopleMain03 {
	
	public static void func(People03 people) {
		people.printinfo();
		if(people instanceof Man03) { // 만약 부모타입의 변수를 자식타입으로 변경 가능하면
			((Man03)people).enlist(); // 자식타입의 원하는 메서드를 호출하라
		}
		if(people instanceof Woman03) {
			((Woman03)people).working();
		}
	}

	public static void main(String[] args) {
		People03 man = new Man03();
		People03 woman = new Woman03();
		
		func(man);
		System.out.println();
		func(woman);

	}

}
