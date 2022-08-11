package Basic.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.Random;

// 生成6個1~33之間的隨機整數，加入到集合中，並且印出。

public class demo5 {
	public static void main(String[] args) {
		ArrayList<Integer> list =new ArrayList<>();
		for(int i=0;i<6;i++) {
			list.add(new Random().nextInt(34)+1);
		}
		System.out.println(list); // [11, 1, 28, 29, 26, 33]
		
		
		//印出
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i)); // 11,1,28,29,26,33
		}
		for(int i:list) {
			System.out.println(i);// 11,1,28,29,26,33
		}
	}
}
