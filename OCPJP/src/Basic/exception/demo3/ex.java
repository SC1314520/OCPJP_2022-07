package Basic.exception.demo3;

public class ex {
	public static void main(String[] args) { // 這裡也要加 throws Exception 或 try-catch ----(1)
		
		try {
			
			student s =new student("aa", 74, 85);
			System.out.println(s.show());
			s.Sum(-85, 70);
			System.out.println(s.show());
			
		} catch (Exception e) {
			
			System.out.println("必須是 0~100!");
		}
	
	}
}
