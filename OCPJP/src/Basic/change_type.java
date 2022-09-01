package Basic;


abstract class Ball{
	protected final int size;
	public Ball(){
		this.size = 0;
	
	}
	public Ball(int size){
		this.size=size;
	}
}
interface Equipment{}
class SoccerBall extends Ball implements Equipment{
	public SoccerBall(){
		super(5);
	}
	public Ball get(){ 
		return this; 
	}
}
public class change_type {
	public static void main(String[] args) {
		var equipment=(Equipment)(Ball)new SoccerBall().get();
		// 向上轉型一定安全，向下轉型不安全。
		System.out.println(equipment.getClass()); // class Basic.SoccerBall
		System.out.println(((SoccerBall)equipment).size); // 5
	}
}
