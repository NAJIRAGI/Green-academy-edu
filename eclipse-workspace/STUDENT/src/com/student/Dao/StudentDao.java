package com.student.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.student.VO.StudentVo;
import com.student.common.JdbcUtil;

public class StudentDao {
	private JdbcUtil ju;
	
	public StudentDao() {
		ju = JdbcUtil.getInstance();
	}
	
	//삽입
	public int insert(StudentVo vo) {
		Connection con = null;
		PreparedStatement pstmt = null;
		String query = "insert into STUDENT values (STUDENT_SEQ.nextval,?,?,?,?,?,?)";
		int ret = -1;
		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getCname());
			pstmt.setInt(3, vo.getKor());
			pstmt.setInt(4, vo.getEng());
			pstmt.setInt(5, vo.getMat());
			pstmt.setInt(6, vo.getHis());
			ret = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
 				} catch (SQLException e) {
 					e.printStackTrace();
 				}
			}
			
		}
		return ret;
	}
	
	
	
	// 전체 조회
	public List<StudentVo> selectAll() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from STUDENT order by stuno desc";
		ArrayList<StudentVo> ls = new ArrayList<StudentVo>();
		
		try {
			con = ju.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				StudentVo vo = new StudentVo(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getInt(5),
						rs.getInt(6),
						rs.getInt(7)
						);
				ls.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
 				} catch (SQLException e) {
 					e.printStackTrace();
 				}
			}
			
			
		}
		
		return ls;
	} 
	
	
	// 하나만 조회
		public StudentVo selectOne(int stuno) {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String query = "select * from STUDENT where stuno = ?";
			StudentVo vo = null;
			
			try {
				con = ju.getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, stuno);
				rs = pstmt.executeQuery();
				if (rs.next()) {
					vo = new StudentVo(
							rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getInt(4),
							rs.getInt(5),
							rs.getInt(6),
							rs.getInt(7)
							);				
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (con != null) {
					try {
						con.close();
	 				} catch (SQLException e) {
	 					e.printStackTrace();
	 				}
				}
				
				
			}
			
			return vo;
		} 
	
		//수정
		public int update(StudentVo vo) {
			Connection con = null;
			PreparedStatement pstmt = null;
			String query = "update STUDENT set kor = ?, eng = ?, mat = ?, his = ? where stuno = ?";
			int ret = -1;
			try {
				con = ju.getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, vo.getKor());
				pstmt.setInt(2, vo.getEng());
				pstmt.setInt(3, vo.getMat());
				pstmt.setInt(4, vo.getHis());
				pstmt.setInt(5, vo.getStuno());
				ret = pstmt.executeUpdate();
				}catch (SQLException e) {
					e.printStackTrace();
				}finally {
					
					if (pstmt != null) {
						try {
							pstmt.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					if (con != null) {
						try {
							con.close();
		 				} catch (SQLException e) {
		 					e.printStackTrace();
		 				}
					}
					
					
				}
				
				return ret;
			 
			}
		
		//삭제
		public int delete(int stuno) {
			Connection con = null;
			PreparedStatement pstmt = null;
			String query = "delete from STUDENT where stuno = ?";
			int ret = -1;
			try {
				con = ju.getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, stuno);				
				ret = pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				if (con != null) {
					try {
						con.close();
	 				} catch (SQLException e) {
	 					e.printStackTrace();
	 				}
				}
				
			}
			return ret;
		}
	
		
}
