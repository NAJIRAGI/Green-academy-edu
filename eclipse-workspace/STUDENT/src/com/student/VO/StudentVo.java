package com.student.VO;

public class StudentVo {
	
	private int stuno;
	private String name;
	private String cname;
	private int kor;
	private int eng;
	private int mat;
	private int his;
	
	public StudentVo() {}	
	
	public StudentVo(int stuno, String name, String cname, int kor, int eng, int mat, int his) {
		super();
		this.stuno = stuno;
		this.name = name;
		this.cname = cname;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.his = his;
	}
	public int getStuno() {
		return stuno;
	}
	public void setStuno(int stuno) {
		this.stuno = stuno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getHis() {
		return his;
	}
	public void setHis(int his) {
		this.his = his;
	}

	@Override
	public String toString() {
		return "StudentVo [stuno=" + stuno + ", name=" + name + ", cname=" + cname + ", kor=" + kor + ", eng=" + eng
				+ ", mat=" + mat + ", his=" + his + "]";
	}
	
}
