package Basic.JDBC_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



/*
 * 	步驟：
 * 		1. 導入驅動 jar 檔。
 * 		2. 註冊驅動
 * 		3. 獲取數據庫連接對象 Connection
 * 		4. 定義 sql
 * 		5. 獲取執行 sql 語句對象 Statement
 * 		6. 執行 sql ，接受返回結果
 * 		7. 處理結果
 * 		8. 釋放資源
 */
public class ex1 {
	public static void main(String[] args) throws Exception {
		//註冊驅動
		Class.forName("com.mysql.jdbc.Driver");
		//獲取數據庫連接對象 Connection
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="12345678";
		Connection conn=DriverManager.getConnection(url,user,password);
		//定義 sql
		String SQL =" insert into account(account,password) values('sclemon','1314520')";
		
		//獲取執行 sql 語句對象 Statement
		Statement stmt=conn.createStatement();
		
		// 執行 sql ，接受返回結果
		int count= stmt.executeUpdate(SQL);
		
		// 處理結果
		System.out.println(count);
		
		// 釋放資源
		stmt.close();
		conn.close();
		
		
	}
}
