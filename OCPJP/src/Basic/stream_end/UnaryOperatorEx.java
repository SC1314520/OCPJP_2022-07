package Basic.stream_end;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {
	public static void main(String[] args) {
		// Function 的子類。--> apply()
		UnaryOperator<Integer> u1 =t->t+10;
		UnaryOperator<Integer> u2=t->t*10;
		int a =u1.andThen(u2).apply(5); // 先執行u1，再執行u2。
		int b =u1.compose(u2).apply(5); // 先執行u2，再執行u1。
		System.out.println(a); // 150
		System.out.println(b); // 60
	}
}
