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

  @Override public String getUsername() throws RemoteException {
    return getUsername();
  }

  @Override public int getUserID()
  {
    return getUserID();
  }

  @Override public String getPassword()
  {
    return getPassword();
  }

  public String getTitle() {
    return title;
  }


}
