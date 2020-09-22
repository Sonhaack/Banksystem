package Tier2.Server;

import Tier2.Client.Client;
import Tier2.Client.ClientImpl;

import java.rmi.AlreadyBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerModel extends Remote
{
  void registerClient(Client client) throws RemoteException;
  void startServer() throws RemoteException, AlreadyBoundException;
  void createClient(Client client) throws RemoteException;
  void withdrawMoney(double amount) throws RemoteException;
  void depositMoney(double amount) throws RemoteException;
  double getBalance() throws RemoteException;

}
