package chapter05;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int seat[] = new int[7]; // 좌석의 수를 7개로 지정(빈 공간 배열 할당)
		int count = 0; // 예매한 사람의 수를 세기 위한 변수
		
		
		while(true) { // 반복문을 사용하여 메뉴를 사용하는 동안 내용이 저장되도록 진행
			System.out.println("영화관 메뉴");
			System.out.println("1. 영화 예매");
			System.out.println("2. 종료");
			
			int select = a.nextInt(); // 메뉴 번호를 입력할 수 있도록 스캐너 사용
			
			if (select == 1) { // 입력된 메뉴 번호가 1이라면  아래 구문을 출력하라
				System.out.println("예매하기 메뉴입니다");
				System.out.println("좌석을 선택해 주세요 (0 ~ 6)");
				
				int num = a.nextInt(); // 좌석 번호를 입력할 수 있도록 스캐너 사용
				if (num < 7) {
					if (seat[num] == 1) { // seat 배열이 1이라면 아래 구문을 출력하라
						System.out.println("예약이 완료된 좌석입니다.");
					} else if (seat[num] == 0) { // seat 배열이 0이라면 아래 구문을 실행하라
						seat[num] = 1; // seat의 기본 배열이 0인 상태이므로 1로 증가시켜 예매가 완료되면 다음 실행 시 if문이 실행될 수 있도록 설정
						count++; // 예매가 완료되었으므로 count의 수가 1 증가하여 예매한 사람의 수를 카운트
						System.out.println("예매가 완료 되었습니다."); 
					} for (int i = 0; i < seat.length; i++) { // 7번 반복하라 
						System.out.print(seat[i] + " ");
					}
				} if (num >= 7) {
					System.out.println("해당 좌석은 존재하지 않습니다.");
				}
			} if (select == 2) { // 만약 입력된 메뉴 번호가 2번이라면 아래 구문을 출력하라
				System.out.println("메뉴를 종료합니다.");
				break; // while 나가기
			}
			
		} System.out.println("오늘의 총 매출 액  : " + count * 12000); // 종료 시 count 된 수가 12000원과 곱해져서 총 매출액을 표시할 수 있도록 설정.
		a.close();
				

		}
		

	}


