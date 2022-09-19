package packages;

public class Q04Controller {
	public void init() {
		boolean run = true;
		while(run) {
			int selectNum = Q04View.menu();
			switch(selectNum) {
				case 1: //게시물 보기   => 1차 리스트를 확인=> 2차 내용보기  => 수정, 삭제 
					
					int selectBoardNumber = Q04View.list();
					if(selectBoardNumber !=0) {
						viewContentLogic(selectBoardNumber);
					}
					
					break;
				case 2: // 글 등록
					Q04Board Q04board = Q04View.createBoard();
					if(regist(Q04board)) {
						Q04View.registSuccess();
					}else {
						Q04View.registFailure();
					}
					break;
				case 3: // 프로그램 종료
					Q04View.programExit();
					break;
				default:
					
			}
		}
	}
	
	
	private void viewContentLogic(int selectBoardNumber) {
		Q04Main.scan.nextLine();
		  int selectUserAction = Q04View.detailContent(selectBoardNumber);	
		  switch(selectUserAction) {
		  case -1:
			  
			  break;
		  case 1: // 게시글 수정
			  Q04Board board = Q04View.Modify(selectBoardNumber);
			  if(board != null) {
				  Q04Main.boards[selectBoardNumber-1] = board;
			  }
			  break;
		  case 2: // 게시글 삭제
			  if(Q04View.deleteBoard(selectBoardNumber)) {
				  Q04Main.boards[selectBoardNumber-1] = null;  
			  }
			  break;
		  case 3://메인메뉴 돌아가기
			  return;
		  default:
			  System.out.println("잘못 입력했습니다.");
			  System.out.println("다시 확인해 주세요.");
		  }
	}
	
	private boolean regist(Q04Board board) {
		boolean result = false;
		for(int i=0;i<Q04Main.boards.length;i++){
			if(Q04Main.boards[i]==null) {
				Q04Main.boards[i]=board;
				result = true;
				break;
			}
		}
		return result;
	}
	
}
