package interface01;

public class Exam02 {

	public static void main(String[] args) {
		Brotherhood bh = new Brotherhood();
		bh.playGame();
		bh.playSports();
		bh.playChess();
		System.out.println("------------------------");
		OlderBrother ob = new Brotherhood();
		ob.playGame();
		System.out.println("------------------------");
		LittleBrother lb = new Brotherhood();
		lb.playSports();
		System.out.println("------------------------");
		MyBrother mb = new Brotherhood();
		mb.playGame();
		mb.playSports();
		mb.playChess();
	}

}
