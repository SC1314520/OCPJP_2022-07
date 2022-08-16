package exam;

public class ex18 {

}
/*
Given:
public interface Builder{
	public A build(String str);
}

and

public class BuilderImpl implements Builder{
	@Override
	public B build(String str){
		return new B(str);
	}
}

Assuming that this code compiles correctly,which three statements are true?

A) A cannot be abstract.
B) A is a subtype of B.     // A is a supertype of B
C) B cannot be final.
D) B is a subtype of A. 
E) B cannot be abstract.
F) A cannot be final.  // 因為 final 不可覆寫。





ans:DEF




*/