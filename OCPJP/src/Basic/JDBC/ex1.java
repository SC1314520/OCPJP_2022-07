package Basic.JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.Statement;

public class ex1 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/company";
		String user="root";
		String password="12345678";
		
		String SQL =" insert into member(name,password,address,phone) values('sclemon','1314520','taipei','0000-1234')";
		try {
			
		  Class.forName("com.mysql.jdbc.Driver");
		  Connection conn=DriverManager.getConnection(url,user,password);
		  Statement stat=conn.createStatement();
		  stat.executeUpdate(SQL);
		  
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
			
		} catch (SQLException e) {
			System.out.println("sql error");
			
		}
	}
	
}
