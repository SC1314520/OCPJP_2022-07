package Basic.inherit.demo_3;

public class test {
	public static void main(String[] args) {
		CA a=new CA("John",10);
		System.out.println(a.show()); // name: John address: null
		a=new CA("John","Taipei",10);
		System.out.println(a.show()); // name: John address: Taipei
	}
}
