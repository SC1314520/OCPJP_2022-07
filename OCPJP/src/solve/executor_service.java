package solve;

public class executor_service {

}
/*
Which of the following methods is not available on an ExecutorService instance?
(Choose two.)

A. execute(Callable)
B. shutdownNow()
C. submit(Runnable)
D. exit()
E. submit(Callable)
F. execute(Runnable)




ans:A,D



*/
/*
上層方法

execute(Runnable command)

本層方法：
awaitTermination(long timeout, TimeUnit unit)

invokeAll(Collection<? extends Callable<T>> tasks)

invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)

invokeAny(Collection<? extends Callable<T>> tasks)

invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)

isShutdown()

isTerminated()

shutdown()

shutdownNow()

submit(Callable<T> task)

submit(Runnable task)

	submit(Runnable task, T result)
*/