package Basic;

import java.nio.file.Path;
import java.util.Collection;

public class multi_interface_inherit {
	public static void main(String[] args) {
		
	}
}
interface A{
	public Iterable a();
}

interface B extends A{
	public Collection a();
}

interface C extends A{
	public Path a();
}
//interface D extends B,C{}
interface D extends A{}
interface D2 extends B{}
interface D3 extends C{}