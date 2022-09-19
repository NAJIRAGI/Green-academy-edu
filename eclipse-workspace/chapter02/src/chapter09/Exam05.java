package chapter09;

public class Exam05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child05 child = new Child05();
		child.takeOff();
		child.fly();
		child.flyMode = child.SUPERSONIC;
		child.fly();
		child.flyMode = child.NORMAL;
		child.fly();
		child.land();
	}

}
