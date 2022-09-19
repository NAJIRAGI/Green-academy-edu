package interface01;

public interface A {
	public void methodA();
}

interface B {
	public void methodB();
}

interface C extends A, B {
	public void methodC();
}
