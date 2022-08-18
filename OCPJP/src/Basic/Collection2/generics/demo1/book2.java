package Basic.Collection2.generics.demo1;

public class book2<E,T> {
	String bookName;
	E bookPrice1;
	T bookPrice2;
	public book2(String bookName, E bookPrice1, T bookPrice2) {
		super();
		this.bookName = bookName;
		this.bookPrice1 = bookPrice1;
		this.bookPrice2 = bookPrice2;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public E getBookPrice1() {
		return bookPrice1;
	}
	public void setBookPrice1(E bookPrice1) {
		this.bookPrice1 = bookPrice1;
	}
	public T getBookPrice2() {
		return bookPrice2;
	}
	public void setBookPrice2(T bookPrice2) {
		this.bookPrice2 = bookPrice2;
	}
	
}
