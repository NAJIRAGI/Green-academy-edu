package com.board.dto;

import java.util.*;

public class BoardVO {

	private int listno;
	private String title;
	private String writer;
	private String maintext;
	private Date hiredate;
	private int vcnt;
	
	
	public int getListno() {
		return listno;
	}
	public void setListno(int listno) {
		this.listno = listno;
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
	public String getMaintext() {
		return maintext;
	}
	public void setMaintext(String maintext) {
		this.maintext = maintext;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getVcnt() {
		return vcnt;
	}
	public void setVcnt(int vcnt) {
		this.vcnt = vcnt;
	}
	
	
	
}
