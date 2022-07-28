package Basic.Object_oriented.practice2.main;

public class student_plus {
	char c; // 預設： \u0000 空白
	boolean b; // 預設： false
	float f; // 預設： 0.0f
	
	void printAll() {
		System.out.println(c); // 輸出：    （空白）
		System.out.println(b); // 輸出： false
		System.out.println(f); // 輸出： 0.0   (不會輸出 0.0f)
	}
	public static void main(String[] args) {
		student_plus s=new student_plus();
		s.printAll();
	}
}
