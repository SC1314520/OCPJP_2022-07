package Basic.annotation.SuppressWarnings;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all") // 消除編譯器不當警告信息
public class ex {
	public static void main(String[] args) {
		
		List list =new ArrayList(); // unchecked --> 不檢查泛型
		list.add("John");
		list.add(10);
		list.add(10.1f);
		
		System.out.println(list);
	}
}
