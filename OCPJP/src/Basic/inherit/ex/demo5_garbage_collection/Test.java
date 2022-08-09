package Basic.inherit.ex.demo5_garbage_collection;

public class Test {
	public static void main(String[] args) {
		Student s1 =new Student();
		Student s2 =new Student();
		Student s3 =new Student();
		
		System.out.println(s1); // Basic.inherit.ex.demo5_garbage_collection.Student@5aaa6d82 (1)
		System.out.println(s2); // Basic.inherit.ex.demo5_garbage_collection.Student@73a28541 (2)
		System.out.println(s3); // Basic.inherit.ex.demo5_garbage_collection.Student@6f75e721 (3)
		
		s1=s3; // s1 指向 s3 --> s1 被回收
		s3=s2; // s3 指向 s2 --> s3 原物件依舊被 s1 所指向，故無被回收。
		s2=null; // s2 指向空值 --> s2 原物件依舊被 s3 所指向，故無被回收。
		
		System.out.println(s1); // Basic.inherit.ex.demo5_garbage_collection.Student@6f75e721 (3)
		System.out.println(s2); // null
		System.out.println(s3); // Basic.inherit.ex.demo5_garbage_collection.Student@73a28541 (2)
	}
}
