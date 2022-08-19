package Basic.lambda_2.ex1;


interface book2<E>{
	public E bookPrice(E price);
}

public class ex2 {
	public static void main(String[] args) {
		book2<Integer> b1 =new book2<>() {


			@Override
			public Integer bookPrice(Integer price) {
				
				return price*10;
			}
		};
		
		book2<Double> b2 =price->price*0.95;
		
		System.out.println(b1.bookPrice(1000));
		System.out.println(b2.bookPrice(1000.0)); // 記得補.~
		
		//  int -> double     int 不可以給 Double
		// Double d =100;  不可以
		// double d =100;  可以
		
		book2<Integer> b3 =cal::b1;
		System.out.println(b3.bookPrice(200));
		
		book2<Double> b4 =cal::b2;
		System.out.println(b4.bookPrice(2000.0));
		
	}
}

class cal{
	public static Integer b1(Integer price) {
		if(price>=0) {
			return price*10;
		}
		else {
			return 0;
		}
	}
	public static Double b2(Double price) {
		if(price>=0) {
			return price*10;
		}
		else {
			return 0.0;
		}
	}
}
