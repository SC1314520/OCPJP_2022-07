package Basic.JDBC_2.util;


import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class JDBCUtils {
	private static String url; 
	private static String user; 
	private static String password;
	private static String driver;
	static { // 只須讀取一次文件
		// 讀取資源文件
		try {
			Properties pro =new Properties();
			
			ClassLoader classLoader =JDBCUtils.class.getClassLoader();
			URL res= classLoader.getResource("jdbc.properties");
			String path =res.getPath();
			
			pro.load(new FileReader(path));
			url=pro.getProperty("url");
			user=pro.getProperty("user");
			password=pro.getProperty("password");
			driver=pro.getProperty("driver");
			Class.forName(driver);
		} catch (IOException e) {
	
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
	}
	
	// 獲取連接 --> 配置文件 jdbc.properties
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,user,password);
	}
	
	// 釋放資源
	public static void close(Statement stmt,Connection conn) {
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs,Statement stmt,Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(stmt!=null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
