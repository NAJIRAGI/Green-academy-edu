package com.oracle.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ex01 {
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 드라이버 찾기
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","1234");
			// 드라이버 등록 후 connect 객체 생성 (연결할 데이터베이스 정보 입력)
			stmt = conn.createStatement();
			// SQL 쿼리 객체 생성
			rs = stmt.executeQuery("select * from member");
			// 생성된 쿼리 객체를 전송(데이터베이스 테이블 정보)
			
			while(rs.next()) {
			// 반복문으로 데이터 베이스의 행마다 아래 정보를 출력
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("userid"));
				System.out.println(rs.getString("userpwd"));
				System.out.println(rs.getString("email"));
				System.out.println(rs.getString("phone"));
				System.out.println(rs.getString("admin"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {			
				if(rs != null) {
					rs.close();
				// 해제 시 반대의 순서로 진행한다.(생성 : conn->stmt->rs / 해제 : rs->stmt->conn)	
				}
				if(stmt != null) {
					stmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
