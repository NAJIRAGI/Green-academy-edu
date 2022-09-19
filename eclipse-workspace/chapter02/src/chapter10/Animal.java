package chapter10;

abstract class Animal {
	String kind;

	Animal(String kind) {
		this.kind = kind;
	}

	void 숨쉬기() {
		System.out.println(kind+ "가 숨을 쉽니다");		
	}
	
	abstract void 울음소리();
}
