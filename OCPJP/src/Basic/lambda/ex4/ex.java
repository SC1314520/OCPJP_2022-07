package Basic.lambda.ex4;

import java.util.Arrays;
import java.util.Comparator;

public class ex {
	public static Comparator<String> getComparator(){
		// 匿名寫法
		/*
		return new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.length()-o1.length(); // 降序
			}
			
		};
		*/
		
		// 第一種寫法
		//return (String o1, String o2)->{ return o2.length()-o1.length();};
	
		//優化寫法
		return (o1,o2)->o2.length()-o1.length();
	}
	public static void main(String[] args) {
		String[] s = {"aaa","bb","cccc","ddddddddd"};
		System.out.println(Arrays.toString(s)); // [aaa, bb, cccc, ddddddddd]
		
		Arrays.sort(s,getComparator());
		System.out.println(Arrays.toString(s)); // [ddddddddd, cccc, aaa, bb]
	}
}
