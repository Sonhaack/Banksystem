package Tier1.model;

import Tier2.Client.Account;
import Tier2.Client.Client;
import Tier2.Client.Customer;
import Tier2.Client.RMIClientImpl;

import java.beans.PropertyChangeListener;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;

public class ModelManager implements Model {

  private Client client;

  public ModelManager(Client client) {
    this.client = client;
  }



  @Override public void withdrawMoney(double amount, Account account)
      throws RemoteException {
    client.withdraw(amount, account);
  }

  @Override public void depositMoney(double amount, Account account)
      throws RemoteException {
    client.deposit(amount, account);
  }

  @Override public ResultSet getBalance(Account account)
      throws RemoteException {
    return client.getBalance(account);
  }

  @Override public String getUsername() throws RemoteException {
    return client.getUsername();
  }

  @Override public int getUserID() throws RemoteException {
    return client.getUserID();
  }

  @Override public String getPassword() throws RemoteException {
    return client.getPassword();
  }

  @Override public String getTitle() throws RemoteException {
    return client.getTitle();
  }

  @Override public boolean verifyLogin() {
    return false;
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
