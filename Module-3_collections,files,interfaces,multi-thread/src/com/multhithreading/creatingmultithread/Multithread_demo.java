package com.multhithreading.creatingmultithread;

public class Multithread_demo {

	public static void main(String[] args) {
		
		/*MAX_PRIORITY=10
		 * MIN_PRIORITY=1
		 * NORM_PRIORITY=5
		 */
		
		try {
			
			/*int priority=Thread.MAX_PRIORITY;
			System.out.println("priority="+priority);*/
			
			
			Runnable obj1=new Thread_demo("Thread-1",Thread.MAX_PRIORITY);//object creation
			Runnable obj2=new Thread_demo("Thread-2",Thread.NORM_PRIORITY);//object creation
			Runnable obj3=new Thread_demo("Thread-3",Thread.MIN_PRIORITY);//object creation
			
			Thread t1=new Thread(obj1);
			t1.start();
			//t1.stop();
			
			Thread t2=new Thread(obj2);
			t2.start();
			//t2.interrupt();
			
			Thread t3=new Thread(obj3);
			t3.start();
			
			System.out.println(Thread.currentThread().getName()+"starts");
			
			System.out.println(t1.getName()+" is Alive="+t1.isAlive());
			System.out.println(t2.getName()+" is Alive="+t2.isAlive());
			System.out.println(t3.getName()+" is Alive="+t3.isAlive());
			
			for(int i=1;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+"="+i);
				Thread.sleep(1000);
		}
			t1.join();//wait for thread to die
			t2.join();
			t3.join();
			
			System.out.println(t1.getName()+" is Alive="+t1.isAlive());
			System.out.println(t2.getName()+" is Alive="+t2.isAlive());
			System.out.println(t3.getName()+" is Alive="+t3.isAlive());
			
			System.out.println(Thread.currentThread().getName()+"ends");
			
	}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}