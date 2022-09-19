package chapter05;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {78,54,89,57,84,95,74,91,84,67,52,94,82};
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {			
			if (max < arr[i]) { 
				max = arr[i];
				index = i;
			}
		}
		System.out.println("가장 큰 수는  : " + max);
		System.out.println("인덱스는 : " + index);
		
		

	}

}
