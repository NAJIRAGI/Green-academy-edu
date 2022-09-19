package gesipan;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class jdbcUtil {
	private static jdbcUtil instance = new jdbcUtil();
	private static DataSource ds;
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			
			InitialContext ctx = new InitialContext();
			ds = (DataSource)ctx.lookup("java:comp/env/jdbc/myOracle");
			System.out.println("Connection Pool 생성");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	private jdbcUtil() {}
	
	public static jdbcUtil getInstance() {
		return instance;
	}
	public Connection getConnection() throws SQLException {
		return ds.getConnection();
	}
	
}
