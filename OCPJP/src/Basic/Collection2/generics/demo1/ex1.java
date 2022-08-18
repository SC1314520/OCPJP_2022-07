package Basic.Collection2.generics.demo1;

public class ex1 {
	public static void main(String[] args) {
		book<Integer> b =new book<>("java", 100);  // java 7 以後， 後者的 <> 內部可以省略不寫～
		System.out.println(b.getBookName()+" "+b.getBookPrice());
		
		book<Double> b2 =new book<>("java", 100.12); // 記得 xx.~
		System.out.println(b2.getBookName()+" "+b2.getBookPrice());
	}
}
