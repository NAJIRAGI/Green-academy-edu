package review;

import java.util.Scanner;

public class Aclass_1 {
// 구구단을 출력하는 메서드 생성
	public static void gugudan(int n, int m) {
		if (n > m) {
			for (int i = m; i <= n; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j +"="+(i*j));
				}
			}
		} else if (n < m) {
			for (int i = n; i <= m; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + "*" + j +"="+(i*j));
				}
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int j = scan.nextInt();
		gugudan(i,j);
	scan.close();
	
	}
	
}
