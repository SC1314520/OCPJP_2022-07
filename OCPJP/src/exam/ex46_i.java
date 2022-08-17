package exam;

import java.util.function.BiPredicate;

public class ex46_i {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> test=(Integer x,Integer y)->(x.equals(y));
		BiPredicate<Integer,Integer> test2=(Integer x,final Integer y)->(x.equals(y));
		BiPredicate<Integer,Integer> test3=(x,y)->(x.equals(y));
		BiPredicate<Integer,Integer> test4=(final var x, var y)->(x.equals(y));
		//BiPredicate<Integer,Integer> test5=(final  var x, y)->(x.equals(y));
		//BiPredicate<Integer,Integer> test6=(final  x, y)->(x.equals(y));
		//BiPredicate<Integer,Integer> test7=(var  x, Integer y)->(x.equals(y));
		//BiPredicate<Integer,Integer> test8=(  x, var y)->(x.equals(y));
	}
}
/*
Which two are valid statements?

A) BiPredicate<Integer,Integer> test=(final var x,y)->(x.equals(y));

B) BiPredicate<Integer,Integer> test=(Integer  x,final Integer y)->(x.equals(y));

C) BiPredicate<Integer,Integer> test=(final Integer var x,var y)->(x.equals(y));

D) BiPredicate<Integer,Integer> test=(var x,final var y)->(x.equals(y));

E) BiPredicate<Integer,Integer> test=(Integer var x,final var y)->(x.equals(y));



ans:BD

*/