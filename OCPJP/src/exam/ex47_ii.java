package exam;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex47_ii {
	public static void main(String[] args) {
		Stream.of("one","two","three","four").peek(e->System.out.println(e)).collect(Collectors.toList());
	}
}
/*
Why would choose to use a peek operation instead of a forEach operation on a Stream?

A) to process the current item and return a stream

B) to process the current item and return void

C) to remove an item from the beginning of the stream

D) to remove an item from the end of the stream




ans:A




*/