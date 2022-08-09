package Basic.exception.demo4;

public class test {
	public static void main(String[] args) throws check{
		student2 s =new student2();
		
		System.out.println(s.SumA(-56, 89)); // 範圍須介於0~100
		System.out.println(s.SumB(-85, 89)); // chi: -85 eng: 89 範圍須介於0~200
		
	}
}
