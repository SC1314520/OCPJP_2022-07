package Basic.annotation.SuppressWarnings;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("all") // 消除編譯器不當警告信息
public class ex {
	public static void main(String[] args) {
		
		List<Object> list =new ArrayList<>();
		list.add("John");
		list.add(10);
		list.add(10.1f);
		
		System.out.println(list);
	}
}
