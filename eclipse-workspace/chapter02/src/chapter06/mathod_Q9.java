package chapter06;

public class mathod_Q9 {

	public static void main(String[] args) {
		// char 변수 a에 글자 단어 배열로 저장 
		char a[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		prt(a);
		replace(a);
		prt(a);

	}
	public static void prt(char[] a) {
		System.out.println(a); // 배열 a를 출력하라
	}
	public static void replace(char[] a) {
		for(int i = 0; i < a.length; i++) { // 배열 a의 길이 만큼 반복
			if (a[i] == ' ') { // 만약 a의 인덱스 값 중에 ' '란 값이 있으면
				a[i] = ','; // 인덱스의 값은 ','이다.
			}
		}
		
	}
}
