package chapter06;

public class mathod_Q8 {

	public static void main(String[] args) {
		int arry1[] = { 78, 54, 89, 57, 54 };
		int arry2[] = { 95, 74, 91, 84 };
		int arry3[] = arry(arry1, arry2);
		prt(arry3);
	}

	public static int[] arry(int[] a, int[] b) {

		// 메서드 자체에서는 각 배열의 길이 값을 모르기 때문에 길이값의 차이에 따른 조건문을 작성하여 각 길이에 맞는 구문을 실행해야 한다.

		int[] arrResult = null; // 빈 배열 객체 생성 (배열 길이에 따라 반환되는 값을 유동적으로 바꾸기 위한 배열 변수)
		if (a.length > b.length) { // a 배열 길이가 b 배열 길이보다 작으면 (arry1의 길이가 길 경우)
			arrResult = new int[a.length]; // arrResult의 길이 값은 a 배열(arry1)의 길이값과 같다.
			for (int i = 0; i < a.length; i++) { // a 배열의 길이 만큼 반복문 실행
				if (i < b.length) { // i의 값이 b보다 작을 때까지
					arrResult[i] = a[i] + b[i]; // arrResult의 index 값은 a + b 값이다.
				} else { // i의 값이 b 배열의 길이 값보다 크면
					arrResult[i] = a[i]; // arrResult의 index의 값은 a의 값을 그대로 가져온다.
				}

			}

		} else { // a 배열의 길이가 b 배열의 길이보다 크면 (arry2의 길이가 길 경우) (a.length < b.length)
			arrResult = new int[b.length]; // arrResult의 길이 값은 b 배열(arry2)의 길이값과 같다.
			for (int i = 0; i < b.length; i++) { // b 배열의 길이 만큼 반복문 실행
				if (i < a.length) { // i의 값이 a보다 작을 때까지
					arrResult[i] = a[i] + b[i]; // arrResult의 index 값은 a + b 값이다.
				} else { // i의 값이 a 배열의 길이 값보다 크면
					arrResult[i] = a[i]; // arrResult의 index의 값은 a의 값을 그대로 가져온다.
				}
			}
		}
		return arrResult; // result 값 반환
	}

	public static void prt(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
