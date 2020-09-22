package Tier2.Server.DAO;

import Tier2.Client.Account;
import Tier2.Client.Client;
import Tier2.Client.Customer;
import Tier3.DatabaseServer;
import Tier3.DatabaseServerImpl;

public class AssistantHandler
{
  private DatabaseServer dbs;

  public AssistantHandler(DatabaseServer dbs) {
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




}
