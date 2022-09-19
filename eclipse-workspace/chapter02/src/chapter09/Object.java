package chapter09;

public class Object {
	public Object() {
		
	}
	public void draw() {
		System.out.println("Obj draw");
	}	

}

class Line extends Object {
	@Override
	public void draw() {
		System.out.println("Line draw");
	}
}

class Rect extends Object {
	@Override
	public void draw() {
		System.out.println("Rect draw");
	}
}

class Circle extends Object {
	@Override
	public void draw() {
		System.out.println("Circle draw");
	}
}

