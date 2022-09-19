package chapter11;

public class Oschk {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("userName");
		String userHome = System.getProperty("userHome");
		
		System.out.println("운영체제 : " + osName);
		System.out.println("사용자 이름 : "  + userName);
		System.out.println("사용자 홈 : " + userHome);
		
	}

}
