package com.edu01.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("test!!");	
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>hello world</title>");
		out.println("</head>");
		out.println("<body>");
			out.println("<h1>좋은 하루</h1>");
			out.println("<h3>화이팅~^^</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
