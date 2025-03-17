/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proje_socialmedia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kevser
 */
public class Social_MediaDB {

    private static final String connectionString = "jdbc:mysql://127.0.0.1:3306/socialmedia_db?user=root&password=FSMBLM";
    private static Connection conn;

    public static Person Login(String name_surname, String password) {
        Person person = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM  socialmedia_db.tbl_person WHERE name_surname='" + name_surname + "' AND password='" + password + "" + "';";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                person = new Person();
                person.id = rs.getInt("id");
                person.name_surname = rs.getString("name_surname");
                person.email = rs.getString("email");
                person.password = rs.getString("password");
            }
            conn.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return person;
    }

    public static boolean AddPerson(Person person) {
        try {

            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT  INTO   socialmedia_db.tbl_person" + "(name_surname,email,password,gender)"
                    + "VALUES('" + person.name_surname + "','" + person.email + "','" + person.password + "','"+person.gender+"');";

            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static ArrayList<ilgialani> GetIlgialanları() {
        ArrayList<ilgialani> ilgialanları = null;
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM socialmedia_db.tbl_ilgialanları;";
            ResultSet rs = stmt.executeQuery(query);
            ilgialanları = new ArrayList<>();
            while (rs.next()) {
                ilgialani ilgialanı = new ilgialani();

                ilgialanı.id = rs.getInt("id");
                ilgialanı.name = rs.getString("name");
                ilgialanları.add(ilgialanı);
            }
            conn.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return ilgialanları;
    }

    public static boolean AddIlgialanlarıToPersonById(int id_user, int id_ilgialan) {
        try {

            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT  INTO  socialmedia_db.tbl_ilgialanı_person" + "(id_person,id_ilgialanı)"
                    + "VALUES(" + id_user + "," + id_ilgialan + ");";

            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
     public static ArrayList<Person> SerchByNameOrEmail (String search){
        ArrayList<Person> plist = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM socialmedia_db.tbl_person WHERE name_surname LIKE '%" + search + "%'OR email LIKE'%"+search+"%'";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
              Person np1 = new Person();
        np1.id = rs.getInt("id");
        np1.name_surname = rs.getString("name_surname");
        np1.email = rs.getString("email");
        np1.password= rs.getString("password");
      
                plist.add(np1);
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Frm_Follower.class.getName()).log(Level.SEVERE,null,ex);
        }
      
  
    
    
    
    return plist;
 
}
         public static boolean DeleteId(int id){
        try {
            conn =DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query ="DELETE FROM socialmedia_db.tbl_person WHERE id ="+id;
            
            stmt.executeUpdate(query);
            conn.close();
            return true ;
        } catch (SQLException ex) {
            Logger.getLogger(Frm_Follower.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
    }
     public static boolean UpdatePerson(Person person){
               try {
            conn =DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query ="UPDATE tbl_person SET"
            +"name_surname='"+ person.name_surname
                    +"',email='" + person.email
                    +"',password='" + person.password
                    +"',gender='" + person.gender
                    +"'WHERE id=" + person.id;
            stmt.executeUpdate(query);
            conn.close();
            return true ;
        } catch (SQLException ex) {
            Logger.getLogger(Frm_Follower.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }
     }  
          public static boolean AddFollowerToPersonById(int id_user, int id_person_froms ) {
        try {

            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "INSERT  INTO  socialmedia_db.tbl_follow" + "(id_person_to,id_person_from)"
                    + "VALUES(" + id_user + "," + id_person_froms + ");";

            stmt.executeUpdate(query);
            conn.close();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
             public static ArrayList<ilgialani> GetIlgialanlarıSelectedByIDJoin(int id) {
        ArrayList<ilgialani> ilgialanları = new ArrayList<>();
        try {
            conn = DriverManager.getConnection(connectionString);
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM socialmedia_db.tbl_ilgialanı_person AS cp"
                    +"INNER JOIN socialmedia_db.tbl_ilgialanları AS c"
                    +"ON cp.id_ilgialani=c.id WHERE cp.id_person="+id+";";
            ResultSet rs = stmt.executeQuery(query);
           
            while (rs.next()) {
                ilgialani ilgialanı = new ilgialani();

                ilgialanı.id = rs.getInt("id");
                ilgialanı.name = rs.getString("name");
                ilgialanları.add(ilgialanı);
            }
            conn.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return ilgialanları;
    }
}
