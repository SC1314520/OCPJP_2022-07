package exam;

import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex50_i {
	public static void main(String[] args)
	{
		List<String> fruits=List.of("banana","orange","apple","lemon");
		Stream<String> s1=fruits.stream();
		Stream<String> s2=s1.peek(i->System.out.print(i+" ")); // 先做
		System.out.println("--------");
		Stream<String> s3=s2.sorted();
		Stream<String> s4=s3.peek(i->System.out.print(i+" "));// sorted 後執行。
		System.out.println("--------");
		String strFruits=s4.collect(Collectors.joining(","));	
		System.out.println();
		System.out.println("=========================");
		List.of("banana","orange","apple","lemon")
			.stream()
			.peek(i->System.out.print(i+" "))
			.sorted()
			.peek(i->System.out.print(i+" "))
			.collect(Collectors.joining(","));
		
	}
}
/*
Given the code fragment:

public class Main {
	public static void main(String[] args)
	{
		List<String> fruits=List.of("banana","orange","apple","lemon");
		Stream<String> s1=fruits.stream();
		Stream<String> s2=s1.peek(i->System.out.print(i+" "));
		System.out.println("--------");
		Stream<String> s3=s2.sorted();
		Stream<String> s4=s3.peek(i->System.out.print(i+" "));
		System.out.println("--------");
		String strFruits=s4.collect(Collectors.joining(","));	
	}
}

What is the output?

A) --------
   --------
   banana orange apple lemon apple banana lemon orange

B) banana orange apple lemon
   ------
   apple banana lemon orange
   ------
   
C) -----
   banana orange apple lemon
   -----
   apple banana lemon orange
   
 D) -----
    -----
    
 E) banana orange apple lemon apple banana lemon orange
    ------
    ------
    
    
    
    
 ans:A



*/
