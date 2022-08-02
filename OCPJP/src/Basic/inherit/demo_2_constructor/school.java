package Basic.inherit.demo_2_constructor;

public class school {
	public school() { //建構子 overload --> 一定要擇一 super();
		System.out.println("new school!");
	}
	public school(String name) { //建構子 overload --> 一定要擇一 super();
		System.out.println("new school "+name); 
	}
	public school(String name,int chi) { //建構子 overload --> 一定要擇一 super();
		System.out.println("new school "+name+" "+chi);
	}
}
