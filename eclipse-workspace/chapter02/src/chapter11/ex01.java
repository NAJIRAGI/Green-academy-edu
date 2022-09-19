package chapter11;

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}

}

public class ex01 {
	public static void main(String[] args) {
		Value v1 = new Value(10); // 주소1 
		Value v2 = new Value(20); // 주소2
		if (v1.equals(v2)) { // 서로의 주소값 비교
			System.out.println("서로 같음");
		} else 
			System.out.println("서로 다름");
		
		v1 = v2; // 주소1과 주소2는 같다.
		if (v1.equals(v2)) { // 서로의 주소값 비교
			System.out.println("서로 같음");
		} else 
			System.out.println("서로 다름");
	}
	

}

