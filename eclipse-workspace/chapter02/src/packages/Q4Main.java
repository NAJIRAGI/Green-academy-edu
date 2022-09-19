package packages;

import java.util.Scanner;

public class Q4Main {
	static Scanner scan = new Scanner(System.in);
	static Q4[] homp = new Q4[50];

	public static void main(String[] args) {
		boolean run = true;
		int count = 0;
		while (run) {
			System.out.println("게시판에 오신걸 환영합니다");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 게시글 보기  2. 글 작성하기  3. 글 삭제   4. 종료");
			System.out.print(">> ");

			int num = scan.nextInt();

			switch (num) {
			case 1:				
				for (int i = 0; i < homp.length; i++) {
					if (homp[i] != null) {		
						System.out.println((i + 1) + ". " + homp[i].getTitle());
					}						
				}
				int chkpw = -1;
				System.out.println("게시글 번호를 입력해주세요");
				System.out.print(">");
				int num2 = scan.nextInt();

				for (int i = 0; i < homp.length; i++) {
					if (homp[i] == null) {
						continue;
					} else if ((num2 - 1) == i) {
						chkpw = i;
						break;
					}
				}
				if (chkpw == -1) {
					System.out.println("게시글이 없습니다.");
					System.out.println();
				} else {
					homp[chkpw].prt();
					System.out.println();
				}

				break;
			case 2:
				System.out.println("작성하실 글의 제목을 알려주세요");
				System.out.print(">>");
				String title = scan.next();
				System.out.println("작성하신 분의 성함을 알려주세요");
				System.out.print(">>");
				String writer = scan.next();
				System.out.println("작성된 글을 보호하기 위한 비밀번호를 입력하세요");
				System.out.print(">>");
				int pw = scan.nextInt();
				System.out.println("내용을 작성해주세요");
				System.out.print(">>");
				String contents = scan.next();
				Q4 newHomp = new Q4(title, writer, pw, contents);

				for (int i = 0; i < homp.length; i++) {
					if (homp[i] == null) {
						homp[i] = newHomp;
						count++;
						break;
					}
				}
				System.out.println("글 작성 완료");
				System.out.println();
				System.out.println();
				break;
			case 3:
				for (int i = 0; i < homp.length; i++) {
					if (homp[i] == null) {
						break;
					} else
						System.out.println((i + 1) + ". " + homp[i].getTitle());
				}
				int chkpw1 = -1;
				System.out.println("삭제할 게시글 번호를 입력해주세요");
				System.out.print(">");
				int num3 = scan.nextInt();

				for (int i = 0; i < homp.length; i++) {
					if (homp[i] == null) {
						continue;
					} else if ((num3 - 1) == i) {
						chkpw1 = i;
						break;
					}
				}
				if (chkpw1 == -1) {
					System.out.println("게시글이 없습니다.");
				} else {
					System.out.println("삭제 비밀번호를 입력해주세요");
					System.out.print(">>");
					int upw = scan.nextInt();	
					if(upw == homp[chkpw1].getPw()) {
						homp[chkpw1] = null;
					} else {
						System.out.println("비밀번호 틀렸습니다.");
					}
				}
				break;
			case 4 :
				run = false;
				System.out.println("종료합니다.");
			}

		}

	}

}
