package com.oracle.dto;

import java.util.Date;

public class BoardVO {
	private int num;
	private String title;
	private String nickname;
	private String text;
	private Date hiredate;
	private int cnt;
	
	
	public BoardVO() {}
	
	public BoardVO(int num, String title, String nickname, String text, Date hiredate, int cnt) {
		super();
		this.num = num;
		this.title = title;
		this.nickname = nickname;
		this.text = text;
		this.hiredate = hiredate;
		this.cnt = cnt;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", title=" + title + ", nickname=" + nickname + ", text=" + text + ", hiredate="
				+ hiredate + ", cnt=" + cnt + "]";
	}
	
	
	
	
}
