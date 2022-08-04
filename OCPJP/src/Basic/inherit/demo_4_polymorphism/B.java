package Basic.inherit.demo_4_polymorphism;

public class B extends school{
	private int Eng;
	public B(String name,int Eng) {
		super(name);
		this.Eng=Eng;
	}
	@Override
	public String toString() {
		return "B [Eng=" + Eng + "]";
	}
		
}
