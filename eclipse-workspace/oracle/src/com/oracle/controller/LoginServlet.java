package com.oracle.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oracle.dao.MemberDAO;
import com.oracle.dto.MemberVO;


@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "./member/login.jsp";
		HttpSession session = request.getSession();
		if (session.getAttribute("loginUser") != null) {
			url="./main.jsp"; // 세션이 있으면 메인 페이지로 이동
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response); // 인덱스에서 login 시 세션이 없을 경우 로그인 폼을 호출하고
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "member/login.jsp";
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.userCheck(userid,pwd);
		if(result == 0) {
			request.setAttribute("message", "비밀번호 불일치");
		} else if(result == 1) {
			request.setAttribute("message", "회원 가입 완료");
			MemberVO mVo = mDao.getMember(userid);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser",mVo);
			url="main.jsp";
		} else if(result == -1) {
			request.setAttribute("message", "아이디가 없습니다.");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
