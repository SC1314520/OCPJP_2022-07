package Basic.Collections.api.demo3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 
 * Comparable:
 * 		自己（this)和別人（參數）比較，自己需要實現Comparable，覆寫compareTo定義排序方法。
 * Comparator:
 * 		相當於找一個第三方的裁判，比較兩個。
 * 
 * 
 */
public class ex {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(9);
		list.add(5);
		
		Collections.sort(list,new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2; // 前-後 (升）
				// return o2-o1 (降）
			}
		});
		System.out.println(list); // 1, 3, 5, 7, 9]
		
		ArrayList<Student> list2 =new ArrayList<>();
		list2.add(new Student("aaa",15));
		list2.add(new Student("bbb",13));
		list2.add(new Student("ccc",19));
		list2.add(new Student("ddd",13));
		
		Collections.sort(list2,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				
				//return o1.getAge()-o2.getAge(); 升
				// return o2.getAge()-o1.getAge(); 降
				
				int result = o1.getAge()-o2.getAge();
				if(result==0) { // 若年齡相同，則取姓名第一字比較。
					result=o1.getName().charAt(0)-o2.getName().charAt(0);
				}
				return result;
				
			}
		
		});
		System.out.println(list2); // Student [name=bbb, age=13], Student [name=ddd, age=13], Student [name=aaa, age=15], Student [name=ccc, age=19]]
	}
}
