
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yenes
 */
@ManagedBean(name="sear")
@SessionScoped

public class Search
{
   private String fileNumber;
   private String fullName;
          private String nationality;
             private String typeOfOffness ;
              private String jialterm;
              
             private String gender ;
             
            private String age;

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTypeOfOffness() {
        return typeOfOffness;
    }

    public void setTypeOfOffness(String typeOfOffness) {
        this.typeOfOffness = typeOfOffness;
    }

    public String getJialterm() {
        return jialterm;
    }

    public void setJialterm(String jialterm) {
        this.jialterm = jialterm;
    }

    public String getGender() {
        return gender;
    }
private String date;
        private String id;
        private String address;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
             

    
               private String status;   
               


    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void searchs() throws ClassNotFoundException, SQLException{
try{
       Dbconnection obj1=new Dbconnection();
    Connection connection=obj1.method();
    PreparedStatement stri= connection.prepareStatement("Select *from TABLE2  WHERE FILENUMBER=? && ID=? ");
    stri.setString(1, id);
stri.setString(2,fileNumber );
stri.setString(3, fullName);
stri.setString (4,gender) ;
       stri.setString(5,age);
           stri.setString(6,nationality);
            stri.setString(7,address);
     stri.setString(8, typeOfOffness);
       stri.setString(9, status);
      stri.setString(10,date);
      
   
   
     stri.setString(11,jialterm);
     stri.executeUpdate();
} catch(SQLException ex){
    System.out.println(ex);
}



}


}
