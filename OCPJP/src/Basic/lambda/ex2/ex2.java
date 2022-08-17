package Basic.lambda.ex2;
/*
 *  使用 lambda 優化日誌案例
 *  	lambda優點： 延遲加載
 *  	lambda使用前提：必須存在函數式接口
 */
public class ex2 {
	public static void showLog(int level,msgbuilder mb) {
		if(level==1) {
			System.out.println(mb.builderMessage());
		}
	
	}
	public static void main(String[] args) {
		String msg1="Hello";
		String msg2=" World";
		String msg3=" Java";
		
		showLog(1, ()->{
			return msg1+msg2+msg3;
		});
		/*
		 *  使用lambda 表達式作為參數傳遞，僅僅是把參數傳遞到 showLog方法中，
		 *  只有滿足條件，日誌等級是1級，才會調用接口 msgbuilder 中的方法 builderMessage 才會進行字串拼接。
		 *  如果不滿足，則也不會執行拼接。 --> 不會存在性能的浪費。
		 */
		showLog(2, ()->{
			System.out.println("不滿足條件不執行。");
			return msg1+msg2+msg3;
		});
	}
}
