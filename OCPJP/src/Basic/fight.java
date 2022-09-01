package Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class fight {
	public static void main(String[] args) {
		// 陣列替換
		int[] x=new int[10];
		for(int i=0;i<10;i++) {
			x[i]=i;
		}
		for(int j = 0;j<x.length;j++) {
			if(x[j]==2) {
				x[j]=5;
			}
			
		}
		System.out.println(Arrays.toString(x)); // [0, 1, 5, 3, 4, 5, 6, 7, 8, 9]
		
		
		// 一般 for循環
		List<Integer> list =new ArrayList<>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		for(int j=0;j<list.size();j++) {
			if(list.get(j)==2) {
				list.remove(j);
			}
		}
		System.out.println(list); // [0, 1, 3, 4, 5, 6, 7, 8, 9]
		
		List<String> str =new ArrayList<>();
		str.add("hello");
		str.add("my");
		str.add("name");
		str.add("is");
		str.add("Jack");
		for(int j=0;j<str.size();j++) {
			if(str.get(j).equals("name")) {
				str.remove(j);
				System.out.println(str.get(j));
			}
		}
		
		
		
		
		
		
		//for-each --> 執行序衝突
    	List<Integer> list2 =new ArrayList<>();
		for(int i=0;i<10;i++) {
			list2.add(i);
		}
		for(Integer i:list2) { // java.util.ConcurrentModificationException
			if(i==2) {
				//list2.add(i); --> 執行序衝突
				//list2.remove(i); --> 執行序衝突
				// list2.set(5, i); 這個可以
			}
		}
		
		
		}
		
	}
	

