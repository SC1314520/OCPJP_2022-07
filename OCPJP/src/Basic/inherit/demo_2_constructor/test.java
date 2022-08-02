package Basic.inherit.demo_2_constructor;

public class test {
	public static void main(String[] args) {
		SA sa =new SA();   // new school! new SA!   --> 父類別會先執行!!! --> 因為super()必須放在第一行。
		new SA("Mary",80); // new school Mary    new SA(String name,int chi) 80
	}
}
