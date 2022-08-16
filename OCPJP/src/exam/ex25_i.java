package exam;

import java.nio.file.Path;
import java.util.Collection;

interface a1{
	public Iterable a();
}
interface b1 extends a1{
	public Collection a();
}
interface c1 extends a1{
	public Path a();
}
/*
 public interface D extends b1,c1{   //  要繼承兩個介面的話，裡面的方法名稱若相同，則會出錯。除非是 overload 或 型態相同才可以
	如改成：
		interface b1 extends a1{
			public Path a();
		}
  }
 */
public class ex25_i {

}

/*
Given:

public interface A{
	public Iterable a();
}

public interface B extends A{
	public Collection a();
}
public interface C extends A{
	public Path a();
}
public interface D extends B,C{

}

why does D cause a compilation error?

A) D does not define any method.
B) D inherits a() only from c.
C) D inherits a() from B and c but the return types are incompatible.
D) D extends more than one interface


ans:C



*/