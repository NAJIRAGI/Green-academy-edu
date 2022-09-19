package packages;

public class Q2 {
	private Q2() {}
	
	private static Q2 s = new Q2();
	public static Q2 getInstance() {
		return s;
	}
	
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
