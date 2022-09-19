package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>요청 헤더 정보</h3>");
		out.print(req.getRequestURI()+"<br>");
		out.print(req.getRequestURL()+"<br>");
		out.print(req.getContextPath()+"<br>");
		out.print(req.getProtocol()+"<br>");
		out.print(req.getServletPath()+"<br>");
		out.print("</body></html>");
		out.close();
	
	}

}
