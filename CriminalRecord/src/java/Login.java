
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yenes
 */
public class Login{

    
 public static boolean data(String username, String password){
        boolean status = false;
        try {
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java2021", "1616");
            //CallableStatement callobj=con.prepareCall("{call SsELECTUSe(?)}");
            Dbconnection dbcon = new Dbconnection();
            Connection con = dbcon.method();
            PreparedStatement ps = con.prepareStatement("select * from ADD1 where USERNAME=? and PASSWORD=?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}

           
          
    
    
