package Tier2.Server;

import Tier2.Client.ClientImpl;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerModel extends Remote
{
  void registerClient(ClientImpl client) throws RemoteException;
  void startServer() throws RemoteException;

}
