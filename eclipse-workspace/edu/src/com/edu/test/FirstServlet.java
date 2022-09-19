package com.edu.test;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public void init() {
		System.out.println("init");
	}
	
	public void service(ServletRequest request, ServletResponse response) {
		System.out.println("service");
	}
}
