package chapter04test;

import java.util.Scanner;

public class ex3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);

		System.out.println("3번 문제");

		String id = "grean";
		String pw = "123456";

		String uid = a.next();
		String upw = a.next();

		System.out.println(uid.equals(id));
		System.out.println(upw.equals(pw));

		if (uid.equals(id)) {
			System.out.println("비밀번호 입력");
		} else
			System.out.println("로그인 실패");
		a.close();
	}

}
