package com.RMI;

import java.rmi.*;
import java.util.*;

public class RMI_client {

	public static void main(String[] args) {
		try {
			int a,b,c;
			Scanner scn=new Scanner(System.in);
			
			System.out.println("Enter The 1st Number");
			a=scn.nextInt();
			
			System.out.println("Enter The 2nd Number");
			b=scn.nextInt();
			
			RMI_Interface obj=(RMI_Interface)Naming.lookup("RMI_server");
			
			c=obj.sum(a,b);//remote procedure call(RPC)
			System.out.println("Sum of Two Numbers:"+c);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
