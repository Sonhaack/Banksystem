package Tier2.Server.DAO;

import Tier2.Client.Account;
import Tier3.DatabaseServer;

import java.rmi.RemoteException;
import java.sql.ResultSet;

public class AccountHandler
{

  private DatabaseServer dbs;

  public AccountHandler(DatabaseServer dbs) {
    this.dbs = dbs;
  }


  public void withdraw(double amount, Account account) {
    String sql = "UPDATE \"Banksystem\".account set balance = '" + account.withdraw(amount) + "' WHERE account = '" + account.getAccountNo() + "';";
    dbs.addToDB(sql);
  }


  public void deposit(double amount, Account account) {
    String sql = "UPDATE \"Banksystem\".account set balance = '" + account.deposit(amount) + "' WHERE account = '" + account.getAccountNo() + "';";
    dbs.addToDB(sql);
  }


  public ResultSet getBalance(Account account) throws RemoteException {
    String sql = "SELECT balance FROM account WHERE account = '" + account.getAccountNo() + "';";
    return dbs.getFromDB(sql);
  }


}
