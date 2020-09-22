package Tier2.Server;

import Tier2.Client.Account;
import Tier2.Client.Customer;
import Tier2.Server.DAO.AccountHandler;
import Tier2.Server.DAO.ClientHandler;
import Tier3.DatabaseServer;
import Tier3.DatabaseServerImpl;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.ResultSet;

public class RMIServerImpl implements ServerModel
{

  private DatabaseServer DBS;
  private AccountHandler accountHandler;
  private ClientHandler clientHandler;

  public RMIServerImpl() {
    DBS = new DatabaseServerImpl();
    accountHandler = new AccountHandler(DBS);
    clientHandler = new ClientHandler(DBS);
  }



  @Override
  public void startServer() throws RemoteException, AlreadyBoundException {
    UnicastRemoteObject.exportObject(this, 0);
    Registry registry = LocateRegistry.createRegistry(1099);
    registry.bind("BankServer", this);
    DBS.startDB();
    System.out.println("Server started");
  }

  @Override
  public void createClient(Customer customer) throws RemoteException
  {
    clientHandler.createCustomer(customer.getUsername(), customer.getPassword(), customer.getUserID());
  }

  @Override
  public void withdrawMoney(double amount, Account account) throws RemoteException
  {
    accountHandler.withdraw(amount, account);
  }

  @Override
  public void depositMoney(double amount, Account account) throws RemoteException
  {
    accountHandler.deposit(amount, account);
  }

  @Override
  public ResultSet getBalance(Account account) throws RemoteException
  {
    return accountHandler.getBalance(account);
  }

  @Override public String getUsername() throws RemoteException {
    return null;
  }

  @Override public int getUserID() throws RemoteException {
    return 0;
  }

  @Override public String getPassword() throws RemoteException {
    return null;
  }

  @Override public String getTitle() throws RemoteException {
    return null;
  }

  @Override public boolean verifyLogin() throws RemoteException {
    return false;
  }

}
