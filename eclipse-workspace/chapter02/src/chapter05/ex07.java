package chapter05;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3,2,5}; //arr 배열에 인덱스 지정
		
		for (int i=0; i < arr.length; i++) {	// i를 0으로 초기화 / i가 arr의 길이값(3)보다 작으면 반복 / 반복 후 i를 1씩 증가
			System.out.print(arr[i] + ": "); // i가 arr의 길이값 보다 작으면 " arr[i]의 값 : "를 출력 (길이값이 3이므로 3번만 반복)
			for (int j = 0; j < arr[i]; j++) { // j를 0으로 초기화 / j 가 arr의 열의 값보다 작으면 반복 / 반복 후 j를 1씩 증가 
			System.out.print("*"); 		// (j = 0 < i = 3 이므로  *을 한 개 출력 하고 다시 조건문으로 복귀 => j = 1 < i = 3 이므로 다시 별을 출력하고 이를 반복하고 j가 3이 되서 j = 3 < i = 3에서 마지막으로 *을 출력하고 조건문 나감   
			}System.out.println();     
		}

	}

}
