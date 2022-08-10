package exam;

abstract class Ball{
	protected final int size; // protected 可繼承使用。
	public Ball(int size){
		this.size=size;
	}
}
interface Equipment{}
class SoccerBall extends Ball implements Equipment{
	public SoccerBall(){
		super(5); // size=5;
	}
	
	//  異質宣告  --> Ball 是 SoccerBall 的 superClass
	public Ball get(){ return this; }  // return this --> 回傳此物件！！
	

}
public class ex11_i {
	public static void main(String[] args) {
		var equipment=(Equipment)(Ball)new SoccerBall().get();
		System.out.print(((SoccerBall)equipment).size); // 因為 equipment 沒有 size 名稱，所以需要轉型
		
	}
}
