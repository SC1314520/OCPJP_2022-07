package Basic.Concurrency_2.demo2;



public class ex { // Runnable
	public static void main(String[] args) {
		student2 s1= new student2("a1", 10);
		student2 s2= new student2("b1", 20);
		student2 s3= new student2("c1", 30);
		
		
		new Thread(s1).start();
		new Thread(s2).start();
		new Thread(s3).start();
	}
}
