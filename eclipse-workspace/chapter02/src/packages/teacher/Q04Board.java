package packages;

public class Q04Board {
	private static String site = "���̹�";
	private String title;
	private String author;
	private String content;
	private String deletepw;
	
	public Q04Board(String title,String author,String content,String deletepw) {
		this.title=title;
		this.author=author;
		this.content=content;
		this.deletepw=deletepw;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getauthor() {
		return author;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public  String getDeletepw() {
		return deletepw;
	}
	public void setDeletepw(String deletepw) {
		this.deletepw = deletepw;
	}
	public void prt() {
		System.out.println("����: " + this.title);
		System.out.println("�ۼ���: " + this.author);
		System.out.println("����: " + this.content);
	}	
}
