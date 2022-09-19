package chapter05;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{5,5,5,5,5},{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}}; //arr 변수에 배열 인덱스 지정.
		
		int sum = 0;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j]; // 행과 열을 반복할 때마다 sum 변수에 누적하여 더하라
				count++; // 반복할 때마다 1씩 증가 (횟수)
			}
			
		}System.out.println("합계 : " + sum);
		 System.out.println("평균 : " + ((double)sum / count));

	}

}
