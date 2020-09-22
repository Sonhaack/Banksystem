package Tier2.Server.DAO;

import Tier2.Client.Account;
import Tier3.DatabaseServer;
import Tier3.DatabaseServerImpl;

import java.rmi.RemoteException;
import java.sql.ResultSet;

public class CustomerHandler
{
  private DatabaseServer dbs;

  public CustomerHandler() {
    dbs = new DatabaseServerImpl();
  }



  public ResultSet getBalance(Account account) throws RemoteException {
    String sql = "";
    return dbs.getFromDB(sql);
  }

  public void withdraw(double amount) throws RemoteException {

  }

  public void deposit(double amount) throws RemoteException {

  }


}
