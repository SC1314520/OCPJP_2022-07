package exam;

public class ex48 {

}
/*
Given the content from lines.txt

C
C++
Java
Go
Kotlin


and

String fileName="lines.txt";
List<String> list=new ArrayList<>();
try(Stream<String> stream=Files.lines(Paths.get(fileName))) {
		list=stream
		           .filter(line->!line.equalsIgnoreCase("JAVA"))
		           .map(String::toUpperCase)
		           .collect(Collectors.toList());
	} catch(IOException e) {

	}
list.forEach(System.out::println);


What is the Result?

A) C
   C++
   Go
   Kotlin
   
B) JAVA

C) C
   C++
   GO
   KOTLIN
   
D) C
   C++
   JAVA
   GO
   KOTLIN
   
   
ans:C






*/
