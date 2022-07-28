package Basic.array.method;

import java.util.Arrays;

public class model_4_method {
	public int[] num;
	
	public model_4_method() {
		
	}
	public model_4_method(int[] num) {
		super();
		this.num = num;
	}
	public void length() {
		System.out.println(num.length);
	}
	@Override
	public String toString() {
		return "model_4_method [num=" + Arrays.toString(num) + "]";
	}
	
}
