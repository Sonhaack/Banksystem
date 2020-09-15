package Tier3;

import java.sql.*;

public class DatabaseServerImpl implements DatabaseServer
{

  private Connection connection = null;
  private Statement statement = null;

  @Override public void startDB()
  {
    connection = null;
    try {
      Class.forName("org.postgresql.Driver");
      connection = DriverManager
          .getConnection("jdbc:postgresql://localhost:5432/Bank",
              "postgres", "1234");
//      connection.setAutoCommit(false);
      System.out.println("Opened database successfully.");
    } catch (ClassNotFoundException | SQLException e) {
      e.printStackTrace();
    }
  }

  @Override public void closeDB()
  {
    try {
      statement.close();
      connection.close();
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }

  @Override public void addToDB(String sql)
  {
    startDB();
    try
    {
      statement = connection.createStatement();

      String toSql = sql;

      statement.executeUpdate(toSql);


    }
    catch (SQLException throwables)
    {
      System.out.println("DB Not working!");
    }
    closeDB();
  }

  @Override public ResultSet getFromDB(String sql)
  {
    try
    {
      statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery(sql);
      return resultSet;
    }
    catch (SQLException throwables)
    {
      throwables.printStackTrace();
    }
    return null;
  }
}
