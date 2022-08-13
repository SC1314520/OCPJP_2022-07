package Basic.Concurrency.Thread.ex2_runnable;
/*
 * 
 *   創建多線程程序的第二種方式：實現 Runnable。
 *   
 *   步驟：
 *   	1. 創建一個 Runnable 接口的實現類。
 *   	2. 在實現類中重寫 Runnable 接口的 run() 方法，設置線程任務。
 * 		3. 創建一個 Runnable 接口的實現類對象。
 * 		4. 創建 Thread 類對象，構造方法中傳遞 Runnable 接口的實現類對象。
 * 		5. 調用 Thread 類中的 start() 方法，開啟新線程執行run()方法。
 */

/*
 * 
 * 		Runnable的好處：
 * 			1. 避免了單繼承的局限性：一個類別只能繼承一個類別，類繼承了Thread類就不能繼承其他的類。
 * 			   	實現了Runnable接口，還可以繼承其他的類，實現其他的接口。
 * 			2. 增強了程序的擴展性，降低了程序的耦合性（解耦）。
 * 				實現 Runnable接口的方式，把設置線程任務和開啟新線程進行了分離（解耦），
 * 				實現類中，重寫了 run 方法：用來設置線程任務。
 * 				創建 Thread 類對象，調用 start方法：用來開啟新線程。
 * 
 * 
 */
public class demo1 {
	public static void main(String[] args) {
		RunnableImpl run =new RunnableImpl();
		Thread t =new Thread(run); // 打印線程名稱。
		Thread t2 =new Thread(new RunnableImpl2()); // 打印 Hello world。
		
		t.start();
		t2.start();
		
		for(int i=0;i<20;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}
/*
 Thread-0 0
main 0
Thread-0 1
main 1
Thread-0 2
main 2
Thread-0 3
main 3
Thread-0 4
main 4
Thread-0 5
main 5
Thread-0 6
main 6
Thread-0 7
main 7
Thread-0 8
main 8
Thread-0 9
main 9
Thread-0 10
main 10
Thread-0 11
main 11
Thread-0 12
main 12
Thread-0 13
main 13
Thread-0 14
main 14
main 15
main 16
Thread-0 15
Thread-0 16
Thread-0 17
Thread-0 18
Thread-0 19
main 17
main 18
main 19
 
 */
 