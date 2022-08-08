package Basic.inherit.demo_4_polymorphism;

 
/*
 *  two benefits of polymorphism:
 *  1. more dynamic code at runtime. 在執行時提供更多動態代碼。
 *  2. more flexible and reusable code 更靈活和可重複使用的代碼。
 */
public class test { // 異質宣告
	public static void main(String[] args) {
		A a =new A("John",70);
		/*
		 *  is-a school --> has-a show()
		 *  is-a A --> has-a show() ,has-a skillA()
		 */
		System.out.println(a.show()); //name: John chi: 70
		a.skillA(); // I AM skillA!
		
		
		school s1 =new A("Mary",80); // 異質宣告  superClass name =new subClass();
		/*
		 *  is-a school --> has-a show()
		 */
		System.out.println(s1); //Basic.inherit.demo_4_polymorphism.A@73a28541  -->屬於 A !!!
		System.out.println(s1.show()); // name: Mary chi: 80 --> 同樣執行 A 的 show()
		//s1.skillA() 不可以這樣寫!! 因為是宣告 school --> is-a school 
		
		/*
		   異質宣告:會限制使用的方法數量
		   說明:
		   編譯時 以物件的宣告類別查詢 是否有此方法名稱   --> 使用的方法名稱在 school 裡存在編譯才會過
 		   執行時 則以真實記憶體的位址找起 new 的子類別開始找  --> 執行時，則是從 A 開始向上找。 
		 */
	}
}
