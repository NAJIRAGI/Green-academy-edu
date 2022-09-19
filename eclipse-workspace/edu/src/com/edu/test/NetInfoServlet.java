package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>Request 정보 출력</h3>");
		out.print(req.getScheme()+"<br>");
		out.print(req.getServerName()+"<br>");
		out.print(req.getLocalAddr()+"<br>");
		out.print(req.getServerPort()+"<br>");
		out.print(req.getRemoteAddr()+"<br>");
		out.print(req.getRemoteHost()+"<br>");
		out.print(req.getRemotePort()+"<br>");
		out.print("</body></html>");
		out.close();
	}

}
