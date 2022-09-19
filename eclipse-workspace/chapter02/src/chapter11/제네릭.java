package chapter11;

class Thanos {
	public String toString() {
		return "나는 필연적인 존재다";
	}
}

class IronMan {
	public String toString() {
		return "I am IRON MAN!";
	}
}

class EndGame<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

public class 제네릭 {

	public static void main(String[] args) {
		EndGame<Thanos> enemy = new EndGame<Thanos>();
		EndGame<IronMan> tony = new EndGame<IronMan>();
		
		enemy.set(new Thanos());
		tony.set(new IronMan());
		
		Thanos ts = enemy.get();
		IronMan tn = tony.get();
		
		System.out.println(ts);
		System.out.println(tn);

	}

}
