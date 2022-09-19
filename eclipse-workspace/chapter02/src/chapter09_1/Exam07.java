package chapter09_1;

public class Exam07 {

	public static void main(String[] args) {
		People02 parentA = new Man02();
		method1(parentA);
		
		People02 parentB = new People02();
		method1(parentB);
		

	}
	public static void method1(People02 parent) {
		if (parent instanceof Man02) {
			Man02 Child = (Man02) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환 실패");
		}
	}

}
