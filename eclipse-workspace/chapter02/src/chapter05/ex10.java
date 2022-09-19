package chapter05;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		String[] name = { "고길동", "김길동", "이길동", "박길동", "홍길동" }; // name 배열에 5명의 이름을 입력
		int[] kscore = new int[5]; // 국어점수 칸 5개 생성
		int[] escore = new int[5]; // 영어점수 칸 5개 생성
		int[] mscore = new int[5]; // 수학점수 칸 5개 생성
		int[] sumscore = new int[5]; // 5명의 합계 점수를 위한 칸 5개 생성
		double[] avgscore = new double[5]; // 5명의 평균 점수를 위한 칸 5개 생성
		int[] ranking = new int[] { 1, 1, 1, 1, 1 }; // 등수를 위한 배열 생성 후 전부 1로 초기화, 추후 +하는 방식으로 등수를 나누기 위함.

		while (true) { // 프로그램 계속 반복되게 하기 위한 while 반복문.
			System.out.println("성적관리 프로그램");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 조회");
			System.out.println("3. 석차 조회");
			System.out.println("4. 프로그램 종료");
			System.out.print("메뉴 번호 >");

			int menu = a.nextInt();
			if (menu == 1) { // 만약 memu 번호가 1이면 아래 구문 실행.
				System.out.println("성적 입력 메뉴입니다");
				System.out.println("성적을 입력해주세요");
				for (int i = 0; i < name.length; i++) { // 학생 수(name 배열의 길이) 만큼 반복
					System.out.println(name[i] + "학생");
					System.out.print("국어 점수 : ");
					kscore[i] = a.nextInt();
					System.out.print("영어 점수 : ");
					escore[i] = a.nextInt();
					System.out.print("수학 점수 : ");
					mscore[i] = a.nextInt();

					sumscore[i] = kscore[i] + escore[i] + mscore[i]; // 합계 점수는 각 과목별 점수 더한 것.

					avgscore[i] = sumscore[i] / 3.0; // 평균 점수는 합계 점수 / 과목 수(3개)
					for (int j = 0; j < i; j++) { // i번 만큼 반복하라 (i가 위 for문에서 증가하므로 1번만 반복한다)
						if (avgscore[i] < avgscore[j]) { // 만약 평균점수 i가 평균점수 j보다 작다면
							ranking[i]++; // 등수 i를 1씩 증가시킨다. (등수 1등 -> 2등)
						} else { // 만약 평균점수 i가 평균점수 j보다 크면
							ranking[j]++; // 등수 j를 1씩 증가시킨다. (등수 1등 -> 2등)
						}
					}
				}
			} else if (menu == 2) { // menu 번호가 2번이면 아래 구문 실행
				chkScore:while (true) { // 2번째 반복문을 실행(해당 구문만 나갈 수 있도록 변수 이름 설정)
					System.out.println("--- 성적 조회 ---");
					System.out.println("1. 개인별 성적 조회");
					System.out.println("2. 과목별 성적 조회");
					System.out.println("3. 이전 메뉴 돌아가기");
					System.out.print("선택>");

					int selectChkScore = a.nextInt();
					switch (selectChkScore) { // 스위치 구문으로 각 번호별 실행형태 저장
					case 1:// 개인별 성적 조회
						System.out.println("조회할 학생의 이름을 입력하세요.");
						String chkName = a.next();

						int idx = -1; // 해당하지 않은 학생의 번호를 걸러내기 위한 새로운 인덱스 변수 부여
									  // 처음 idx의 값을 -1로 지정하고 아래 for문을 통하여 이름이 일치하면 인덱스값으로 일치하지 않으면 "학생정보를 찾을 수 없다"를 출력

						for (int i = 0; i < name.length; i++) { // 학생 수(name 배열의 길이) 만큼 반복 
							if (chkName.equals(name[i])) { // 만약 학생의 이름이 name 배열과 같으
								idx = i; // idx 변수에 배열 인덱스 i를 넣고 
								break; // 반복문을 취소
							}
						}

						if (idx == -1) { // 만약 idx의 값이 -1이면 아래 구문을 실행하라
							System.out.println("학생 정보를 찾을 수 없습니다.");
						} else {
							System.out.println(name[idx] + "학생 성적 정보");
							System.out.println("국어점수 : " + kscore[idx]);
							System.out.println("영어점수 : " + escore[idx]);
							System.out.println("수학점수 : " + mscore[idx]);
							System.out.println("총      점 : " + sumscore[idx]);
							System.out.println("평      균 : " + avgscore[idx]);
						}

						break;
					case 2:// 과목별 성적 조회
						System.out.println("조회 하려는 과목을 선택하세요.");
						System.out.println("1. 국어 점수");
						System.out.println("2. 영어 점수");
						System.out.println("3. 수학 점수");
						System.out.print("선택>");

						int selectSubjectNum = a.nextInt();

						int[] Score;
						String subject = "";

						if (selectSubjectNum == 1) {
							Score = kscore;
							subject = "국어";
						} else if (selectSubjectNum == 2) {
							Score = escore;
							subject = "영어";
						} else if (selectSubjectNum == 3) {
							Score = mscore;
							subject = "수학";
						} else {
							System.out.println("잘못 입력했습니다.");
							break;
						}

						int sum = 0;
						double avg = 0.0;

						for (int i = 0; i < Score.length; i++) {
							sum += Score[i];
						}
						avg = sum / (double) Score.length;

						System.out.println(subject + "과목의 총점 : " + sum);
						System.out.println(subject + "과목의 평균 : " + avg);

						break;
					case 3:// 이전 메뉴 돌아가기 => while문 종료
						break chkScore;
					default:
						System.out.println("잘못 입력했습니다.");
						System.out.println("다시 확인해 주세요.");
					}

				}

			} else if (menu == 3) {// 석차 조회
				for (int i = 0; i < ranking.length; i++) {
					System.out.println(name[i] + "학생의 석차 : " + ranking[i] + "등");
				}
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 확인해 주세요.");
			}
		}

	}
}
