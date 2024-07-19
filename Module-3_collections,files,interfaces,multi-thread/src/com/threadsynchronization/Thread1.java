package com.threadsynchronization;

public class Thread1 extends Thread{
	
	/*Table t1;
	public Thread1(Table t1) {
		
		this.t1=t1;
	}
	*/
	@Override
	public void run() {
		
		//t1.printTable(2);//onject calling
		Table.printTable(2);//class calling
		
	}
}
