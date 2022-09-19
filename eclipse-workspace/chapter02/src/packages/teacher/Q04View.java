package packages;

public class Q04View {
	
	public static int menu() {
		System.out.println("환영합니다 ^^");
		System.out.println("1.게시 보기  2.글 작성  3.종료");
		System.out.println("번호를 입력해주세요");
		System.out.println(">");
		int selectNum = Q04Main.scan.nextInt();
		return selectNum;
	}
	
	public static int list() {
		System.out.println("***리스트 목록을 확인하세요****");
		for(int i=0; i<Q04Main.boards.length;i++) {
			if(Q04Main.boards[i] == null) continue;
			else {
				System.out.println((i+1)+"번째 게시글: " + Q04Main.boards[i].getTitle());
			}
		}
		return viewContent();
	}

	public static int viewContent() {
		System.out.println("보고싶은 게시글의 번호를 선택하세요.");
		System.out.println("(0번 입력시 메인 메뉴로 돌아갑니다.)");
		int selectBoard = Q04Main.scan.nextInt();
		return selectBoard;
	}
	
	public static Q04Board createBoard() {
		Q04Main.scan.nextLine();
		System.out.println("게시물을 작성합니다.");
		System.out.println("작성자를 입력하세요>");
		String author = Q04Main.scan.nextLine();
		
		System.out.println("제목을 입력하세요>");
		String title = Q04Main.scan.nextLine();
		
		System.out.println("글 내용을 입력하세요.");
		String content = Q04Main.scan.nextLine();
		
		System.out.println("삭제나 수정시 사용할 비밀번호를 입력하세요.");
		String password = Q04Main.scan.nextLine();
		
		Q04Board b = new Q04Board(title,author,content,password);

		return b;
	}
	
	public static void registSuccess() {
		System.out.println("글 등록 성공");
	}
	
	public static void registFailure() {
		System.out.println("글 등록에 오류가 있습니다.");
	}
	
	public static void programExit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	public static int detailContent(int selectBoardNumber) {
	//	Q04Main.scan.nextLine();
		int selectUserAction = -1;
		if(Q04Main.boards[selectBoardNumber-1] == null) {
			System.out.println("해당 게시물은 없습니다. 다시 확인해 주세요.");
			
		}else {
			Q04Main.boards[selectBoardNumber-1].prt();//게시물 내용 보기
			System.out.println("1.수정 | 2.삭제 | 3.돌아가기");
			System.out.print("선택>");
			selectUserAction = Integer.parseInt(Q04Main.scan.nextLine());
		}
		
		return selectUserAction;	
	}

	public static boolean deleteBoard(int selectBoardNumber) {
//		Q04Main.scan.nextLine();
		System.out.println(selectBoardNumber+"번 게시물을 삭제하시겠습니까?(y/n)");
		String selectDelete = Q04Main.scan.nextLine();
		if(selectDelete.equals("Y") || selectDelete.equals("y")) {
			System.out.println("삭제 암호를 입력하세요.");
			String password = Q04Main.scan.nextLine();
			if(Q04Main.boards[selectBoardNumber-1].getDeletepw().equals(password)) {
				System.out.println("게시글을 삭제합니다.");
				return true;
			}else {
				System.out.println("비밀번호가 틀립니다.");
				return false;
			}
		}
		return false;
	}

	public static Q04Board Modify(int selectBoardNumber) {
	//	Q04Main.scan.nextLine();
		Q04Board board = null;
		System.out.println(selectBoardNumber+"번 게시물을 수정하시겠습니까?(y/n)");
		String selectDelete = Q04Main.scan.nextLine();
		if(selectDelete.equals("Y") || selectDelete.equals("y")) {
			System.out.println("수정 암호를 입력하세요.");
			String password = Q04Main.scan.nextLine();
			if(Q04Main.boards[selectBoardNumber-1].getDeletepw().equals(password)) {
				System.out.println("게시물을 수정합니다.");
				System.out.println("작성자를 입력하세요>");
				String author = Q04Main.scan.nextLine();
//				Main.boards[selectBoardNumber-1].setAuthor(author);
				
				System.out.println("제목을 입력하세요>");
				String title = Q04Main.scan.nextLine();
//				Main.boards[selectBoardNumber-1].setTitle(title);
				
				System.out.println("글 내용을 입력하세요.");
				String content = Q04Main.scan.nextLine();
//				Main.boards[selectBoardNumber-1].setContent(content);
				
				System.out.println("삭제나 수정시 사용할 비밀번호를 입력하세요.");
				String modifyPassword = Q04Main.scan.nextLine();
//				Main.boards[selectBoardNumber-1].setPassword(modifyPassword);
				
				board = new Q04Board(title,author,content,modifyPassword);
			}else {
				System.out.println("비밀번호가 틀립니다.");
			}
		}
		
		return board;
	}
}
