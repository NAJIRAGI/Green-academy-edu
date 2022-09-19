package chapter09;

public class Exam09 {

	public static void main(String[] args) {
		Object obj = new Object(); // 부모 타입의 부모 객체 = obj 출력
		Line line = new Line(); // 자식 타입의 자식 객체 = line 출력
		Object p = new Line(); // 부모 타입의 자식 객체 = line 출력
		Object r = line; // 부모 타입의 자식 객체 변수 = line 출력
		obj.draw();
		line.draw();
		p.draw();
		r.draw();
		
		Object rect = new Rect();
		Object circle = new Circle();
		rect.draw();
		circle.draw();
		
	}

}
