package Tier2.Server;

import Tier2.Client.Client;
import Tier2.Client.ClientImpl;
import Tier3.DatabaseServer;
import Tier3.DatabaseServerImpl;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServerImpl implements ServerModel
{

  private DatabaseServer DBS;

  public RMIServerImpl() {
    DBS = new DatabaseServerImpl();
  }

  @Override public void registerClient(Client client) throws RemoteException
  {

  }

  @Override
  public void startServer() throws RemoteException, AlreadyBoundException {
    UnicastRemoteObject.exportObject(this, 0);
    Registry registry = LocateRegistry.createRegistry(1099);
    registry.bind("BankServer", this);
    DBS.startDB();
    System.out.println("Server started");
  }

  @Override
  public void createClient(Client client) throws RemoteException
  {

  }

  @Override
  public void withdrawMoney(double amount) throws RemoteException
  {

  }

  @Override
  public void depositMoney(double amount) throws RemoteException
  {

  }

  @Override
  public double getBalance() throws RemoteException
  {
    return 0;
  }


}
