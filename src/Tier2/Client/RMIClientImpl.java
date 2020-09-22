package Tier2.Client;

import Tier2.Client.Client;
import Tier2.Client.ClientImpl;
import Tier2.Server.RMIServerImpl;
import Tier2.Server.ServerModel;

import java.rmi.RemoteException;

public class RMIClientImpl implements Client
{

  private ServerModel sm;

  public void registerClient(ClientImpl client)
  {
    sm = new RMIServerImpl();
  }

  @Override
  public void startClient() throws RemoteException {

  }

  @Override public String getUsername()
  {
    return null;
  }

  @Override public int getUserID()
  {
    return 0;
  }

  @Override public String getPassword()
  {
    return null;
  }

  @Override
  public String getTitle() throws RemoteException {
    return null;
  }

  public double getBalance() throws RemoteException {
    return sm.getBalance();
  }

  public void withdraw(double amount) throws RemoteException {
    sm.withdrawMoney(amount);
  }

  public void deposit(double amount) throws RemoteException {
    sm.depositMoney(amount);
  }


}
