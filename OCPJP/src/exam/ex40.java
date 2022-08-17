package exam;

import java.util.ArrayList;
import java.util.Arrays;

public class ex40 {
	public static void main(String[] args) {
		
			String[] catNames={"abyssinian","oxicat",
				"korat","laperm","bengal","sphynx"};
			var cats=new ArrayList<>(Arrays.asList(catNames));
			cats.sort((var a,var b)->-a.compareTo(b)); // 逆向： 開頭英文倒敘。
			cats.forEach(System.out::println);
	
	}
}
/*
Given:

import java.util.ArrayList;
import java.util.Arrays;
public class NewMain{
	public static void main(String[] args) {
		String[] catNames={"abyssinian","oxicat",
			"korat","laperm","bengal","sphynx"};
		var cats=new ArrayList<>(Arrays.asList(catNames));
		cats.sort((var a,var b)->-a.compareTo(b));
		cats.forEach(System.out::println);
	}
}


What is the result?

A) nothing

B) sphynx
   oxicat
   laperm
   korat
   bengal
   abyssinian
   
C) abyssinian
   oxicat
   korat
   laperm
   bengal
   sphynx
   
D) abyssinian
   bengal
   korat
   laperm
   oxicat
   sphynx
  
  
  
ans:B


*/