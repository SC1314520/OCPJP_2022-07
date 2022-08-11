package Basic.Collections.Set.HashSet.demo3;

import java.util.HashSet;

/*
 *  HashSet 存儲自定義類型元素
 *  
 * 	必須覆寫 hashCode,equals方法。
 * 
 */
public class ex {
	public static void main(String[] args) {
		HashSet<Person> set =new HashSet<>();
		Person p1 =new Person("aaa",18);
		Person p2 =new Person("aaa",18);
		Person p3 =new Person("aaa",19);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		System.out.println(p1.hashCode()); // 2060468723   //覆寫後：97840
		System.out.println(p2.hashCode()); // 622488023     //覆寫後：97840
		System.out.println(p3.hashCode()); // 1933863327     //覆寫後：97871
		
		System.out.println(p1==p2); //覆寫後： false   //覆寫前：false   -->判定 hashCode 地址 
		System.out.println(p1.equals(p2)); //覆寫後： true   //覆寫前 false  -->判定 hashCode 值
		System.out.println(p1.toString().equals(p2.toString())); // true
		
		
		System.out.println(set); 
		//覆寫前 [Person [name=aaa, age=18], Person [name=aaa, age=19], Person [name=aaa, age=18]]
		//覆寫後 [Person [name=aaa, age=18], Person [name=aaa, age=19]]
	}
}
