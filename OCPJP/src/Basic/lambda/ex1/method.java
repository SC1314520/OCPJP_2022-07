package Basic.lambda.ex1;

/*
 *    函數式接口： 只有一個抽象方法的接口。
 * 		當然接口中可以包含其他的方法（默認、靜態、私有）
 */

@FunctionalInterface  // 可以檢測接口是否是一個函數式接口  --> 接口中沒有或多於一個抽象方法。
public interface method {

	public abstract void method();
	
}
