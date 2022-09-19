package gesipan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class gesipanDao {
	private jdbcUtil ju;

	public gesipanDao() {
		ju = jdbcUtil.getInstance();
	}

	// #삽입 (C-create)
	public int insert(gesipanVo gvo) {
		Connection con = null;
		PreparedStatement pstmt = null;

		String query = "INSERT INTO gesipan VALUES (GESIPAN_SEQ.nextval,?,?,?,sysdate,0)";

		int ret = -1;
		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, gvo.getTitle());
			pstmt.setString(2, gvo.getWriter());
			pstmt.setString(3, gvo.getContent());
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

	// #조회 (R) 전체 조회

	public List<gesipanVo> selectAll() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		String query = "select * from gesipan";
		ArrayList<gesipanVo> ls = new ArrayList<gesipanVo>();

		try {
			con = ju.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				gesipanVo gvo = new gesipanVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						new Date(rs.getDate(5).getTime()), rs.getInt(6));
				ls.add(gvo);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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

	// #조회(R) 하나만 조회
	public gesipanVo selectOne(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String query = "select * from gesipan where num = ?";
		gesipanVo gvo = null;

		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, num);
			updateCnt(num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				gvo = new gesipanVo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						new Date(rs.getDate(5).getTime()), rs.getInt(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
		return gvo;
	}
	// #조회(R) 조회수 증가
		public int updateCnt(int num) {
			Connection con = null;
			PreparedStatement pstmt = null;			
			String query = "update gesipan set cnt = cnt + 1 where num = ?";
			int ret = -1;

			try {
				con = ju.getConnection();
				pstmt = con.prepareStatement(query);
				pstmt.setInt(1, num);
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
	
	//수정
	public int update(gesipanVo gvo) {
		Connection con = null;
		PreparedStatement pstmt = null;

		String query = "update gesipan set title=?, content=?, where num =?";

		int ret = -1;
		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, gvo.getTitle());
			pstmt.setString(2, gvo.getWriter());
			pstmt.setInt(3, gvo.getNum());
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
	//#삭제
	public int delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;

		String query = "delete from gesipan where num =?";
		
		int ret = -1;
		
		try {
			con = ju.getConnection();
			pstmt = con.prepareStatement(query);			
			pstmt.setInt(1, num);
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