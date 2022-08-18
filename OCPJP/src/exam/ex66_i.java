package exam;

public class ex66_i {

}
/*
What is the most likely outcome of this code if the bunnies table is empty?

var url="jdbc:derby:bunnies";
var sql="insert into bunny(name,color) values(?,?)";
try(var conn=DriverManager.getConnection(url);
var stmt=conn.createStatement()){
	stmt.setString(1,"Hoppy");   //  stmt 沒有 setString  --> preparedStatement(sql) 才可以。
	stmt.setString(2,"Brown");
	
	stmt.executeUpdate(sql);
}


A. One row is in the table.
B. Two rows are in the table.
C. The code does not compile.
D. The code throws a SQLException





ans:C


*/