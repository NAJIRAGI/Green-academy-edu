package chapter04;

public class if2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 100~90 입니다");
			System.out.println("등급은 A 입니다");
		} else if(score >= 80) {
			System.out.println("점수가 80~89 입니다");
			System.out.println("등급은 B 입니다");
		} else if(score >= 70) { 
			System.out.println("점수가 70~89입니다");
			System.out.println("등급은 C 입니다");
		} else {
			System.out.println("점수가 70점 미만입니다");
			System.out.println("등급은 D 입니다");
		}
	}

}
