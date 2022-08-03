package Basic.inherit.demo_3_FieldandMethod;

public class test {
	public static void main(String[] args) {
		/*
		CA has-a Lcd---> CA is-a CA
		沒封裝
		CA has-a name---> CA is-a Company
		CA has-a address---> CA is-a Company
		CA has-a show()---> CA is-a Company
		CA has-a change(name),change(name,address),change(Lcd)
		有封裝-->private
		*/
		CA a=new CA("John",10);
		System.out.println(a.show()); // name: John address: null
		a=new CA("John","Taipei",10);
		System.out.println(a.show()); // name: John address: Taipei
		
		
		// override
		// new 的 class 方法具有優先權 --> new CA --> 執行 CA 中的 skill()
		CA x =new CA();
		x.skill(100); // n= 100
		x.skill(-100); // n needs to be positive number !
		// new 的 class 方法具有優先權 --> new Company --> 執行 Company 中的 skill()
		Company y =new Company();
		y.skill(-100); // n= -100
	}
}




/*
 程式碼如下，請問最後結果為何?
	01.  class Person{
	02.     String name="anonymity";
	03.     public Person(String n){name=n;}
	04.   }
	05.  class Employee extends Person{
	06.     String empID="E00";
	07.     public Employee(String id){empID=id;}
	08.   }
	09.  class Execute{
	10.     public static void main(String args[]){
	11.       Employee em=new Employee("E01");
	12.       System.out.print(em.empID);
	13.   }
	14. }

	A. E00
	B. E01
	C. anonymity
	D. E00 E01
	E. 編譯失敗
	
	答案為 E -->07. 少了 super(String);
 */