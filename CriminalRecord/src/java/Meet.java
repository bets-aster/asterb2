//

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.enterprise.context.Dependent;
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
@Dependent
@ManagedBean
@RequestScoped
 public class Meet{
private String date;
        private String address;
        private String id;
             private String gender ;
             
            private String age;
             private String nationality;
             private String typeOfOffness ;
              private String jialterm;

    private String fileNumber;
               private String status; 
                      private String  fullName ;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
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

    public String getFileNumber() {
        return fileNumber;
    }

    public void setFileNumber(String fileNumber) {
        this.fileNumber = fileNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
     public void edits(String id) throws ClassNotFoundException, SQLException {
       
        
            
            Dbconnection dbcon = new Dbconnection();
            Connection conn = dbcon.method();
         
            String sql = " update TABLE2 set ID=?,FILENUMBER=?,NAME=?,GENDER=?,AGE=?,NATION=?,ADDRESS=? ,OFFNESS=?,STATUS=?,DATES=?,JAILTERM=? where ID=?"; 
            PreparedStatement prrs = conn.prepareStatement(sql);
       prrs.setString(1, id);
            prrs.setString(2,fileNumber );
            prrs.setString(3, fullName);
             prrs.setString(4, gender);
            prrs.setString(5, age);
            prrs.setString(6, nationality);
             prrs.setString(7, address);
             
            prrs.setString(8,typeOfOffness);
            prrs.setString(9,status);
            prrs.setString(10,date);
            prrs.setString(11,jialterm);
           


            prrs.executeUpdate();
            try{
           
        } catch (Exception e) {
        }
}
}