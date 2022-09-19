package chapter06;

public class mathod4_1 {
	int sum1(int[] valuse) { // 메서드 매개변수를 배열로 선언
		int sum = 0; 
		for (int i = 0; i < valuse.length; i++) { // 매개변수의 값(길이) 만큼 반복
			sum += valuse[i]; // 반복하면서 sum에 valuse의 값을 대입하라
		}
		return sum;
	}
	int sum2(int ...valuse) { // 메서드 매개변수를 배열과 배열이 아닌 수도 가능하도록 선언
		int sum = 0;
		for (int i = 0; i < valuse.length; i++) { // 매개변수의 값(길이) 만큼 반복
			sum += valuse[i]; // 반복하면서 sum에 valuse의 값을 대입하라
		}
		return sum;
	}
}
