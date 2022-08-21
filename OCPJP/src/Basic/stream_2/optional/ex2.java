package Basic.stream_2.optional;

import java.util.Optional;

public class ex2 {
	public static void main(String[] args) {
//		String s ="3";
//		Optional<Integer> o =Optional.of(Integer.parseInt(s));
//		System.out.println(o);// Optional[3]
	System.out.println("Ans: "+convert("a").get()); // get() 不可以接收 null -> NoSuchElementException
	}
	
	private static Optional<Integer> convert(String s){
		try {
			
			return Optional.of(Integer.parseInt(s)); // 編譯錯誤 --> a 不能轉 Integer ...
		}
		catch (Exception e) {
			return Optional.empty();
		}
	}
}
