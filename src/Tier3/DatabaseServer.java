package Tier3;

import java.sql.ResultSet;

public interface DatabaseServer
{
  public void startDB();
  public void closeDB();
  public void addToDB(String sql);
  public ResultSet getFromDB(String sql);

}
