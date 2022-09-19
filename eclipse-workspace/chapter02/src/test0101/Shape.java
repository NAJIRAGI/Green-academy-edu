package test0101;

public class Shape {
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	@Override
	public void draw() {
		super.draw();
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}