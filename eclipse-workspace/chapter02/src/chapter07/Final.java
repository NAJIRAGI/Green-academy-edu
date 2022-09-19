package chapter07;

public class Final {
	final static String CONSTANT = "상수";
	final String NAME = "안녕";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final fm = new Final();
		
		System.out.println(fm.NAME);
//		
//		fm.NAME = "반가워"; // final 필드는 상수라 필드에서 값이 지정되면 바뀌지 않는다.
//		
//		Final.CONSTANT = "안 바뀜"; // static으로 선언된 필드는 클래스명.이름 으로 호출함. 
//								 // final 필드는 상수라 필드에서 값이 지정되면 바뀌지 않는다.
	}

}
