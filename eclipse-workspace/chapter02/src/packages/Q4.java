package packages;

import java.util.Scanner;

public class Q4 {
	private String title;
	private String writer;	
	private int pw;
	private String contents;
	private int num = 0;
	
	static Scanner scan = new Scanner(System.in);
	
	Q4(String title, String writer, int pw, String contents) {
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.pw = pw;		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;	}

	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public void prt() {
		System.out.println("글 제목 : " + getTitle());
		System.out.println("작성자 : " + getWriter());
		System.out.println("글 내용 : " + getContents());
	}
	
	
	
}
