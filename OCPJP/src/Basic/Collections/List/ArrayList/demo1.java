package Basic.Collections.List.ArrayList;

import java.util.ArrayList;

public class demo1 {
	public static void main(String[] args) {
		//<> 泛型只能放物件類別，不可以放基本類型。
		//右側的 <> 內部可省略不寫 JDK1.７ 以後可以這樣寫。 
		ArrayList<String> list =new ArrayList<>();
		// 對於 ArrayList 來說，直接印出的不是位址，而是內容。
		System.out.println(list); //[]
		
		// 添加數據 add 方法。--> 只能放入 String 字串。-->因為一開始泛型<String>
		list.add("John");
		list.add("Mary");
		list.add("Kelly");
		
		System.out.println(list); //[John, Mary, Kelly]
		
	}
}
