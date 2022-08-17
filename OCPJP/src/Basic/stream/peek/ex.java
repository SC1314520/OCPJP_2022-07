package Basic.stream.peek;

import java.util.stream.Stream;

import java.util.stream.Collectors;
public class ex {
	public static void main(String[] args) {
		Stream.of("aaa","rrrr","yy").filter(e->e.length()>=3).peek(e->System.out.println("e= "+e)).collect(Collectors.toList());
	}
}
