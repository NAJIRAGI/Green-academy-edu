package chapter06;

public class mathod4 {
	     //static(공유자원/정적메서드)이 붙으면 따로 객체 설정 없이 메서드를 사용 가능함.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		               //객체로 메서드를 생성하여 메모리로 불러와 사용.
		mathod4_1 com = new mathod4_1(); 
		int[] valuse = {1,2,3};
		int result = com.sum1(valuse);
		System.out.println("result : " + result);
		
		int result2 = com.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : " + result2);
		
		int result3 = com.sum2(valuse);
		System.out.println("result3 : " + result3);
		
		int result4 = com.sum2(1,2,3,4,5);
		System.out.println("result4 : " + result4);

	}

}
