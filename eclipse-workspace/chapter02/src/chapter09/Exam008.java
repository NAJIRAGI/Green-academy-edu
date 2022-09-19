package chapter09;

class ai {
	public String x() {
		return "ai.x";
	}
}
class bi extends ai {
	@Override
	public String x() {
		return "bi.x";
	}
	public String y() {
		return "y";
	}
}

public class Exam008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ai ex = new bi();
		System.out.println(ex.x());
	}

}
