package test;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1. 사용자로부터 좌석번호(인덱스)를 입력받아 예매하는 시스템
		 * 2. 예매가 완료되면 행당 좌석의 값을 1로 변경
		 * 3. 이미 예매가 완료된 좌석은 재구매 불가
		 * 4. 프로그램 종료 후 영화관 매출액 출력 (한 좌석당 12,000원)
		 * */
		
		Scanner scan = new Scanner(System.in);
		//영화관 좌석 예매
		int[] seat = new int[7]; //좌석의 수		
		int count = 0; //예매한 사람의 수
		boolean tf = true;
		while(tf) {
			System.out.println("그린 영화관");
			System.out.println("1. 좌석 선택");
			System.out.println("2. 종료");
			int sel = scan.nextInt();
			if (sel == 1) {
				System.out.println("예매하기 메뉴입니다");
				System.out.println("좌석을 선택해 주세요 (0 ~ 6)");
				int num = scan.nextInt();
				if (num < 7) {
					if (seat[num] == 1) { 
						System.out.println("예약이 완료된 좌석입니다.");
					} else if (seat[num] == 0) { 
						seat[num] = 1; 
						count++; //
						System.out.println("예매가 완료 되었습니다."); 
					} for (int i = 0; i < seat.length; i++) { 
						System.out.print(seat[i] + " ");
					}
				} if (num >= 7) {
					System.out.println("해당 좌석은 존재하지 않습니다.");
				}
			}if (sel == 2) {
				System.out.println("프로그램을 종료합니다");
				tf = false;
		}			
		}
		 System.out.println("오늘의 총 매출 액  : " + count * 12000);
		 scan.close();
	} 
	

}
