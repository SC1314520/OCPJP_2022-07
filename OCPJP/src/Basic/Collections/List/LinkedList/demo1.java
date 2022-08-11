package Basic.Collections.List.LinkedList;

import java.util.LinkedList;

/*
 * 1. 鏈表結構：查詢慢，增刪快。
 * 2. 包含大量操作元素
 * 3. 不可使用多型
 */
public class demo1 {
	public static void main(String[] args) {
		show1();
		show2();
		show3();
	}
	
	private static void show1(){
		LinkedList<String> linked =new LinkedList<>();
		linked.add("a");
		linked.add("b");
		linked.add("c");
		System.out.println(linked); //[a, b, c]
		
		
		//新增在首-1
		linked.addFirst("www");
		System.out.println(linked); //[www, a, b, c]
		
		//新增在首-2
		linked.push("w2");
		System.out.println(linked); // [w2, www, a, b, c]
		
		//新增在尾
		linked.addLast("end");
		System.out.println(linked);// [w2, www, a, b, c, end]

		
	}
	
	private static void show2(){
		LinkedList<String> linked =new LinkedList<>();
		linked.add("a");
		linked.add("b");
		linked.add("c");
		
		//清空元素 --> 會拋出 NoSuchElementException
		linked.clear();
		
		if(!linked.isEmpty()) {
			String first =linked.getFirst();
			System.out.println(first); 
			String last =linked.getLast();
			System.out.println(last); 
		}
	}
	private static void show3(){
		LinkedList<String> linked =new LinkedList<>();
		linked.add("a");
		linked.add("b");
		linked.add("c");
		
		System.out.println(linked);// [a, b, c]
		
		//移除第一個元素
		//linked.pop();  <-- 可以這樣寫。
		String first =linked.removeFirst();
		System.out.println(first); // 被移除的元素 a
		
		//移除最後一個元素
		String last =linked.removeLast();
		System.out.println(last); // 被移除的元素 c
		
		System.out.println(linked); // [b]
		
	}
}
