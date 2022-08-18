package Basic.Collection2.generics.demo1;

public class book<E> {
	String bookName;
	E bookPrice;
	public book(String bookName, E bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public E getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(E bookPrice) {
		this.bookPrice = bookPrice;
	}
}
