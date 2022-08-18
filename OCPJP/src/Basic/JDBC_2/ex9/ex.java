package Basic.JDBC_2.ex9;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Basic.JDBC_2.util.JDBCUtils;

public class ex {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("請輸入用戶名：");
		String username=sc.next();
		System.out.print("請輸入密碼：");
		String password=sc.next();
		
		boolean flag= new ex().login(username, password);
		if(flag) {
			System.out.println("登入成功");
		}else {
			System.out.println("用戶名或密碼錯誤");
		}
		
	}
	public boolean login(String username,String password) {
		if(username==null || password==null) {
			return false;
		}
		Connection conn=null;
		Statement stmt=null ;
		ResultSet rs=null;
		try {
		    conn=JDBCUtils.getConnection();
			String sql="select * from user where username='"+username+"' and password='"+password+"'";
			stmt =conn.createStatement();
			rs =stmt.executeQuery(sql);
			
			return rs.next();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			JDBCUtils.close(rs, stmt, conn);
		}
		
		
		return false;
	}
}
