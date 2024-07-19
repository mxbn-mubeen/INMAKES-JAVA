package com.RMI;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.server.UnicastRemoteObject;

public class RMI_server extends UnicastRemoteObject implements RMI_Interface {

	RMI_server()  throws RemoteException{
		
	}
	
	@Override
	public int sum(int x,int y)throws RemoteException{
		return(x+y);
	}
	public static void main(String[] args) {
	
		try {
			RMI_Interface obj=new RMI_server();
			Naming.rebind("RMI_server", obj);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
