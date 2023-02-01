
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
@ManagedBean
@RequestScoped
public class View2 {
      public List <View> arrayList;
    public List <View> record() throws SQLException, ClassNotFoundException{
    arrayList = new ArrayList<>();
    try{
        
           Dbconnection dbcon = new Dbconnection();
            Connection conn = dbcon.method();
             ResultSet rs = conn.createStatement().executeQuery("select * from TABEL2");
                 while (rs.next()) {
             
              String id= rs.getString("ID");
                String fileNumber= rs.getString("FILENUMBER");
               String  fullName = rs.getString("NAME");
                String  gender = rs.getString("GENDER");
               String  age = rs.getString("AGE");
               String  nationality= rs.getString("NATION");
              String address = rs.getString("ADDRESS");
               String  typeOfOffness = rs.getString("OFFNESS");
               String  status = rs.getString("STATUS");
                 String  date = rs.getString("DATES");
                  String  jialterm = rs.getString("JAILTERM");
              
                arrayList.add(new  View( id, fileNumber,fullName,gender,age,nationality, address,typeOfOffness ,status, date ,jialterm));
   
            
                 }
    }
                 catch( SQLException e)
    {
    
    
    }
    
    return arrayList;
    
    } 
    }
