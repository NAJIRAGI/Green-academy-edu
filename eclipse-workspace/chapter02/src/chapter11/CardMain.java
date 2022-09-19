package chapter11;

class Card {
	String kind;
	int num;
	
	Card() {
		this("spade",1);
	}
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	@Override           
	public String toString() {
		return "kind : " + kind + "num : " + num;
 	}
}

class Card2 {
	String kind;
	int num;
	
	Card2() {
		this("spade",1);
	}
	Card2(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
}

public class CardMain {

	public static void main(String[] args) {
		Card card1 = new Card();
		Card2 card2 = new Card2();
		Class clazz1 = card2.getClass(); // clazz1 변수에 card2에 저장된 클래스 객체를 저장.
		System.out.println(clazz1.getName()); // clazz1이 가리키는 클래스 이름 가져오기.
		System.out.println(clazz1.getSimpleName()); // clazz1이 가리키는 클래스 이름만 가져오기.
		System.out.println(clazz1.getPackage().getName()); // clazz1이 가리키는 패키지의 이름을 가져오기.
		System.out.println(card2.kind + card2.num); // card2가 가리키는 kind 값과 num 값 가져오기.
		
		try {
			Class clazz2 = Class.forName("card2"); 
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println(card1.toString()); // .toString 메서드가 오버라이드 되었으므로 매개변수 값이 출력된다.
		System.out.println(card2.toString()); // .toString 메서드가 오버라이드가 되지 않았으므로 메모리 주소값(해시코드)가 출력된다.
	}

}
