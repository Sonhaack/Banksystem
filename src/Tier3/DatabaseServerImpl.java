package Tier3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseServerImpl implements DatabaseServer
{

  private Connection c = null;

  @Override public void startDB()
  {
    c = null;
    try {
      Class.forName("org.postgresql.Driver");
      c = DriverManager
          .getConnection("jdbc:postgresql://localhost:5432/Bank",
              "postgres", "1234");
      c.setAutoCommit(false);
      System.out.println("Opened database successfully.");
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }

  @Override public void closeDB()
  {
    try {
      c.close();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  @Override public void addCustomerToDB()
  {

  }

  @Override public void addAccountToDB()
  {

  }

  @Override public void setBalance()
  {

  }

  @Override public void getCustomer()
  {

  }
}
