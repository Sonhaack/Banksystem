package Tier2;

public class Customer extends ClientImpl
{

  public Customer(String username, int userID, String password)
  {
    super(username, userID, password);
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
}
