package com.oracle.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


import com.oracle.dto.MemberVO;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getInstance() {
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
	
	public int userCheck(String userid, String pwd) {
		int result = -1;
		String sql = "select userpwd from member where userid = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs.next()) { // 값이 있을 경우 아이디는 이미 확인이 끝난 상태이므로 비밀번호만 비교하면 됨.
				if(rs.getString("userpwd") != null && rs.getString("userpwd").equals(pwd)) {
					result = 1;
					// 비밀번호가 비어있지 않고 일치하면 result 값 1로 변경
				} else {
					result = 0;
					// 비밀번호 불일치 시 0으로 변경
				}
			} else {
				result = -1;
				// 아이디 불일치 시 -1로 변경
			}
		} catch(Exception e) {
			e.printStackTrace();
	}
		return result;
  }
	public MemberVO getMember(String userid) {
		MemberVO mVo = null;
		String sql = "select * from member where userid = ?"; 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				mVo = new MemberVO();
				mVo.setName(rs.getString("name"));
				mVo.setUserid(rs.getString("userid"));
				mVo.setPwd(rs.getString("userpwd"));
				mVo.setEmail(rs.getString("email"));
				mVo.setPhone(rs.getString("phone"));
				mVo.setAdmin(rs.getInt("admin"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
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
		return mVo;
	}
	
	public int insertMember(MemberVO mVo) {
		int result = -1;
		String sql = "insert into member values(?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getName());
			pstmt.setString(2, mVo.getUserid());
			pstmt.setString(3, mVo.getPwd());
			pstmt.setString(4, mVo.getEmail());
			pstmt.setString(5, mVo.getPhone());
			pstmt.setInt(6, mVo.getAdmin());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
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
	
	public int confirmID(String userid) {
		int result=-1;
		String sql="select userid from member where userid=?";
		Connection conn = null;
		PreparedStatement pstmt =null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				result=1;
				System.out.println("이상없음");
			}else {
				result=-1;
				System.out.println("이상있음");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int updateMember(MemberVO mVo) {
		int result = -1;
		String sql = "update member set userpwd = ?, email = ?, phone = ?, admin = ? where userid = ?";
		Connection conn = null;
		PreparedStatement pstmt =null;
		
		try {
			conn = getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getPwd());
			pstmt.setString(2, mVo.getEmail());
			pstmt.setString(3, mVo.getPhone());
			pstmt.setInt(4, mVo.getAdmin());
			pstmt.setString(5, mVo.getUserid());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public List<MemberVO> selectAll() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from member";
		ArrayList<MemberVO> ls = new ArrayList<MemberVO>();
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				MemberVO mVo = new MemberVO (
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6));
				ls.add(mVo);
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
	
	public int update(MemberVO mVo) { // 수정하기
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update board set userpwd = ?, email = ?, phone = ? where userid = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mVo.getPwd());
			pstmt.setString(2, mVo.getEmail());
			pstmt.setString(3, mVo.getPhone());
			pstmt.setString(4, mVo.getUserid());
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
	
	public MemberVO selectOne(String userid) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from member where userid = ?";
		MemberVO mVo = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				mVo = new MemberVO (
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getString(5),
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
			return mVo;
	}
	
	public int delete(String userid) { 
		int result = -1;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from member where userid = ?";
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);			
			pstmt.setString(1, userid);
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
