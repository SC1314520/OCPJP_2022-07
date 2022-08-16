package exam;

public class ex19 {

}
/*
Given:

public class Foo{
	public void foo(Collection arg){
		System.out.println("Bonjour le monde");	
	}
	
}

and
public class Bar extends Foo{
	public void foo(Collection arg){
		System.out.println("Hello world");	
	}
	public void foo(List arg){
		System.out.println("Hello Mundol!");	
	}


}

and

Foo f1=new Foo();   
Foo f2=new Bar();
Bar b1=new Bar();
List<String> li=new ArrayList<>();

Which three are correct?

A) f2.foo(li) prints Bonjour le monde    // 本體是 Bar 且只能用 Collection
B) f1.foo(li) prints Hola Mundo! // 本體是 Foo
C) f2.foo(li) prints Hola Mundo! // 本體是 Bar 且只能用 Collection
D) b1.foo(li) prints Hola Mundo! // 本體是 Bar   <-- 會以宣告的物件（List)型態來執行。
E) f2.foo(li) prints Hello world! // 本體是 Bar  且只能用 Collection
F) b1.foo(li) prints Hello world! // 本體是 Bar
G) f1.foo(li) prints Bonjour le monde! // 本體是 Foo
H) f1.foo(li) prints Hello world! // 本體是 Foo
I) b1.foo(li) prints Bonjour le monde! // 本體是 Bar


ans:DEG
*/