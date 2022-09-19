package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet{
	//반드시 HttpServlet을 상속 받아야함 
	private static final long serialVersionUID = 1L;
	//UID 값의 default를 1로 지정 
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//doGet(Get방식에서 호출되는 메서드,기본호출 메서드)HttpServletRequest = 요청 처리하는 객체
		//										HttpServletResponse = 응답 처리하는 객체
		System.out.println("SecondServlet!!");
		// console 창에 띄울 메세지
		PrintWriter out = res.getWriter();
		//PrintWriter는 HttpServlet에 기본적으로 제공되는 Class이다.
		//PrintWriter 타입의 out이라는 변수에 HttpServletResponse에 기본 제공되는 화면 출력해주는 메서드를 저장.
		out.print("<html><head><title>TEST</title></head>");
		out.print("<body><h1>have a nice day!!</h1></body>");
		out.print("</html>");
		out.close();
	}
}
