package Basic.stream.sorted;


import java.util.stream.Stream;

public class ex1 {
	public static void main(String[] args) {
		// 數字排序
		Stream.of(2,4,5,8,2).sorted().forEach(System.out::print);
		System.out.println();
		
		// 字串排序
		Stream.of("aaa","hhh","bbb").sorted().forEach(e->System.out.print(e));
		System.out.println();
		
		// 物件排序
		Stream.of(new Order("a", 90),new Order("h", 80),new Order("c", 50),new Order("d", 70)).sorted().forEach(Order::show);
	
	
	
	}
}

