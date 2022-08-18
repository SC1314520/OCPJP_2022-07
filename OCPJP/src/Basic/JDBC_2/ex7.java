package Basic.JDBC_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex7 { // ResultSet
	public static void main(String[] args) {
		Statement stmt=null;
		Connection conn=null;
		ResultSet rs=null;
		try {
			//註冊驅動
			Class.forName("com.mysql.jdbc.Driver");
			//獲取數據庫連接對象 Connection
			String url="jdbc:mysql://localhost:3306/company";
			String user="root";
			String password="12345678";
			conn=DriverManager.getConnection(url,user,password);
			String sql =" select * from account";
			
			stmt =conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			// 獲取數據 //先向下一行。  -->取得全部數據。
			while(rs.next()) {
				int id =rs.getInt(1);
				String account =rs.getString("account");
				String pd=rs.getString(3);
				
				System.out.println(id+" "+account+" "+pd); // 2 NightCat 1314520   <-- 資料庫第一行。
				
			}; 
			
		} catch (Exception e) {
			
		} finally { // 釋放資源
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
			
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
		}
	}
}
