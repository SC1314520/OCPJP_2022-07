package Basic;

public class pri_enhance {
	public void process(byte v){
		System.out.println("Byte value "+v);
	}
	public void process(short v){
		System.out.println("Short value "+v);
	}
	public void process(Object v){
		System.out.println("Object value "+v);
	}
	
//	public void process(Integer v){
//		System.out.println("Integer value "+v);
//	}
	public void process(Float v){
		System.out.println("Float value "+v);
	}
	public void process(Double v){
		System.out.println("Double value "+v);
	}
//	public void process(int v){
//		System.out.println("int value "+v);
//	}
//	public void process(long v){
//		System.out.println("long value "+v);
//	}
//	public void process(float v){
//		System.out.println("float value "+v);
//	}
//	public void process(double v){
//		System.out.println("double value "+v);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte x=12;
		short y=13;
		//promotion
		int z=x+y;
		new pri_enhance().process(x+y);// line 1
		
	}
	// byte+short 會升格為 int --> 找尋優先順序： int -> long -> float -> double -> Integer --> Object
}
