package test;

class AA1 {
	public AA1() {System.out.println("A");}
	public AA1 (int x) {System.out.println("A : " + x);}	
}
class BB2 extends AA1 {
	public BB2 () {super(100);}
	public BB2 (int x) {System.out.println("B" + x);}
}
public class AA {
	public static void main(String[] args) {
	
		BB2 b1 = new BB2(11);
		
		BB2 b2 = new BB2();
	}
 
}