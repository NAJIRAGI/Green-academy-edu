package test;

public class Aclass {
	private int a;
	protected Aclass (int i) {
		a = i;
	}
}

class Bclass extends Aclass {
	
	private int b;
	public Bclass() {
		super(1);
		b = 0;
	}
}