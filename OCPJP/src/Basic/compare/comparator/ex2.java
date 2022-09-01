package Basic.compare.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ex2 {
	public static void main(String[] args) {
		Comparator<String> c = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			// String API:
			// int	compareTo​(String anotherString)	Compares two strings lexicographically. // 按字典順序
		
		};
		
		String s1= "wonderful day";
		String s2="beautiful flower";
		
		List<String> str =new ArrayList<>();
		str.add(s1);
		str.add(s2);
		
		str.stream().sorted(c).forEach(s->System.out.println(s));
		
	}
}
