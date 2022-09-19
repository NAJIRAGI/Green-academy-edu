package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet3")
public class TestServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String userno = request.getParameter("userno1");
		String userno2 = request.getParameter("userno2");
		String id = request.getParameter("userid");
		String pwd1 = request.getParameter("pwd1");		
		String email1 = request.getParameter("email1");
		String email2 = request.getParameter("email2");
		String addno = request.getParameter("addno");
		String address1 = request.getParameter("address1");
		String address2 = request.getParameter("address2");
		String tel = request.getParameter("tel");
		String jobs[] = request.getParameterValues("job");		
		String items[] = request.getParameterValues("item");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><body>");
		out.println("이름 : <b>");
		out.println(name);
		out.println("</b><br> 주민번호 : <b>");
		out.println(userno+"-"+userno2);
		out.println("</b><br> 아이디 : <b>");
		out.println(id);
		out.println("</b><br> 비밀번호 : <b>");
		out.println(pwd1);
		out.println("</b><br> 이메일 : <b>");
		out.println(email1 + "@" + email2);
		out.println("</b><br> 우편번호 : <b>");
		out.println(addno);
		out.println("</b><br> 주소 : <b>");
		out.println(address1 + address2);
		out.println("</b><br> 연락처 : <b>");
		out.println(tel);
		out.println("</b><br> 직업 : <b>");
		for (String job : jobs) {
			out.print(job + " ");
		}
		out.println("</b><br> 관심 분야 : <b>");
			for (String item : items) {
				out.print(item + " ");
			}		
		
		out.print("<br><a href='javascript:history.go(-1)'> 다시 </a>");
		out.print("</body></html>");
		out.close();
	}

	
}
