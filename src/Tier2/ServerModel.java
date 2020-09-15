package Tier2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerModel extends Remote
{
  public void registerClient(ClientImpl client) throws RemoteException;
}
