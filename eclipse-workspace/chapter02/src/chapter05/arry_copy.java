package chapter05;

public class arry_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldarry = {1, 2, 3};
		int[] newarry = new int[5];
		
		System.arraycopy(oldarry, 0, newarry, 1, oldarry.length);
		System.out.print("새로운 배열 값 : ");
		for (int i = 0; i < newarry.length; i++) {
			System.out.print(newarry[i] + " ");			
		}
		
		

	}

}
