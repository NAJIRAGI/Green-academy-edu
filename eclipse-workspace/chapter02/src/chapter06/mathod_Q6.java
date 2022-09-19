package chapter06;

import java.util.Scanner;

public class mathod_Q6 {

	public static void main(String[] args) {
		
		int[] arr = new int[5]; // 배열 변수 arr 생성(빈공간 5개)
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) { // 배열 arr의 길이 만큼(5) 반복
			arr[i] = scan.nextInt(); //배열 arr의 index i번은 입력한 값(0(입력한 값),1(입력한 값),2(입력한 값),3(입력한 값),4(입력한 값))
		} // for문이 끝나면서 arr의 배열 index 값은 내가 입력한 값이 저장된채로 끝난다.
		int sum=sum(arr); // 변수 sum에 메서드 호출(arr의 값이 메서드 매개변수)과 동시에 리턴값 대입.
		System.out.println("입력된 배열의 합은: " + sum);
		
		scan.close();
	}
	public static int sum(int[] a) { // int 배열 메서드 생성 메서드 이름 num
		int sum =0; // 변수 sum의 선언 및 초기화 (합계 입력)
		for(int i=0;i<a.length;i++) { // a의 길이 만큼 반복(5)
			sum +=a[i]; // sum이라는 변수에 a배열의 index들을 반복하면서 대입하면서 더한다. (ex: 첫반복 : a[0] = 5 sum = 5 / a[1] = 10 sum = 15)
 		}
		return  sum; // sum의 저장된 값은 리턴되어 메서드가 호출된 곳에 저장된다.
	}
}
