package com.RMI;

import java.rmi.*;

public interface RMI_Interface extends Remote{

	public int sum(int x,int y)throws RemoteException;//Remote procedure
}
