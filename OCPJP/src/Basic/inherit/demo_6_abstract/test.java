package Basic.inherit.demo_6_abstract;

public class test {
	public static void main(String[] args) {
		Company[] c =new Company[] 
		{
			new CA("John", 10),
			new CB("Mary", 15)
		};
		System.out.println(c[0].show()); // name: John Lcd: 10
		System.out.println(c[1].show()); // name: Mary RAM: 15
	}
}
