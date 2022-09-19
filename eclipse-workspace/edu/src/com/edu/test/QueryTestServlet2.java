package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest22")
public class QueryTestServlet2 extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>GET 방식</h1>");
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String pwd = req.getParameter("password");
		String add = req.getParameter("address");
		String qty = req.getParameter("qty");
		String mail = req.getParameter("email");
		String url = req.getParameter("url");
		String date = req.getParameter("date");
		String cmt = req.getParameter("comment");
		String baseball1 = req.getParameter("baseball");
		String[] team1 = req.getParameterValues("team");
		String baseball2 = req.getParameter("base");
		String[] team2 = req.getParameterValues("five");
		String upload = req.getParameter("upload");
		
		out.print("이름 : " + name + "<br/>");
		out.print("아이디 : " + id + "<br/>");
		out.print("비밀번호 : " + pwd + "<br/>");
		out.print("주소 : " + add + "<br/>");
		out.print("주문수량 : " + qty + "<br/>");
		out.print("이메일 : " + mail + "<br/>");
		out.print("url : " + url + "<br/>");
		out.print("날짜 : " + date + "<br/>");
		out.print("댓글 : " + cmt + "<br/>");		
		out.print("야구 : " + baseball1 + "<br/>");
				
		for (int i = 0; i < team1.length; i++) {
			out.print("4강팀 : "+ i + team1[i] + "<br/>");
		}		
		out.print("야구 : " + baseball2 + "<br/>");
	
		for (int i = 0; i < team2.length; i++) {
			out.print("5강팀 : "+ i + team2[i] + "<br/>");
		}	
		out.print("업로드 : " + upload + "<br/>");
		out.print("</body></html>");
		out.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		out.print("<h1>POST 방식</h1>");
		String name = req.getParameter("name");
		String id = req.getParameter("id");
		String pwd = req.getParameter("password");
		String add = req.getParameter("address");
		String qty = req.getParameter("qty");
		String mail = req.getParameter("email");
		String url = req.getParameter("url");
		String date = req.getParameter("date");
		String cmt = req.getParameter("comment");
		String baseball1 = req.getParameter("baseball");
		String[] team1 = req.getParameterValues("team");
		String baseball2 = req.getParameter("base");
		String[] team2 = req.getParameterValues("five");
		String upload = req.getParameter("upload");
		
		out.print("이름 : " + name + "<br/>");
		out.print("아이디 : " + id + "<br/>");
		out.print("비밀번호 : " + pwd + "<br/>");
		out.print("주소 : " + add + "<br/>");
		out.print("주문수량 : " + qty + "<br/>");
		out.print("이메일 : " + mail + "<br/>");
		out.print("url : " + url + "<br/>");
		out.print("날짜 : " + date + "<br/>");
		out.print("댓글 : " + cmt + "<br/>");		
		out.print("야구 : " + baseball1 + "<br/>");
				
		for (int i = 0; i < team1.length; i++) {
			out.print("4강팀 : "+ i + team1[i] + "<br/>");
		}		
		out.print("야구 : " + baseball2 + "<br/>");
	
		for (int i = 0; i < team2.length; i++) {
			out.print("5강팀 : "+ i + team2[i] + "<br/>");
		}	
		out.print("업로드 : " + upload + "<br/>");
		out.print("</body></html>");
		out.close();
	}
	
}
