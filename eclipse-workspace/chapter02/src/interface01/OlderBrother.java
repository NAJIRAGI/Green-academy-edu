package interface01;

public interface OlderBrother {
	void playGame();
}

interface LittleBrother {
	void playSports();
}

interface MyBrother extends OlderBrother, LittleBrother {
	void playChess();
}

class Brotherhood implements MyBrother {
	@Override
	public void playGame() {
		System.out.println("play gmae");
	}
	@Override
	public void playSports() {
		System.out.println("play sports");
	}
	@Override
	public void playChess() {
		System.out.println("play chess");
	}
}

