package Tier2.Client;

public class Account
{
  private double balance;
  private int accountNo;
  private Customer customer;

  public Account(int accountNo, Customer customer, double balance)
  {
    this.balance = balance;
    this.accountNo = accountNo;
    this.customer = customer;
  }

  public double getBalance()
  {
    return balance;
  }

  public Customer getCustomer() {
    return customer;
  }

  public int getAccountNo() {
    return accountNo;
  }

  public double withdraw(double amount)
  {
    return balance -= amount;
  }

  public double deposit(double amount)
  {
    return balance += amount;
  }


}
