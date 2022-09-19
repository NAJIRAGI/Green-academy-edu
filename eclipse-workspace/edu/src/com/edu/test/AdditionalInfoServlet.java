package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addInfo")
public class AdditionalInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력</title></head>");
		out.print("<body>");
		out.print("<h3>추가적인 요청 정보</h3>");
		out.print(req.getMethod()+"<br>");
		out.print(req.getPathInfo()+"<br>");
		out.print(req.getPathTranslated()+"<br>");
		out.print(req.getQueryString()+"<br>");
		out.print(req.getContentLength()+"<br>");
		out.print(req.getContentType()+"<br>");
		out.print("</body></html>");
		out.close();		
	}
}
