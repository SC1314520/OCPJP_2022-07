package Basic.lambda_2.predicate;

import java.util.function.Predicate;


public class ex {
	public static void main(String[] args) {
		Predicate<Integer> p=new Predicate<Integer>() {
			@Override
			public boolean test(Integer t) {
				if(t>=0)
					return true;
				else
					return false;
			}
		
		};
		
		System.out.println(p.test(10)); // true
		System.out.println(p.test(-10)); // false
		
		
		
		Predicate<Integer> p2=t->t>=100;
		System.out.println(p2.test(20)); // false
		
	}
	
	
}
