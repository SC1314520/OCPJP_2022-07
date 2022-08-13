package Basic.exception.second.ex11;
/*
 * 自定義：
 * 	public class XXXException extends Exception or RuntimeException {
 * 		添加一個空參數方法
 * 		添加一個帶異常信息的構造方法
 * 	}
 */
public class RegisterException extends Exception {
	public RegisterException(){
		
	}
	public RegisterException(String message) {
		super(message); // 使用父類別的方法。
	}
}
