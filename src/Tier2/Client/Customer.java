package Tier2.Client;

import Tier2.Client.ClientImpl;

import java.rmi.RemoteException;

public class Customer extends ClientImpl
{

  Client client;

  private String title;
  public Customer(String username, int userID, String password)
  {
    super(username, userID, password);
    title = "Customer";
    client = new RMIClientImpl();
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
