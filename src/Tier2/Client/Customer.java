package Tier2.Client;

import Tier2.Client.ClientImpl;

public class Customer extends ClientImpl
{
  private String title;
  public Customer(String username, int userID, String password)
  {
    super(username, userID, password);
    title = "Customer";
  }

  @Override public void startClient()
  {

  }

  @Override public String getUsername()
  {
    return null;
  }

  @Override public int getUserID()
  {
    return 0;
  }

  @Override public String getPassword()
  {
    return null;
  }

  public String getTitle() {
    return title;
  }
}
