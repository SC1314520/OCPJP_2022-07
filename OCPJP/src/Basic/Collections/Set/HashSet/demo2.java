package Basic.Collections.Set.HashSet;

import java.util.HashSet;

public class demo2 {
	public static void main(String[] args) {
		HashSet<String> set =new HashSet<>();
		String s1 =new String("abc");
		String s2 =new String("abc");
		set.add(s1); // hashCode:96354
		set.add(s2); // hashCode:96354
		set.add("重地"); // hashCode:1179395
		set.add("通話"); // hashCode:1179395  --> 調用 equals -->判定為不同元素，故新增成功。
		set.add("abc"); // hashCode:96354
		
		System.out.println(set); // [重地, abc, 通話]
		
		// add 會調用元素的hashCode方法，若哈希值相同時，則調用equals方法與衝突元素比對，判斷元素是否重複。
	}
}
