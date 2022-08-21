package solve;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;



// ch6 ex5
public class stream_with_lambda {

	public static void main(String[] args) {
		UnaryOperator<Integer> u =i->i*2;
		UnaryOperator<Integer> u2 =(var i)->i*2; // 宣告要()
		UnaryOperator<Integer> u3 =(Integer i)->i*2; // 須用包覆類別宣告。
		UnaryOperator<Integer> u4 =i->(i*2);
		UnaryOperator<Integer> u5 =(i)->i*2;
		UnaryOperator<Integer> u6 =(i)->(i*2);
		UnaryOperator<Integer> u7 =(i)->{return i*2;};
		
		
		List<Integer> list =List.of(1,2,3,4,5);
		
		// 這會一條一條做。
		list.stream().peek(i->System.out.println(i)).peek(i->System.out.println(" "+i*2)).collect(Collectors.toList());
		
		// 這會前面的 peek()做完，才做後面的 peek()。
		list.stream().peek(i->System.out.println(i)).sorted().peek(i->System.out.println(" "+i*2)).collect(Collectors.toList());
		
		
		List<String> fruits=List.of("banana","orange","apple","lemon");
		Stream<String> s1=fruits.stream();
		System.out.println("-------------");
		Stream<String> s2=s1.peek(i->System.out.print(i+" "));				
		Stream<String> s3=s2.sorted();
		System.out.println("-------------");
	    Stream<String> s4=s3.peek(i->System.out.print(i+" "));		
		String strFruits=s4.collect(Collectors.joining(","));
		System.out.println();
		
		fruits.stream().peek(i->System.out.print(i+" ")).sorted().peek(i->System.out.print(i+" ")).collect(Collectors.joining(","));
		/*
			-------------
			-------------
			banana orange apple lemon apple banana lemon orange  
		 */
	}
	
	
}
