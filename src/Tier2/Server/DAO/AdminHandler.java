package Tier2.Server.DAO;

import Tier2.Client.Account;
import Tier2.Client.Customer;
import Tier3.DatabaseServer;
import Tier3.DatabaseServerImpl;

import java.rmi.RemoteException;
import java.sql.ResultSet;

public class AdminHandler
{
  private DatabaseServer dbs;

  public AdminHandler(DatabaseServer dbs) {
    this.dbs = dbs;
  }



  public void createCustomer(String username, String password, int userID) {
    String sql = "INSERT into \"Banksystem\".client(brugernavn, kodeord, brugerid) VALUES ('" + username + "', '" + password + "', '" + userID + "');";
    dbs.addToDB(sql);
  }


  public void createAccount(int accountNo, Customer customer)
      throws RemoteException {
    String sql = "INSERT into \"Banksystem\".account(account, balance, username) VALUES ('" + accountNo + "', '" + 0 + "','" + customer.getUsername()+ "');";
    dbs.addToDB(sql);
  }


}
