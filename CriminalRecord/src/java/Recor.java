
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
@ManagedBean(name="recor")
@RequestScoped

public class Recor {
    
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
    /**
     *
     * @throws ClassNotFoundException
     * @throws SQLException
     */
 
       
          public void data()throws ClassNotFoundException, SQLException {

            
            Dbconnection dbcon = new Dbconnection();
            Connection conn = dbcon.method();
            String sql = "Insert into TABLE2(ID,FILENUMBER,NAME,GENDER,AGE,NATION, ADDRESS,OFFNESS,STATUS,DATES,JAILTERM) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement prs = conn.prepareStatement(sql);
            try{
            prs.setString(1, id);
            prs.setString(2,fileNumber );
            prs.setString(3, fullName);
             prs.setString(4, gender);
            prs.setString(5, age);
            prs.setString(6, nationality);
             prs.setString(7, address);
             
            prs.setString(8,typeOfOffness);
            prs.setString(9,status);
            prs.setString(10,date);
            prs.setString(11,jialterm);
           

            prs.executeUpdate();
            
           
        } catch (SQLException e) {
        }
    }

 
 
    }
    

        
