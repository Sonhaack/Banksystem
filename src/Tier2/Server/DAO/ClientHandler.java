package Tier2.Server.DAO;

import Tier2.Client.Customer;
import Tier3.DatabaseServer;

import java.rmi.RemoteException;

public class ClientHandler
{

  DatabaseServer dbs;

  public ClientHandler(DatabaseServer dbs) {
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


  public Customer retrieveCustomer(String username, String password) {


    String sql = "";
    dbs.getFromDB(sql);
    return null;
  }


}
