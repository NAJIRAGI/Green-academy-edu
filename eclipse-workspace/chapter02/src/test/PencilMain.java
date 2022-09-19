package test;

public class PencilMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharpPencil sp = new SharpPencil();
		System.out.println(sp.getAmount());
		Ballpen bp = new Ballpen();
		System.out.println(bp.getAmount());
		System.out.println(bp.getColor());
		FountainPen fp = new FountainPen();
		System.out.println(fp.getAmount());
		System.out.println(fp.getColor());			
		System.out.println(fp.getAmount());


	}

}

