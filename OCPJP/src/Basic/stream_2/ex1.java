package Basic.stream_2;

import java.util.ArrayList;
import java.util.List;
// 傳統寫法
public class ex1 {
	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		list.add("張曉頻");
		list.add("周芷頻");
		list.add("張三豐");
		list.add("張強");
		list.add("貂蟬");
		List<String> list2 =new ArrayList<>();
		for(String s:list) {
			if(s.startsWith("張")) {
				list2.add(s);
			}
		}
		
		List<String> list3 =new ArrayList<>();
		for(String s:list2) {
			if(s.length()==3) {
				list3.add(s);
			}
		}
		System.out.println(list3);
	}
}
