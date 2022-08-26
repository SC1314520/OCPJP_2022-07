package Basic.compare.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ex {
	public static void main(String[] args) {
		List<employee> emp =new ArrayList<>();
		emp.add(new employee("A",12000));
		emp.add(new employee("B",10000));
		emp.add(new employee("C",8000));
		emp.add(new employee("D",6000));
		emp.add(new employee("E",4000));
		
		Comparator<employee> c =new Comparator<employee>() {

			@Override
			public int compare(employee o1, employee o2) {
				// TODO Auto-generated method stub
				return o1.getSalary()-o2.getSalary();
			}
		};
		emp.stream().sorted(c).forEach(System.out::println);
		
		
		// lambda
		emp.stream().sorted((i,j)->i.getSalary()-j.getSalary()).forEach(System.out::println);
		
	}
}
