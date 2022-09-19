package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<head><title>Request 정보 출력 Servlet</title></head>");
		out.print("<body>");
		out.print("<h3>요청 헤더 방식</h3>");
		Enumeration<String> em = req.getHeaderNames(); //열거형 원소<String> 타입의 em 변수에 Request한 Header의 이름들을 가져와 저장한다.
		while (em.hasMoreElements()) { //조건 반복문을 통하여 headerName이 있다면
			String s = em.nextElement(); // String type 변수 s에 다음 headerName을 저장한다.
			out.println(s + " : " + req.getHeader(s) + "<br/>"); //저장한 s에 있는 header값을 출력한다.
		}
		out.print("</body></html>");
		out.close();		
	}

}
