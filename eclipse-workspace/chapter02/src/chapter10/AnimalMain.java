package chapter10;

class Cat extends Animal {
	Cat() {
		super("고양이");
	}
	
	@Override 
	public void 울음소리() {
		System.out.println(kind + "의 울음 소리는 야옹!");		
	}	
}

class Dog extends Animal {
	Dog() {
		super("강아지");
	}
	
	@Override 
	public void 울음소리() {
		System.out.println(kind + "의 울음 소리는 멍멍!");
		
	}
}

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.울음소리();
		dog.울음소리();
		
		Animal ani = null;
		
		ani = new Dog();
		ani.울음소리();
		
		ani = new Cat();
		ani.울음소리();
		animalsound(new Dog());
		animalsound(new Cat());		
	}
	private static void animalsound(Animal ani) {
		ani.울음소리();		
	}
	


}
