package chapter06;

import java.util.Scanner;

public class mathod_Q7 {

	public static void main(String[] args) {				
		int arr[] = new int[5]; // 배열 arr 생성 (빈칸 5개)
		Scanner scan = new Scanner (System.in);
		for (int i = 0; i < arr.length; i++) { // 배열 arr 길이 만큼 반복(5)
			arr[i] = scan.nextInt(); // arr의 인덱스는 내가 입력한 값이다.
		}
		int avg = avg(arr); // 변수 avg의 값은 메서드에 리턴된 값과 같음 / 메서드 호출
		System.out.println("평균 값 : " + avg);
		
	}

	public static int avg(int[] a) { // int 배열 메서드 생성 메서드 이름 avg
		int sum = 0; // 변수 sum 선언 및 초기화 (합계용)
		int count = 0; // 변수 count 선언 및 초기화 (수량용)
		for (int i = 0; i < a.length; i++) { // a의 배열 길이 만큼 반복(5)
			sum += a[i]; // 반복할 때마다 sum에 인덱스 값들을 더하라
			count++; // 반복할 때마다 count 1씩 증가
		} int avg = sum/count;
		return avg;
	}
}
