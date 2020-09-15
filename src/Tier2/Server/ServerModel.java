package Tier2.Server;

import Tier2.Client.ClientImpl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerModel extends Remote
{
  public void registerClient(ClientImpl client) throws RemoteException;
}
