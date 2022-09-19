package chapter04;

public class iffor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int num = 0;
		for(int i = 1; i <= 100; i++) {	
			if(i % 7 == 0){				
				sum += i;
				num++;
			}
		}
		System.out.println("7의 배수의 갯수는 : " + num);
		System.out.println("7의 배수의 합은 : " + sum);
		System.out.println("7의 배수의 평균 : " + (sum/num));

	}

}
