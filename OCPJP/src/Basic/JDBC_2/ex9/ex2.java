package Basic.JDBC_2.ex9;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Basic.JDBC_2.util.JDBCUtils;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("請輸入用戶名：");
		String username=sc.next();
		System.out.print("請輸入密碼：");
		String password=sc.next();
		
		boolean flag= new ex2().login2(username, password);
		if(flag) {
			System.out.println("登入成功");
		}else {
			System.out.println("用戶名或密碼錯誤");
		}
		
	}
	public boolean login2(String username,String password) {
		if(username==null || password==null) {
			return false;
		}
		Connection conn=null;
		PreparedStatement pstmt=null ;
		ResultSet rs=null;
		try {
		    conn=JDBCUtils.getConnection();
			String sql="select * from user where username=? and password=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			rs =pstmt.executeQuery();
			
			return rs.next();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			JDBCUtils.close(rs, pstmt, conn);
		}
		
		
		return false;
	}
}
