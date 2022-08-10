package exam;

public class ex6_i {
	public void process(byte v){
		System.out.println("Byte value "+v);
	}
	public void process(short v){
		System.out.println("Short value "+v);
	}
	// 若有（int v)，則以（int v）方法呼叫
	public void process(Object v){ // Object 中有 Integer --> 故以 Integer 作接收。
		System.out.println("Object value "+v);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=12;
		short y=13;
		//promotion  --> byte/short 會被提升為 int !!!
		int z=x+y;
		//int z2=x+x;
		//int z3=y+y;
		new ex6_i().process(x+y);// line 1
		
	}

}
