package chapter05;

public class for_up {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {78,85,80,67,92,61};
		int sum = 0;
		
//		for (int i = 0; i < nums.length; i++) {
//			sum += nums[i];
//		}
//		System.out.println("일반 for 문 합계  : " +sum);
//		System.out.println();
		
		for (int n:nums) {
			sum += n;
		}
		System.out.println("향산된 for 문 합계  : " + sum);

	}

}
