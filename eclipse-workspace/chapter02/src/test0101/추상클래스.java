package test0101;

abstract class 추상클래스 {
	abstract int 추상메서드();	
}

class C extends 추상클래스 {
	int 추상메서드() {
		System.out.println("뱀적만점^^");
		return 0;
	}
	int aa() {
		System.out.println("gg");
		return 0;
	}
}
