package exam;

public class ex12 {
	public static void main(String... args)
	{
		var character=new Avatar();
		character.move(10.0,10.0); //這會呼叫 Number參數方法 --> Move Character,Move GameObject   
		character.move(10,10);	 //這會呼叫 int參數方法 --> Move GameObject
	}
}
class GameObject{
	public Object[] move(int x,int y){ // overload
		System.out.println("Move GameObject");
		return new Integer[]{x+10,y+10};
	}	
}
class Avatar extends GameObject{
	public Object[] move(Number x,Number y){ //overload
		System.out.println("Move Character");
		return super.move(x.intValue(),y.intValue());
	}
}
