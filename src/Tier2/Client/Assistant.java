package Tier2.Client;

import Tier2.Client.ClientImpl;

import java.rmi.RemoteException;

public class Assistant extends ClientImpl
{

  private String title;

  public Assistant(String username, int userID, String password)
  {
    super(username, userID, password);
    title = "Assistant";
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

  @Override
  public String getTitle() throws RemoteException {
    return null;
  }
}
