package exam;

public class ex5 {
	static StringBuilder sb1=new StringBuilder("yo ");
	StringBuilder sb2=new StringBuilder("hi ");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sb1=sb1.append(new ex5().foo(new StringBuilder("hey"))); 
		System.out.println(sb1); // yo ey  （後）
		
	}
	StringBuilder foo(StringBuilder s){
		System.out.print(s+" oh " +sb2); // hey oh hi    
		return new StringBuilder("ey");
	}
	
	//輸出結果： hey oh hi yo ey
}
