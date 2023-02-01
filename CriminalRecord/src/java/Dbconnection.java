
import java.sql.*;

public class Dbconnection {
// JDBC driver name and database URL

    static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";

    //  Database credentials
    static final String USER = "YYYS";
    static final String PASSWORD = "1234";
    Connection connection = null;

    public Connection method() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
       // System.out.println("Connecting to a selected database...");
        connection= DriverManager.getConnection(URL, USER, PASSWORD);
     if (connection != null) {
           System.out.println("Connected database successfully...");
       } else {
           System.out.println("nFailed to connect to Oracle DB");
       }
        return connection;
    }
    public static void main(String[] arg) throws ClassNotFoundException, SQLException
    {
 Dbconnection nw=new Dbconnection();
  nw.method();
    }
    
}
