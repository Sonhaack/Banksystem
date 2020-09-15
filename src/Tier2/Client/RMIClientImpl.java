package Tier2.Client;

import Tier2.Client.Client;
import Tier2.Client.ClientImpl;

public class RMIClientImpl implements Client
{

  public void registerClient(ClientImpl client)
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
}
