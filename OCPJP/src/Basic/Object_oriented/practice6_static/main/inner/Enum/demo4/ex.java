package Basic.Object_oriented.practice6_static.main.inner.Enum.demo4;import java.util.Arrays;
import java.util.spi.ToolProvider;

// java 7 以後才可！！！

enum book{ // book[]
	
	// java 7 以後 --> 物件型態  name(int x,int y)  這是建構子。
	java7(10, 10),java8(20, 20),javaWEB(30, 30) ; // --> book java7 =new book(), book java8 =new book(), book javaWEB =new book()
	
	private int price;
	private int amount;
	
	private book(int price,int amount) { //建構式一定要 private !!!
		this.price=price;
		this.amount=amount;
	}
	public int getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "price: "+price+" amount: "+amount;
	}
}

public class ex {
	public static void main(String[] args) {
		
		System.out.println(book.java7); // price: 10 amount: 10
		System.out.println(book.java7.getPrice()); // 10
		
		book.java7.setPrice(50);
		System.out.println(book.java7.getPrice()); // 50
		
		System.out.println(Arrays.toString(book.values()));
		
		for(book i:book.values()) {
			System.out.println(i.toString());
			
		}
		for(int i=0;i<book.values().length;i++) {
			System.out.println(book.values()[i]);
		}
	}
}

