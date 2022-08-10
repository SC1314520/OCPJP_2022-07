package exam;

public class ex15_i {
	public static void main(String[] args){
		A obj=new B();					//line 4
		System.out.println(obj.x);		//line 5	
	}
}
class A{
	public int x=42;
	protected A(){}      //line 1
}
class B extends A{
	int x=17;				//line 2
	public B(){super();}	//line 3
}

// 輸出為 42 !!


// field 跟 method 的規則不同 
// field 是看宣告類別(A)，method 是看 new 的類別(B)。 ... about line 4
// field 的繼承開放權限無需比大小  ... about line 2