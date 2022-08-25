package Basic.Concurrency_3;

public class focus {
	public static void main(String[] args) {
		
	}
}
/*


Runnable 和 Callable 的區別是，
(1)Callable規定的方法是call(),Runnable規定的方法是run().
(2)Callable在執行後可返回值，而Runnable在執行後不能返回值
(3)call方法可以拋出異常，run方法不可以。
(4)執行Callable會返回Future物件，表示非同步計算的結果。
它提供了檢查計算是否完成的方法，以等待計算的完成，並檢索計算的結果。
通過Future物件可以瞭解執行情況，可取消執行，還可獲取執行結果。



*/


/*

語法：
	ExecutorService ex =Executors.newCachedThreadPool();

newCachedThreadPool ：
创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，否则新建线程。（线程最大并发数不可控制）
newFixedThreadPool：
创建一个固定大小的线程池，可控制线程最大并发数，超出的线程会在队列中等待。
newScheduledThreadPool ： 创
建一个定时线程池，支持定时及周期性任务执行。
newSingleThreadExecutor ：
创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。


*/


/*
 *  Interface ExecutorService
 * 
 *  API :
 *  	awaitTermination(long timeout, TimeUnit unit)
 * 		invokeAll(Collection<? extends Callable<T>> tasks)
 * 		invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
 * 		invokeAny(Collection<? extends Callable<T>> tasks)
 * 		invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
 * 		isShutdown()
 * 		isTerminated()
 * 		shutdown()
 * 		shutdownNow()
 * 		submit(Callable<T> task)
 * 		submit(Runnable task)
 * 		submit(Runnable task, T result)
 * 		execute(Runnable command)
 */
