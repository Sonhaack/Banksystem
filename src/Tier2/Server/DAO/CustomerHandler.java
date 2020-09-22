package Tier2.Server.DAO;

import Tier2.Client.Account;
import Tier3.DatabaseServer;
import Tier3.DatabaseServerImpl;

import java.rmi.RemoteException;
import java.sql.ResultSet;

public class CustomerHandler
{
  private DatabaseServer dbs;

  public CustomerHandler(DatabaseServer dbs) {
    this.dbs = dbs;
  }



  public ResultSet getBalance(Account account) throws RemoteException {
    String sql = "SELECT balance FROM account WHERE account = '" + account.getAccountNo() + "';";
    return dbs.getFromDB(sql);
  }

  public void withdraw(double amount, Account account) throws RemoteException {
    String sql = "UPDATE \"Banksystem\".account set balance = '" + account.withdraw(amount) + "' WHERE account = '" + account.getAccountNo() + "';";
    dbs.addToDB(sql);
  }


}
