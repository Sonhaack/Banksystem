package Tier3;

public interface DatabaseServer
{
  public void startDB();
  public void closeDB();
  public void addCustomerToDB();
  public void addAccountToDB();
  public void setBalance();
  public void getCustomer();

}
