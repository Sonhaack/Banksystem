package Tier1.model;

import Shared.Subject;
import Tier2.Client.Account;
import Tier2.Client.Customer;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.sql.ResultSet;

public interface Model extends Subject {


  void withdrawMoney(double amount, Account account) throws RemoteException;
  void depositMoney(double amount, Account account) throws RemoteException;
  ResultSet getBalance(Account account) throws RemoteException;
  String getUsername() throws RemoteException;
  int getUserID() throws RemoteException;
  String getPassword() throws RemoteException;
  String getTitle() throws RemoteException;

  boolean verifyLogin();





}
