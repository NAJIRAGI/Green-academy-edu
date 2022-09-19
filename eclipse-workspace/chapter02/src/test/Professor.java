package test;

public class Professor extends Person {
	
	public String getPhone() {
		return "Professor : " + super.getPhone();
	}

	public static void main(String[] args) {
		Professor s = new Professor();
		s.setPhone("010");
		System.out.println(s.getPhone());
		Person p = s;
		System.out.println(p.getPhone());
	}
	
}

