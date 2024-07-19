package com.multhithreading.creatingmultithread;

public class Thread_demo implements Runnable {

	Thread t;
	String threadName;
	Thread_demo(String name,int priority){
		
		threadName=name;
		t=new Thread(threadName);
		t.setName(threadName);
		t.setPriority(priority);
		
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"starts");
		System.out.println(Thread.currentThread().getName()+" priority "+t.getPriority());
		
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"starts");
	}

}
