package packages;

import java.util.Scanner;

public class Q3Main {
	static Scanner scan = new Scanner(System.in);
	static Q3[] member = new Q3[100];
	
	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("홈페이지 방문을 환영합니다.");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.회원가입  2.로그인  3.종료");
			System.out.print(">> : ");
			
			int select = scan.nextInt();
			
			switch(select) {
			case 1 :
				System.out.println("회원 가입 메뉴입니다.");
				System.out.print("아이디 : ");
				String id = scan.next();
				System.out.println();
				System.out.print("비밀번호 : ");
				String pw = scan.next();
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("전화번호(-생략) : ");
				String tel = scan.next();
				
				Q3 newMember = new Q3(id,pw,name,tel);
				
				for (int i = 0; i<member.length; i++) {
					if (member[i] == null) {
						member[i] = newMember;
						break;
					}		
				}
				System.out.println("회원가입 완료!");
				break;
			case 2 : 
				int chkidpw = -1;
				System.out.println("아이디와 비밀번호를 입력해주세요");
				System.out.print("아이디 : ");
				String uid = scan.next();
				System.out.print("비밀번호 : ");
				String upw = scan.next();
				
				for (int i = 0; i < member.length; i++) {
					if(member[i] == null) {
						continue;
					}else if (member[i].getId().equals(uid)) {
						if (member[i].getPw().equals(upw)) {
							chkidpw = i;
							break;
						}
					}				
				}
				if (chkidpw == -1) {
					System.out.println("존재하지 않는 회원입니다. 다시 입력해주세요");	
				} else {
					member[chkidpw].prt();
				}
				break;	
			case 3 :
				System.out.println("종료합니다.");
				run = false;
				break;
			default :
				System.out.println("잘못된 입력입니다.");
				System.out.println("다시 입력해주세요.");
				
			}
		}

	}

}
