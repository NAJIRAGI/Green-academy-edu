package chapter09;

public class Exam06 {
	public static void main(String[] args) {
		Child06 child = new Child06();
		Parent06 parent = child;
		
		parent.method1(); // 부모타입의 메서드 1을 호출
		parent.method2(); // 부모타입의 메서드 2를 가져왔다가 자식타입에 메서드2가 재정의 되었으므로 자식타입의 메서드2를 호출
	//	parent.method3(); // 자식타입에는 있는 메서드이나, 부모타입에는 없는 메서드이므로 호출 불가 (연관성 없어서 안됨)
	}

}
