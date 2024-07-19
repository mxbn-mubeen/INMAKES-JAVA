package com.collectionmethod;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_demo {

	public static void main(String[] args) {
		/*Queue - data structur FIFO(fisrt in fisrt out)manner
		 * peak()- retrieve the front position element(remove firdt insert element)
		 * poll()- remove the front position elemnt
		 * element()-retrieve the first element
		 * offer()-add the element
		 */
		
		System.out.println("QUEUE INTERFACE USING LINKEDLIST");
		
		 Queue<Integer>q1=new LinkedList();
		 
		 q1.add(25);
		 q1.add(8);
		 q1.add(7);
		 q1.add(2);
		 q1.add(8);
		 q1.add(12);
		 
		 q1.offer(15);
		 
		 System.out.println("q1="+q1);
		 
		 System.out.println("using peek() method");
		 System.out.println(q1.peek()); 
		 System.out.println("q1="+q1);
		 
		 System.out.println("using poll() method");
		 System.out.println(q1.poll());
		 System.out.println("q1="+q1);
		 
		 System.out.println("using element() method");
		 System.out.println(q1.element());
		 System.out.println("q1="+q1);
		 
		 
		 System.out.println("QUEUE INTERFACE USING PRIORITYQUEUE");
		 
		 Queue<Integer>q2=new PriorityQueue();
		 
		 q2.add(25);
		 q2.add(8);
		 q2.add(7);
		 q2.add(2);
		 q2.add(8);
		 q2.add(12);
		 
		 q2.offer(15);
		 
		 System.out.println("q2="+q2);
		 
		 System.out.println("using peek() method");
		 System.out.println(q2.peek()); 
		 System.out.println("q2="+q2);
		 
		 System.out.println("using poll() method");
		 System.out.println(q2.poll());
		 System.out.println("q2="+q2);
		 
		 System.out.println("using element() method");
		 System.out.println(q2.element());
		 System.out.println("q2="+q2);

	}

}
