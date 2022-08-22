package Basic.lambda_2.ex2;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ex {
	public static void main(String[] args) {
		//List<Integer> l =new ArrayList<>();  // 宣告若為 ArrayList 不可以使用 Stream
		List<Integer> l=Arrays.asList(10,20,30);
		// 第一種寫法
		for(Integer i:l) {
			System.out.println(i+" ");
		}
		// 第二種寫法
		l.stream().forEach(System.out::print);
		System.out.println();
		// 第三種寫法
		Consumer<Integer> c=t->System.out.print(t+" ");
		l.stream().forEach(c);
	}

}
/*  關於 :: 的使用方法：

静态方法引用（static method）语法：classname::methodname 例如：Person::getAge
对象的实例方法引用语法：instancename::methodname 例如：System.out::println
对象的超类方法引用语法： super::methodname
类构造器引用语法： classname::new 例如：ArrayList::new
数组构造器引用语法： typename[]::new 例如： String[]::new

*/