package Tier2.Client;

import Tier2.Server.RMIServerImpl;
import Tier2.Server.ServerModel;

import java.beans.PropertyChangeListener;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;

public class RMIClientImpl implements Client
{

  private ServerModel sm;


  public RMIClientImpl() {
    sm = new RMIServerImpl();
  }



  @Override
  public void startClient() {
    try {
      UnicastRemoteObject.exportObject(this, 0);
      Registry registry = LocateRegistry.getRegistry("localhost", 1099);
      sm = (RMIServerImpl) registry.lookup("BankServer");
    }
    catch (NotBoundException | RemoteException e) {
      System.out.println("Registry lookup failed in RMIClientImpl");
      e.printStackTrace();
    }

  }

  @Override public String getUsername() {
    return sm.getUsername();
  }

  @Override public int getUserID() {
    return sm.getUserID();
  }

  @Override public String getPassword() {
    return sm.getPassword();
  }

  @Override
  public String getTitle(){
    return sm.getTitle();
  }

  public ResultSet getBalance(Account account) {
    return sm.getBalance(account);
  }

  public void withdraw(double amount, Account account) {
    sm.withdrawMoney(amount, account);
  }

  public void deposit(double amount, Account account) {
    sm.depositMoney(amount, account);
  }

  @Override public void addListener(String eventname,
      PropertyChangeListener listener) {

  }

  @Override public void addListener(PropertyChangeListener listener) {

  }

  @Override public void removeListener(String eventname,
      PropertyChangeListener listener) {

  }
}
