package Basic.Collections.List.ArrayList.demo8;

import java.util.ArrayList;
import java.util.Random;

public class ex{
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<20;i++) {
			list.add(new Random().nextInt(100));
		}
		System.out.println("list: "+list);
		
		// void 方法
		method mt =new method();
		mt.multi(list);
		
		// return 方法
		System.out.println("list3: "+new method().analyze(list)+" size: "+new method().list3.size()); // size:0
		
		// static 方法
		method.even(list);
	}
}
