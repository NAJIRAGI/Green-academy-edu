package com.oracle.test;

import java.sql.*;
import java.util.*;

public class DelEMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		//입력값을 받기 위한 Scanner 객체 생성 (변수 명 : sc)
		
		try {
			// 예외 처리
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// Driver 찾기
		} catch (ClassNotFoundException e) {
			// 예외 처리할 오류
			e.printStackTrace();
		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		// 변수 명 : url 에 데이터베이스 정보 저장
		String user = "hr";
		// 변수 명 : user 에 데이터베이스 계정명 저장 
		String pass = "1234";
		// 변수 명 : user 에 데이터베이스 암호 저장
		
		Connection con = null;
		// Connection 객체 생성 (변수 명 : null)
		
		try {
			con = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("삭제할 명단 이름 : ");
		String name = sc.next();
		sc.nextLine();
		
		String sql = "DELETE FROM EMP WHERE NAME = ?";
		
		PreparedStatement psm = null;
		
		try {
			psm = con.prepareStatement(sql);
			psm.setString(1, name);
			
			int res = psm.executeUpdate();
			if (res > 0) {
				System.out.println("삭제 완료");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			try {
				psm.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		sc.close();
	}

}
