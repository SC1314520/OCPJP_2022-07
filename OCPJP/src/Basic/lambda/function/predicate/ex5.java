package Basic.lambda.function.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ex5 {
	public static ArrayList<String> filter(String[] arr,Predicate<String> pre1,Predicate<String> pre2){
		ArrayList<String> list =new ArrayList<>();
		for(String s:arr) {
			if(pre1.and(pre2).test(s)) {
				list.add(s);
			}
		}
		return list;
	}
	public static void main(String[] args) {
		String[] array= {"aaaa,女","bbbb,女","cccc,男","ddd,女"};
		ArrayList<String> list= filter(array, (str)->{
			return str.split(",")[0].length()==4;
		}, (str)->{
			return str.contains("女");
		});
		
		System.out.println(list);
	}
	
}
