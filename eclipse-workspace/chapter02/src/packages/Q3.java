package packages;

public class Q3 {
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	Q3 (String id, String pw, String name, String tel) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
	}
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public void prt() {
		System.out.println();
		System.out.println("회원 이름 : " + getName());
		System.out.println("회원 전화번호 : " + getTel());
	}
	
	

}
