package Tier2.Client;

public abstract class ClientImpl implements Client
{
  private String username;
  private int userID;
  private String password;

  public ClientImpl(String username, int userID, String password)
  {
    this.username = username;
    this.userID = userID;
    this.password = password;
  }
}
