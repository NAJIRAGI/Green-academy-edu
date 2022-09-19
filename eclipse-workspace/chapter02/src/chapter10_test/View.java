package chapter10_test;

public class View {
	public static int menu() { // 메뉴
		System.out.println("환영합니다! 아래 메뉴를 선택해주세요!");
		System.out.println("[1. 회원가입] / [2. 로그인] / [3. 종료]");
		int select = Main.scan.nextInt();
		return select;
	}

	public static Member signUp() {
		System.out.println("회원 가입 메뉴입니다.");
		System.out.print("이름 : ");
		String m_name = Main.scan.next();
		System.out.print("아이디: ");
		String m_id = Main.scan.next();
		System.out.print("비밀번호: ");
		String m_pwd = Main.scan.next();
		System.out.println("학생이면 1, 선생님이면 2를 입력하세요");
		int m_position = Main.scan.nextInt();
		System.out.println("전공 or 담당과목을 적어주세요");
		String m_subject = Main.scan.next();
		if (m_position == 1) {
			Member mem = new Student(m_name, m_id, m_pwd, m_position, m_subject);
			return mem;
		} else if (m_position == 2) {
			Member mem = new Teacher(m_name, m_id, m_pwd, m_position, m_subject);
			return mem;
		} else
			return null;

	}

	public static String[] login() {
		String account[] = new String[2];
		System.out.println("로그인 메뉴입니다.");
		System.out.print("아이디 : ");
		account[0] = Main.scan.next();
		System.out.print("비밀번호 : ");
		account[1] = Main.scan.next();

		return account;
	}

	public static void succes(int i) {
		System.out.println();
		System.out.println("로그인 하였습니다.");
		System.out.println();
		Main.member[i].work();
		Main.member[i].test();
		System.out.println();

	}

}

class Controller {
	public Controller() {
		if (Main.session == -1) {
			init();
		}
	}

	void init() {
		boolean run = true;

		while (run) {
			int num = View.menu();
			switch (num) {
			case 1:
				Member member = View.signUp();
				int chk = -1;

				for (int i = 0; i < Main.member.length; i++) {
					if (Main.member[i] == null) {
						Main.member[i] = member;
						chk = i;
						break;
					}
				}
				break;
			case 2:
				String[] account = View.login();
				int idx = -1;
				for (int i = 0; i < Main.member.length; i++) {
					if (Main.member[i] == null) {
						continue;
					} else if (Main.member[i].m_id.equals(account[0]) && (Main.member[i].m_pwd.equals(account[1]))) {
						idx = i;
						View.succes(i);

					}
				}
				if (idx == -1) {
					System.out.println("로그인 실패!");
					System.out.println("아이디 또는 비밀번호를 다시 확인해주세요");
				}
				break;
			case 3:
				System.out.println("프로그램이 종료됩니다!");
				run = false;
			}
		}
	}
}
