package com.threadsynchronization;

public class Thread2 extends Thread{
	
	/*Table t1;
	public Thread2(Table t1) {  
		
		this.t1=t1;
	}
	*/
	@Override
	public void run() {
		
		//t1.printTable(3); //object calling
		Table.printTable(3);//class calling
		
	}
}
