package Basic.lambda.function.supplier;

import java.util.function.Supplier;

public class ex2 {
	public static int getMax(Supplier<Integer> sup) {
		return sup.get();
	}
	public static void main(String[] args) {
		int[] arr= {100,0,-50,88,99,33,-30};
		int maxValue=getMax(()->{
			int max=arr[0];
			for(int i :arr) {
				if(i>max) {
					max=i;
				}
			}
			return max;
		});
		System.out.println("max= "+maxValue);
	}
}
