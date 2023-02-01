
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yenes
 */
@ManagedBean(name="addmin")
@RequestScoped
public class Addmin {
  
private String fileNumber;

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    private String  userName ; 
     private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private String position;

    
   public void datas()throws ClassNotFoundException, SQLException {

            
            Dbconnection dbcon = new Dbconnection();
            Connection conn = dbcon.method();
            String sql = "Insert into ADD1(FILENUMBER,POSITION,USERNAME,PASSWORD) values(?,?,?,?)";
            PreparedStatement prs = conn.prepareStatement(sql);
            
          prs.setString(1,fileNumber);
           prs.setString(2, position); 
          prs.setString(3, userName);
           prs.setString(4, password);
            
            }
    
}
