package test0101;

class A {
	public A() {
		System.out.println("A ");
	}
	public A(int x) {
		System.out.println("Ax1 "+x);
	}
	public A(int x, int y) {
		System.out.println("Ax2 "+x + "Ay2 " + y);
	}
}

class B extends A {
	public B () {
		super(100);
	}
	public B(int x, int y) {
		super(y);
		System.out.println("Bx1 " + x);
	}
	
	public B(int x) {
		System.out.println("Bx2 " + x);
	}
}


public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B(11, 16);
		System.out.println();
		B b = new B(11);
		System.out.println();
		B c = new B();
		
	}

}
