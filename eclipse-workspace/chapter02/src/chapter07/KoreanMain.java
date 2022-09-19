package chapter07;

public class KoreanMain {

	public static void main(String[] args) {
		
		korea k1 = new korea("이성재" , "010101-1234567");
		System.out.println("k1의 이름 : " + k1.name);
		System.out.println("k1의 주민번호 : " + k1.ssn);
		
		korea k2 = new korea("이상재" , "020202-1234567");
		System.out.println("k2의 이름 : " + k2.name);
		System.out.println("k2의 주민번호 : " + k2.ssn);

	}

}
