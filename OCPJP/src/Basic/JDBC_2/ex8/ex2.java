package Basic.JDBC_2.ex8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Basic.JDBC_2.util.JDBCUtils;

public class ex2 { // ResultSet
	public static void main(String[] args) {
		System.out.println(findAll2());
		System.out.println(findAll2().size());
	}
	
	public static List<User> findAll2(){
		List<User> list =new ArrayList<>();
		Statement stmt=null;
		Connection conn=null;
		ResultSet rs=null;
		try {
			conn=JDBCUtils.getConnection();
			
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
			JDBCUtils.close(rs,stmt, conn);
		}
		return list;
	}
}
