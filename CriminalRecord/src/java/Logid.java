
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yenes
 */
public class Logid {
     private String  username;
      private String  password;
    //validate login
    public String validateUsernamePassword() throws SQLException, ClassNotFoundException {
        boolean valid = Login.data(username, password);
        if (valid) {
              Dbconnection dbcon = new Dbconnection();
            Connection con = dbcon.method();
            PreparedStatement ps = con.prepareStatement("select USERTYPE from ADD1 where USERNAME=?");
            ps.setString(1, username);       
            ResultSet rs = ps.executeQuery();
            rs.next();
            String userType =rs.getString(1);
            //HttpSession session = Session.getSession();
            //session.setAttribute("username", user);
            if ("Admin".equals(userType)) {
                return "HomePage";
            } else {
                return "index";
            }
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "LoginPage";
        }
    }

    //logout event, invalidate session
    public String logout() {
       // HttpSession session = Session.getSession();
        //session.invalidate();
        return "LoginPage";
    }
    
}
