package packages;

public class Q04Controller {
	public void init() {
		boolean run = true;
		while(run) {
			int selectNum = Q04View.menu();
			switch(selectNum) {
				case 1: //�Խù� ����   => 1�� ����Ʈ�� Ȯ��=> 2�� ���뺸��  => ����, ���� 
					
					int selectBoardNumber = Q04View.list();
					if(selectBoardNumber !=0) {
						viewContentLogic(selectBoardNumber);
					}
					
					break;
				case 2: // �� ���
					Q04Board Q04board = Q04View.createBoard();
					if(regist(Q04board)) {
						Q04View.registSuccess();
					}else {
						Q04View.registFailure();
					}
					break;
				case 3: // ���α׷� ����
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
		  case 1: // �Խñ� ����
			  Q04Board board = Q04View.Modify(selectBoardNumber);
			  if(board != null) {
				  Q04Main.boards[selectBoardNumber-1] = board;
			  }
			  break;
		  case 2: // �Խñ� ����
			  if(Q04View.deleteBoard(selectBoardNumber)) {
				  Q04Main.boards[selectBoardNumber-1] = null;  
			  }
			  break;
		  case 3://���θ޴� ���ư���
			  return;
		  default:
			  System.out.println("�߸� �Է��߽��ϴ�.");
			  System.out.println("�ٽ� Ȯ���� �ּ���.");
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
