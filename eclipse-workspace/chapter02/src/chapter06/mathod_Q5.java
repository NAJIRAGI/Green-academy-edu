package chapter06;


public class mathod_Q5 {

	public static void main(String[] args) {	
		
	int[] ar = {78,54,89,57,84,95,74,91,84,67,52,94,82};
	
	
		
	int result = arr(ar);
	
	System.out.println("가장 큰 수는 :  " + result);


	}
	
	public static int arr(int ...valuse) {
		int max = 0;
		for (int i = 0; i < valuse.length; i++) {
			if (max < valuse[i]) {
				max = valuse[i];
			}
		}
		return max;
	}

}
