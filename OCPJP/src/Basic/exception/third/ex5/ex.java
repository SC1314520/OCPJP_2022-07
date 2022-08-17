package Basic.exception.third.ex5;

public class ex {
	public static void main(String[] args){
	//	Order od=new Order("John", 10, 20);
	//	od.show();
		Order[] o =new Order[4];
		try {
			o[0]=new Order("a1", 1, 2);
			o[1]=new Order("a2", 2, 3);
			o[2]=new Order("a3", 3, 4);
			o[3]=new Order("a4", 4, 5);
			o[1].setRAM(-3);
			
		} catch (check e) {  // 若有自訂方法的話，建議使用 throws declaration
		
		} catch (Exception e) {
			System.out.println("RAM & Lcd 須 >= 0");
			e.printStackTrace();
		}

		for(Order x:o) {
			x.show();
		}
		
	}
}	
