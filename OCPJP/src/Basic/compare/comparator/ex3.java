package Basic.compare.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ex3 implements Comparator<String>{
	public static void main(String[] args) {
		List<String> s =new ArrayList<>();
		s.add("wonderful");
		s.add("beautifully");
		
		if(new ex3().compare(s.get(0), s.get(1))<0) {
			System.out.println("升序");
		}
		else {
			System.out.println("降序");
		}
		
	}

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.length()-o2.length();
	}

	
}
