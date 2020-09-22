package Tier2.Client;

import Shared.Subject;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Subject
{
  public void startClient();
  public String getUsername();
  public int getUserID();
  public String getPassword();
  public String getTitle();

}
