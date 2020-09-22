package Tier2.Server.DAO;

import Tier2.Client.Account;
import Tier2.Client.Customer;
import Tier3.DatabaseServer;
import Tier3.DatabaseServerImpl;

public class AdminHandler
{
  DatabaseServer dbs;

  public AdminHandler() {
    dbs = new DatabaseServerImpl();
  }



  public void createCustomer(String username, String password, int userID) {

    dbs.addToDB("INSERT into \"Banksystem\".client(brugernavn, kodeord, brugerid) VALUES ('" + username + "', '" + password + "', '" + userID + "');");
  }


  public void createAccount(int accountNo, Customer customer) {
    Account account = new Account(accountNo, customer);
    

  }
}
