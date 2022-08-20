package Basic.annotation.Deprecated;

public class ex {
	
	public static void main(String[] args) {
		cat c =new cat("cc",3);
		System.out.println(c.printInfo());  // 調用一個已過時的方法，但還是能用。
	}
}
