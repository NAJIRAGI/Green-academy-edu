package chapter09;

public class Student extends Person {
	
	
		void set() {
			age = 30;
			name = "홍길동";
			height = 175;
			setWeight(99);
			System.out.println(getWeight());
					
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.set();
	}

}
