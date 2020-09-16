package Tier2.Server;

import Tier2.Client.Client;
import Tier2.Client.ClientImpl;
import Tier3.DatabaseServer;

import java.rmi.RemoteException;

public class RMIServerImpl implements ServerModel
{

  private DatabaseServer DBS;

  @Override public void registerClient(Client client) throws RemoteException
  {

  }

  @Override
  public void startServer() throws RemoteException
  {

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
