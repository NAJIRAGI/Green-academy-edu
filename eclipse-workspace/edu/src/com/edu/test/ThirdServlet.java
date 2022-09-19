package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init method");
	}
	public void destroy() {
		System.out.println("destory method");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doGet method");
		res.setContentType("text/html;charset=UTF-8");
		//한글을 읽기 위해서 서버에서 클라이언트로 보내는 응답객체에 한글에 대한 설정값을 주어야한다.
		//한글을 읽기 전인 헤더 부분에 줘야한다.
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>hello world</title>");
		out.println("</head>");
		out.println("<body>");
			out.println("<h1>hello servlet</h1>");
			out.println("<div>한글을 적어봅시다</div>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
