package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LocalTestServlet")
public class LocalTestServlet extends HttpServlet {	
	String str;
	int num;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		num = 0;
		str = req.getParameter("msg");
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html><head><title>multi</title></head>");
		out.print("<body><h2>처리 결과(지역 변수)</h2>");
		while (num++ < 10) {
			out.print(str + " : " + num + "<br>");
			out.flush();
			System.out.println(str + ":" + num);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	
		out.print(str+"!!");
		out.print("</body></html>");
	}

}
