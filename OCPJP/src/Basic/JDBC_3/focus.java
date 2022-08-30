package Basic.JDBC_3;

public class focus {

}
/*
Interface Connection api:
		prepareStatement(String sql)
		commit()
		rollback()
		close()


Interface Statement api:
	close()
	execute(String sql)
	executeUpdate(String sql)

PreparedStatement api:
	execute()
	executeQuery()
	executeUpdate()
	setDate(int parameterIndex, Date x)
	setDate(int parameterIndex, Date x, Calendar cal)
	setDouble(int parameterIndex, double x)
	setFloat(int parameterIndex, float x)
	setInt(int parameterIndex, int x)
	setLong(int parameterIndex, long x)
	setRowId(int parameterIndex, RowId x)
	setRowId(int parameterIndex, RowId x)
	setTime(int parameterIndex, Time x)
	setTime(int parameterIndex, Time x, Calendar cal)
	setTimestamp(int parameterIndex, Timestamp x)
	setTimestamp(int parameterIndex, Timestamp x, Calendar cal)
	setString(int parameterIndex, String x)
	
	// 範例
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
	 

Interface ResultSet api:
	getByte(int columnIndex)
	getDate(int columnIndex)
	getDate(int columnIndex, Calendar cal)
	getDouble(int columnIndex)
	getFloat(int columnIndex)
	getInt(int columnIndex)
	getLong(int columnIndex)
	getString(int columnIndex)
	getTime(String columnLabel)
	
	insertRow()
	isAfterLast()   Retrieves whether the cursor is after the last row in this ResultSet object.
	isBeforeFirst()  Retrieves whether the cursor is before the first row in this ResultSet object.
	next()  Moves the cursor froward one row from its current position.
	previous() Moves the cursor to the previous row in this ResultSet object.
	update.......
*/