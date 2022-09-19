package packages;

public class Exam02Main {

	public static void main(String[] args) {
		packages.Exam02 ex1 = new packages.Exam02(); // 동일 패키지 ex1
		packages.dto.Exam02 ex2 = new packages.dto.Exam02(); // 다른 패키지 ex2
		
		System.out.println("public" + ex1.field1); // 같은 패키지라 접근 가능
		System.out.println("default" + ex1.field2); // 같은 패키지라 접근 가능
		System.out.println("private" + ex1.field3); // 같은 클래스가 아니라 접근 불가능
		
		ex1.method1(); // 같은 패키지라 접근 가능
		ex1.method2(); // 같은 패키지라 접근 가능
		ex1.method3(); // 같은 클래스가 아니라 접근 불가능
		
		System.out.println("public" + ex2.field1); // 다른 패키지라도 접근 가능
		System.out.println("default" + ex2.field2); // 다른 패키지라 접근 불가능
		System.out.println("private" + ex2.field3); // 다른 패키지라 접근 불가능
		
		ex2.method1(); // 다른 패키지라도 접근 가능
		ex2.method2(); // 다른 패키지라 접근 불가능
		ex2.method3(); // 다른 패키지라 접근 불가능

	}

}
