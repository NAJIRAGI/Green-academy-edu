package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/QueryTest2Servlet")
public class QueryTest2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>문자열</title></head>");
		out.print("<body>");
		out.print("<h1>post 전체 문자열 추출</h1>");
		ServletInputStream input = request.getInputStream();
		int len = request.getContentLength();
		byte[] buf = new byte[len];
		input.readLine(buf, 0, len);
		String s = new String(buf);
		out.print("전체 문자열" + s);
		out.println("</body></html>");
		out.close();
	}

}
