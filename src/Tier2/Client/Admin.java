package Tier2.Client;

import Tier2.Client.ClientImpl;

import java.beans.PropertyChangeListener;
import java.rmi.RemoteException;

public class Admin extends ClientImpl
{
  private String title;

  public Admin(String username, int userID, String password)

  {
    super(username, userID, password);
    title = "Admin";
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
  public String getTitle() {
    return title;
  }

  @Override public void addListener(String eventname,
      PropertyChangeListener listener) {

  }

  @Override public void addListener(PropertyChangeListener listener) {

  }

  @Override public void removeListener(String eventname,
      PropertyChangeListener listener) {

  }
}
