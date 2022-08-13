package Basic.Concurrency.Thread.ex1_thread;
/*
 * 	創建多線程程序的第一種方式： 創建 Thread 類別的子類。
 * 	java.lang.Thread 類： 是描述線程的類，若要實現多線程程序，則必須繼承 Thread 類。
 *
 *	步驟：
 *		1. 創建一個 Thread 類的子類。
 *		2. 在 Thread 類的子類中重寫 Thread 類中的 run 方法，設置線程任務。
 *		3. 創建 Thread 類的子類對象。
 *		4. 調用 Thread 類中的 start 方法，開啟新的線程，執行 run 方法。
 */
public class demo1 {
	public static void main(String[] args) {
		// 多線程 --> 不再是由上而下單線程固定執行，而是隨機執行（Java 搶佔式）。
		MyThread mt =new MyThread();
		// mt.run(); --> 這樣呼叫會變成單線程。
		mt.start(); // 多線程呼叫。--> 不同線程互不影響 --> 假若主線程出錯，其他線程依舊不會錯誤！！
		
		for(int i=0;i<20;i++) {
			System.out.println("main: "+i);
		}
	}
}
/*
run: 0
main: 0
main: 1
main: 2
main: 3
main: 4
main: 5
run: 1
main: 6
main: 7
main: 8
main: 9
main: 10
run: 2
run: 3
run: 4
run: 5
run: 6
run: 7
run: 8
main: 11
run: 9
main: 12
main: 13
main: 14
main: 15
main: 16
main: 17
main: 18
main: 19
run: 10
run: 11
run: 12
run: 13
run: 14
run: 15
run: 16
run: 17
run: 18
run: 19

 */
