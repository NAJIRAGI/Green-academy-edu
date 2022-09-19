package interface01;

public class CreatureTest {

	public static void main(String[] args) {
		
		Member meber = new Member(); // 멤버 클래스 객체화 하여 불러오기
		meber.method();  // 멤버 클래스의 메서드 불러오기
		meber.method1();
		System.out.println();
		
		Creature creature = new Member(); // 인터페이스를 객체화는 불가능하더라도 구현된 클래스를 객체화하고 인터페이스를 타입으로 두면 사용 가능하다.
		creature.method(); // 위에서 인터페이스 타입에 멤버 객체를 사용했으므로 멤버 클래스의 있는 메서드를 불러옴
		System.out.println();
		
		Person person = new Person(); // 퍼슨 클래스 객체화 하여 불러오기
		person.method(); // 퍼슨 클래스의 메서드 불러오기
		person.method1();
		System.out.println();
		
		creature = new Person(); // 인터페이스의 변수에 구현된 클래스를 객체화하여 대입이 가능하다.
		creature.method(); // 위에서 인터페이스를 대입한 변수에 퍼슨 객체를 사용했으므로 퍼슨 클래스의 있는 메서드를 불러옴
		System.out.println();
		
		System.out.println(Creature.Max);
	}

}
