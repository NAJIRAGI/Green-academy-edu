package chapter07;

public class Card {
	int num = 1;
	boolean chk = true;

	Card() {
	}

	Card(int n, boolean k) {
		this.num = n;
		this.chk = k;
		
	}

	public String info() {
		String str ="";
		if (chk == false) {
			str = String.valueOf(num) + "k";
			
		} else {
			str = num +"";
			
	} return str;
			
	
	
	}
}
