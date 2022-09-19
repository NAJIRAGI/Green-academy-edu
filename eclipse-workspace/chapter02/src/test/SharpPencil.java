package test;

public class SharpPencil extends Pencil {
	private int width;

	public int getAmount() {
		return 100;
	}
}

class Ballpen extends Pencil {
	public int getAmount() {
		return 104;
	}
	
	public String getColor() {
		return "blue";
	}
}
class FountainPen extends Ballpen {		

		public void refill(int n) {
			setAmount(n);
		}
	}

