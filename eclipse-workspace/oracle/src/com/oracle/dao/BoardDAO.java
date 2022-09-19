package com.oracle.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.oracle.dto.BoardVO;

public class BoardDAO {
	
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {
		return instance;
	}
	
	public Connection getConnection() throws Exception {
		Connection conn = null;
		Context initContext = new InitialContext();
		Context envContext = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
		conn = ds.getConnection();
		return conn;
	}	
	
	public int insert(BoardVO bVo) { // 삽입을 위한 쿼리문
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into board values(nump_seq.nextval,?,?,?,sysdate,?)";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bVo.getTitle());
			pstmt.setString(2, bVo.getNickname());
			pstmt.setString(3, bVo.getText());
			pstmt.setInt(4, bVo.getCnt());
			result = pstmt.executeUpdate();		
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public List<BoardVO> selectAll(){ // 전체 조회하는 기능
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from board order by num desc";
		ArrayList<BoardVO> ls = new ArrayList<BoardVO>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				BoardVO bVo = new BoardVO(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						new Date(rs.getDate(5).getTime()),
						rs.getInt(6));
				ls.add(bVo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		
	}finally {
		try {
			if(rs != null) {
				rs.close();
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
		return ls;
}
	
	
	public BoardVO selectOne(int num){ // 하나만 조회하는 기능
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from board where num = ?";	
		BoardVO bVo = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			updatecnt(num);
			rs = pstmt.executeQuery();
			if(rs.next()) {					
					bVo = new BoardVO(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						new Date(rs.getDate(5).getTime()),
						rs.getInt(6));			
			}
		}catch(Exception e) {
			e.printStackTrace();
		
	}finally {
		try {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
		return bVo;
}
	
	public int updatecnt(int num) { //조회수 올리기
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update board set cnt = cnt+1 where num = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);			
			pstmt.setInt(1,  num);
			result = pstmt.executeUpdate();		
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	
	public int update(BoardVO bVo) { // 수정하기
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update board set title = ?, text = ? where num = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, bVo.getTitle());
			pstmt.setString(2, bVo.getText());
			pstmt.setInt(3, bVo.getNum());
			result = pstmt.executeUpdate();		
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	
	
	
	public int delete(int num) { 
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from board where num = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);			
			pstmt.setInt(1,  num);
			result = pstmt.executeUpdate();		
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	