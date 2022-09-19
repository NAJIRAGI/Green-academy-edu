package chapter04;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		
		do {
			System.out.println(i); // i++이 밑에 있어서 0부터 출력
			i++; // 출력 후 증가 한 다음 밑에 조건을 확인
		}while (i<10); // 0123456789 출력 

	}

}
