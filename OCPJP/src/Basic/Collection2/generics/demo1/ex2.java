package Basic.Collection2.generics.demo1;

public class ex2 {
	public static void main(String[] args) {
		book2<Integer, Double> b =new book2<>("Java", 100, 100.2);
		System.out.println(b.getBookName()+" "+b.getBookPrice1()+" "+b.getBookPrice2());
	}
}
