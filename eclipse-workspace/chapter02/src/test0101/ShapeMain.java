package test0101;


public class ShapeMain {
	static void paint(Shape s) {
		s.draw();
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line c = new Line();
		paint(c);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
	}

}
