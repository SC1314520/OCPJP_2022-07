package Basic.inherit.demo_2_constructor;

public class SA extends school {
	int chi;
	public SA(){
		super();// 父類別的無參建構子 // super() 無參會自動加。-->父類別有建構子時，子類別一定要繼承。
		//super("ming"); 父類別的帶參建構子，同樣要放在第一行。
		System.out.println("new SA!");
	}
	public SA(String name,int chi) {
		super(name); //父類別的帶參建構子 --> super 要放在第一行!!
		this.chi=chi;
		System.out.println("new SA(String name,int chi) "+chi);
	}
	
}
