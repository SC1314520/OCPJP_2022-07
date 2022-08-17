package exam;

import java.util.List;
import java.util.Optional;

public class ex44 {
	public static void main(String[] args) {
		var fruits=List.of("apple","orange","banana","lemon");
		Optional<String> result=fruits.stream().filter(f->f.contains("n")).findAny(); // findAny() 會找符合條件的第一個 orange
		System.out.println(result.get());
	}
	// parallelStream() 會同步執行，所以答案會不同。--> banana
}
/*
Given:

var fruits=List.of("apple","orange","banana","lemon");
Optional<String> result=fruits.stream().filter(f->f.contains("n")).findAny();// line 1

System.out.println(result.get());

You replace the code on line 1 to use parallelStream.

Which one is correct?

A) The compilation fails.
B) The code will produce the same result
C) A NoSuchElementException is thrown at run time
D) The code may produce a different result



ans:D




*/