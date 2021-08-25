package project.util;

import java.sql.*;
public class DbUtil {
   /*
   * 1.Create database connection(Require connection class and object )
   * 2.Execute the query (Use statement object)
   * 3.Close connection*/

    private final Connection connection;
    private Statement statement;

    String className= "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/library_system_management"; //communicates and connect with database
    String username = "root";
    String password= "bahati8260";

    public DbUtil() throws SQLException, ClassNotFoundException {
        Class.forName(className);
        connection = DriverManager.getConnection(url,username,password);
    }

    @Override
    protected void finalize() throws Throwable {
        this.closeConnection();
    }

    /*Fetch data from the database
        Accepts select statement only*/
    public ResultSet readData(String query) throws SQLException {
        statement = connection.createStatement();
        return statement.executeQuery(query);
    }
    public int writeData(String query) throws SQLException {
        statement =connection.createStatement();
        return statement.executeUpdate(query);
    }
    public void closeConnection() throws SQLException {
        statement.close();
        connection.close();
    }

}
