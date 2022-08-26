package Basic.compare.comparable;

import java.util.ArrayList;
import java.util.List;

public class ex {
	public static void main(String[] args) {
		List<employee> emp =new ArrayList<>();
		emp.add(new employee("A",12000));
		emp.add(new employee("B",10000));
		emp.add(new employee("C",8000));
		emp.add(new employee("D",6000));
		emp.add(new employee("E",4000));
		
		emp.stream().sorted().forEach(System.out::println);
		
	}
}
