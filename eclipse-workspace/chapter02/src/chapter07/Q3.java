package chapter07;

public class Q3 {
	final static double PI = 3.141592; // 고정값 PI 생성 (3.14)
	int radius;

	public Q3(int radius) {
		this.radius = radius;
	}

	int getRadius() {
		return radius;
	}

	double getArea() {
		double area = getRadius() * getRadius() * PI;
		return area;
	}

	public static void main(String[] args) {
		Q3[] Circle = new Q3[5]; // Q3 객체를 참조할 변수 5개 생성

		for (int i = 0; i < Circle.length; i++)
			Circle[i] = new Q3(i); // 참조변수 배열 Circle의 i번째 는 객체 Q3의 i번 주소값과 같다.
		for (int i = 0; i < Circle.length; i++) {
			System.out.println("반지름" + i);
			System.out.println("넓이" + (int)(Circle[i].getArea()));
		}

	}

}
