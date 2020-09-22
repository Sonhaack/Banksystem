package Tier2.Client;

import Tier2.Server.RMIServerImpl;
import Tier2.Server.ServerModel;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;

public class RMIClientImpl implements Client
{

  private ServerModel sm;


  public RMIClientImpl() {

  }



  @Override
  public void startClient() throws RemoteException {
    try {
      UnicastRemoteObject.exportObject(this, 0);
      Registry registry = LocateRegistry.getRegistry("localhost", 1099);
      sm = (RMIServerImpl) registry.lookup("BankServer");
    }
    catch (NotBoundException e) {
      System.out.println("Registry lookup failed in RMIClientImpl");
      e.printStackTrace();
    }

  }

  @Override public String getUsername() throws RemoteException {
    return sm.getUsername();
  }

  @Override public int getUserID() throws RemoteException {
    return sm.getUserID();
  }

  @Override public String getPassword() throws RemoteException {
    return sm.getPassword();
  }

  @Override
  public String getTitle() throws RemoteException {
    return sm.getTitle();
  }

  public ResultSet getBalance(Account account) throws RemoteException {
    return sm.getBalance(account);
  }

  public void withdraw(double amount, Account account) throws RemoteException {
    sm.withdrawMoney(amount, account);
  }

  public void deposit(double amount, Account account) throws RemoteException {
    sm.depositMoney(amount, account);
  }


}
