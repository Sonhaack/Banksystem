package Tier2.Client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Client extends Remote
{
  public void startClient() throws RemoteException;
  public String getUsername() throws RemoteException;
  public int getUserID() throws RemoteException;
  public String getPassword() throws RemoteException;
  public String getTitle() throws RemoteException;

}
