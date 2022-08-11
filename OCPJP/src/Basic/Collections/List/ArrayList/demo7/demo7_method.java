package Basic.Collections.List.ArrayList.demo7;

import java.util.ArrayList;



public class demo7_method {
	public static void printArrayList(ArrayList<String> list) {
		System.out.print("{");
		for(int i=0; i<list.size();i++) {
			String name=list.get(i);
			if(i== list.size()-1) {
				System.out.print(name+"}");
			}else {
				System.out.print(name+" @ ");
			}
			
		}
	}
}
