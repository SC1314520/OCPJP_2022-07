package exam;

import java.util.Comparator;

public class ex43_i {
	public static void main(String[] args) {
	
		// 放在主方法
	new Comparator<String>() {

		@Override
		public int compare(String o1, String o2) {  // 回傳為 int !!
			// TODO Auto-generated method stub
			return 0;
		}
		
	};	
	
	
	// 放在物件裡面
	new Comparable<String>() {

		@Override
		public int compareTo(String o) { // 回傳為 int
			// TODO Auto-generated method stub
			return 0;
		}
	};
	
	}
}
/*
Which code fragment represents a valid Comparator implementation?

A) new Comparator<String>() {
		public int compareTo(String str1,String str2) {
			return str1.compareTo(str2);
		}
   };

B) public class Comps implements Comparator {
		public boolean compare(Object obj1,Object obj2) {
			return obj1.equals(obj2);		
		}

   }

C) public class Comps implements Comparator {
		public int compare(String str1,String str2) {
			return str1.length()-str2.length();
		}
   }

D) new Comparator<String>() {
		public int compare(String str1,String str2) { 
			return str1.compareTo(str2);		
		}
   };
   
   
   
   
   
ans:D
*/