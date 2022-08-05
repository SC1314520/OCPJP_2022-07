package Basic.inherit.demo_5_final.ex;

public class test {
	public static void main(String[] args) {
		member m1=new member("abc","tt"); // new 物件時，賦予 final 變數數值。
		System.out.println("name: "+m1.name+"\t username: "+m1.username); //name: abc	username: tt
		m1.name="yyyyy";
		// m1.username="oooo"; --> username 屬於 final 變數，不可再更改!!
	}
}
