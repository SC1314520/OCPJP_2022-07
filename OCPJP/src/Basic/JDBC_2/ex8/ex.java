package Basic.JDBC_2.ex8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ex { // ResultSet
	public static void main(String[] args) {
		System.out.println(findAll());
		System.out.println(findAll().size());
	}
	
	public static List<User> findAll(){
		List<User> list =new ArrayList<>();
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
				int id =rs.getInt("id");
				String account =rs.getString("account");
				String pd=rs.getString("password");
				
				list.add(new User(id, account, pd));
				
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
		return list;
	}
}
