package Basic.JDBC_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex4 { // delete
	public static void main(String[] args) {
		Statement stmt=null;
		Connection conn=null;
		try {
			//註冊驅動
			Class.forName("com.mysql.jdbc.Driver");
			//獲取數據庫連接對象 Connection
			String url="jdbc:mysql://localhost:3306/company";
			String user="root";
			String password="12345678";
			conn=DriverManager.getConnection(url,user,password);
			String sql =" delete from account where id=1 ";
			
			stmt =conn.createStatement();
			int count = stmt.executeUpdate(sql);
			System.out.println(count);
			if(count>0) {
				System.out.println("執行成功");
			}else {
				System.out.println("執行失敗");
			}
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
		}
	}
}
