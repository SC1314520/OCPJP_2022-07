package Basic.array.value_address;

public class ex {
	public static void main(String[] args) {
		Student s1 = new Student(); 
		Student s2 = new Student(); 
	 	Student s3 = new Student(); 
	 	System.out.println(s1); // Basic.array.value_address.Student@5aaa6d82
	 	System.out.println(s2); // Basic.array.value_address.Student@73a28541
	 	System.out.println(s3); //Basic.array.value_address.Student@6f75e721
		s1 = s3; // s3 s2 s3  --> 左側被消滅
	 	s3 = s2; // s3 s2 s2  --> 左側被消滅
	 	s1 = s2; // s2 s2 s2  --> 左側被消滅 --> 僅存s2
	 	System.out.println(s1); // Basic.array.value_address.Student@73a28541
	 	System.out.println(s2); // Basic.array.value_address.Student@73a28541
	 	System.out.println(s3); // Basic.array.value_address.Student@73a28541
		}
}
class Student {
	String name;
	int age;
}
/*
 
Which statement is true?  Ans. (C)
(A) After line 11, none of the objects are eligible for garbage collection.
(B) After line 11, three objects are eligible for garbage collection.
(C) After line 11, two objects are eligible for garbage collection.
(D) After line 11, one object is eligible for garbage collection.

 */