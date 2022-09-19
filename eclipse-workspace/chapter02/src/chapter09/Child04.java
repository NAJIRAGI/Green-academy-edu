package chapter09;

public class Child04 extends Parent04 {
	int age = 25;
	
	@Override
	public void info() {
		//System.out.println("형을 형이라 부르지 못하는 :" + this.name);
		super.info();
		System.out.println("그의 나이 : " + this.age);
	}
}	
