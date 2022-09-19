package chapter11;

class Person1 {
	long id;
	
	Person1(long id) {
		this.id = id;
	}
	@Override 
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person1) { // 만약 obj의 변수가 비어있지 않으면서 obj가 Person1 클래스로 변환이 가능하면
			return id == ((Person1)obj).id; // 필드 id는 Person으로 강제변환된 obj가 가리키는 id 이다.
		}else {
			return false;
		}
	}
}

public class Person {
public static void main(String[] args) {
	Person1 p1 = new Person1(123234409285L);
	Person1 p2 = new Person1(123234409285L);
	
	if(p1 == p2) {
		System.out.println("같은 인물");
	} else {
		System.out.println("다른 인물");
	}
	
	if(p1.equals(p2)) {
		System.out.println("같은 인물");
	} else {
		System.out.println("다른 인물");
	}
}
}