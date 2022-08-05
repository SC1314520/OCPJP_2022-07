package Basic.inherit.demo_5_final;

public class S1 extends Order{
	private int Ruler;
	
	public S1(String name,int Ruler) {
		super(name);
		this.Ruler=Ruler;
	}
	public String show1() { // 因為父類別的 show() 方法是 final ， 所以不可 override，需撰寫新名稱才能使用。
		return super.show()+" Ruler: "+Ruler;
	}
}
