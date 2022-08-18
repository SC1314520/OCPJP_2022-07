package Basic.JDBC_2.ex10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Basic.JDBC_2.util.JDBCUtils;

public class ex {
	
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		PreparedStatement pstmt2=null;
		try {
			conn =JDBCUtils.getConnection();
			
			conn.setAutoCommit(false); // 開啟事務
			
			String sql="update company.acc set money= money-? where id=?";
			String sql2="update company.acc set money= money+? where id=?";
			
			pstmt =conn.prepareStatement(sql);
			pstmt2=conn.prepareStatement(sql2);
			
			pstmt.setDouble(1, 500);
			pstmt.setInt(2, 14);
			
			pstmt2.setDouble(1, 500);
			pstmt2.setInt(2, 13);
			
			pstmt.executeUpdate();
			pstmt2.executeUpdate();
			
			conn.commit();// 提交事務
		} catch (Exception e) {
			try {
				if(conn!=null)
				conn.rollback(); // 回滾事務
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}//
			e.printStackTrace();
		} finally {
			JDBCUtils.close(pstmt, conn);
			JDBCUtils.close(pstmt2, null);
		}
	}
}
