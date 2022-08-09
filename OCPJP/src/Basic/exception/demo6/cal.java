package Basic.exception.demo6;



public class cal {
	String sum(int x,int y) throws Exception{
		if(x>0 && y>0) {
			return "總分: "+(x+y);
		}else {
			throw new Exception();
		}
		
	}
}

