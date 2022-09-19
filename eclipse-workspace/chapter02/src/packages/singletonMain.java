package packages;

public class singletonMain {
	public static void main(String[] args) {
		
		singleton s = singleton.getInstance();
		
		s.setName("이름");
		
		System.out.println(s.getName());
	}
	
	
}
