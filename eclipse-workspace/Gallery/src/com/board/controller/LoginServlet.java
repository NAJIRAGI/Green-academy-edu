package com.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.board.dao.MemberDAO;
import com.board.dto.MemberVO;


@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "board/login.jsp";
		HttpSession session = request.getSession();
		if(session.getAttribute("loginUser") != null) {
			url="main.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "board/login.jsp";
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		MemberDAO mDao = MemberDAO.getInstance();
		int result = mDao.userCheck(userid,pwd);
		if(result == 0) {
			request.setAttribute("message", "비밀번호 불일치");
		}else if (result == 1) {
			request.setAttribute("message", "로그인 완료");
			MemberVO mVo = mDao.getMember(userid);
			HttpSession session = request.getSession();
			session.setAttribute("loginUser",mVo);
			url="main.jsp";
		}else if (result == -1) {
			request.setAttribute("message", "아이디 없음");
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
