package Basic.exception.second;

public class ex10 { // 父子類別異常關係
	
	public void show1() throws NullPointerException,ClassCastException{}
	public void show2() throws IndexOutOfBoundsException{}
	public void show3() throws IndexOutOfBoundsException{}
	public void show4() {}

}

class zi extends ex10{
	// 子類別拋出與父類別相同的異常
	public void show1() throws NullPointerException,ClassCastException{}
	// 子類別拋出父類別的子類異常
	public void show2() throws ArrayIndexOutOfBoundsException{}
	// 子類別不拋出例外
	public void show3() {}
	// 父類別無拋出例外，則子類別不可拋出例外，只可捕獲處理。(只可 try-catch)
	public void show4() {
		//throw new Exception(); -->不可聲明！！ 
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	} 
	
	
	
}
