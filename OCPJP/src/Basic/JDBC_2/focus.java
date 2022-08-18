package Basic.JDBC_2;
/*
 * 
 *  DriverManager : 驅動管理對象
 *  	1. 註冊驅動
 *  		 static void registerDriver(Driver driver) : 註冊與給定的驅動程序  DriverManager
 *  			寫代碼： Class.forName("com.mysql.jdbc.Driver");  <-- mysql 5 以後，可以省略不註冊。
 *  	2. 獲取數據庫連接
 *  		 static Connection getConnection(String url, String user, String password)
 *  			url: 指定連接的路徑 
 *  				語法：jdbc:mysql://ip地址（域名）:端口號/數據庫號名
 *  				例如：jdbc:mysql://localhost:3306/company"
 *  				細節：如果是連接本機，且為 mysql 默認端口 3306 ，則可以簡寫為 jdbc:mysql:///數據庫號名
 *  			user: 用戶名
 *  			password: 密碼
 * 	Connection : 數據庫連接對象
 * 		1. 獲取執行 sql 的對象
 * 				Statement createStatement() ,  PreparedStatement prepareStatement(String sql) 
 * 		2. 管理事務
 * 				開啟事務: setAutoCommit(boolean autoCommit):調用該方法設置參數為 false ，即開啟事務。
 * 				提交事務: commit()
 * 				回滾事務: rollback()
 * 	Statement : 執行 sql 的對象
 * 		1. 執行sql
 * 			boolean execute(String sql): 可以執行任務 sql   <-- 不常用
 * 			int executeUpdate(String sql): 執行 DML(insert,update,delete) 語句、DDL語句(create,alter,drop)語句。
 * 				返回值：影響的行數，可以通過影響的行數判斷DML語句是否執行成功，若>0，則執行成功，反之，則失敗。
 * 			ResultSet executeQuery(String sql):執行 DQL(select)語句。
 * 	ResultSet : 結果集對象 --> 封裝查詢結果
 * 		boolean next():游標向下一行。  判斷當前行是否是最後一行末尾（是否有數據)，如果是，則返回false。
 * 		getxxx(參數):獲取數據。
 * 			xxx: 代表數據類型  --> 如 int getInt()  , String getString()
 * 			參數：
 * 				int: 代表列的編號，index 從 1 開始。 如： getString(1) 
 * 				String: 代表列的名稱。 如： getDouble("balance");
 * 		注意：
 * 			使用的步驟：
 * 				1. 游標向下移動一行
 * 				2. 判斷是否有數據
 * 				3. 獲取數據
 *  PreparedStatement : 執行 sql 的對象（更強大）
 *  	1. SQL 注入問題：在拼接 sql 時，有一些 sql 的特殊關鍵字參與字串的拼接，會造成安全性問題。
 *  		輸入用戶名隨意，輸入密碼： a' or 'a'='a
 *  		sql: select * from user where username='asdadad' and password= 'a' or 'a'='a'    <-- 恆等式
 * 		2. 解法sql注入問題：使用 PreparedStatement 對象來解決
 * 		3. 預編譯的 SQL : 參數使用作為占位符。
 * 		4. 步驟：	
 * 			4.定義sql:
 * 					sql的參數使用作為占位符。
 * 						select * from user where username=？ and password=？
 * 			5.獲取sql:
 * 				PreparedStatement = Connection.prepareStatement(String sql);
 * 			6. 給？賦值：
 * 					1. 方法： setxxx(參數1,參數2)
 * 							參數1 :表示？的位置編號
 * 							參數2 :表示？的值
 * 			7.執行sql: 接受返回結果，不需要傳遞 sql 語句。
 * 			8.處理結果
 * 			9.釋放資源
 * 
 */
public class focus {
	public static void main(String[] args) {
		
	}
}
