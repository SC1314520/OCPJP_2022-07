package Basic.Object_oriented.practice6_static.main;

import static java.lang.Math.*; //..........(1) --> static method 可以直接 import

public class static_method_import {
	public static void main(String[] args) {
		System.out.println(Math.pow(2,2));
		System.out.println(Math.abs(-100));
		
		//=============== import =================//
		System.out.println(pow(2,2));  
		System.out.println(abs(-100));
	}
}
