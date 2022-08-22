package Basic.lambda_2.ex1;


@FunctionalInterface
interface book3{
	public abstract void show1();
}


public class ex3 {
	public static void main(String[] args) {
		book3 b=()->System.out.println("hello");
		var x = "world"; // var 只能在 main 中使用。
	}
}
