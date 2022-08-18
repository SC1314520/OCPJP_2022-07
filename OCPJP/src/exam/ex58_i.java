package exam;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ex58_i {
	public static void main(String[] args) throws InterruptedException {
		
		// 主執行緒
		var c=new CopyOnWriteArrayList<>(List.of("1","2","3","4"));
		
		
		// 副執行緒
		Runnable r=()->{  // 生命週期
			try{
				Thread.sleep(150);  
			}
			catch(InterruptedException e){
				System.out.println(e);	
			}
			c.set(3,"four");  // set --> replace   // [1,2,3,four]
			System.out.print(c+" ");
			};
		Thread t=new Thread(r);
		t.start();
		
		//
		for(var s:c) // [1,2,3,4]
		{
			System.out.print(s+" ");
			Thread.sleep(100); 
		}
	}
}
/*
Given:

var c=new CopyOnWriteArrayList<>(List.of("1","2","3","4"));
Runnable r=()->{
	try{
		Thread.sleep(150);
	}
	catch(InterruptedException e){
		System.out.println(e);	
	}
	c.set(3,"four");
	System.out.print(c+" ");
	};
Thread t=new Thread(r);
t.start();
for(var s:c)
{
	System.out.print(s+" ");
	Thread.sleep(100);
}


What is the output?

A) 1 2 [1, 2, 3, four] 3 4

B) 1 2 [1, 2, 3, 4] 3 four

C) 1 2 [1, 2, 3, 4] 3 4

D) 1 2 [1, 2, 3, four] 3 four





ans:A
*/