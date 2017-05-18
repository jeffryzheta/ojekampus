
/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar; 
public class Cloud
{
    // instance variables - replace the example below with your own
    private int x;
    private static final String url = "jdbc:postgresql://localhost/testdb";
//     private static final String user = "postgres";
//     private static final String password = "admin";
    private static String query;
    private static Connection root;
    private static Statement st;
    private static ResultSet rs;
    private static int dob1, dob2, dob3, dob4, dob5, dob6;

    /**
     * Constructor for objects of class Cloud
     */
    public Cloud()
    {
        
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, "postgres", "asus");
             st = conn.createStatement();
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;
    }
    
    public static ArrayList<Ojek> getOjekDatabase()
    {
        ArrayList<Ojek> db = new ArrayList<Ojek>();
        root = connect();
        query = "select * from ojek";
            try{
            rs = st.executeQuery(query);
        
    
         while (rs.next())
      {
        int id = rs.getInt("id");
        String nama = rs.getString("nama");
        String email = rs.getString("email");
        String telefon = rs.getString("telefon");
        String no_plat = rs.getString("no_plat");
        Date dob =rs.getDate("dob");
       // String password = rs.getString("password");
        
        Ojek treshold = new Ojek(id, nama);
        treshold.setEmail(email);
        treshold.setTelefon(telefon);
        treshold.setDOB(dob4, dob5, dob6);
        //treshold.privilege(password);
        treshold.setNoPlat(no_plat);
        db.add(treshold);
        // print the results
        System.out.format("%s, %s, %s, %s, %s, %s\n", id, nama,email,telefon,no_plat, dob);
      }
      st.close();
      }
      
    catch (Exception e)
    {
      System.err.println("Got an exception in getOjek! ");
      System.err.println(e.getMessage());
    }  
        return db;
    }
    
    public static ArrayList<Pelanggan> getPelangganDatabase()
    {
        ArrayList<Pelanggan> db = new ArrayList<>();
        root = connect();
        query = "select * from pelanggan";
            try{
            rs = st.executeQuery(query);
        
    
         while (rs.next())
      {
        int id = rs.getInt("id");
        String nama = rs.getString("nama");
        String email = rs.getString("email");
        String telefon = rs.getString("telefon");
        Date dob =rs.getDate("dob");
       // String password = rs.getString("password");
        
        Pelanggan treshold = new Pelanggan(id, nama, telefon, email, dob);
        treshold.setEmail(email);
        treshold.setTelefon(telefon);
        treshold.setDOB(dob1, dob2, dob3);
        //treshold.privilege(password);
        
        db.add(treshold);
        // print the results
        System.out.format("%s, %s, %s, %s, %s\n", id, nama,email,telefon,dob);
      }
      st.close();
      }
    catch (Exception e)
    {
      System.err.println("Got an exception in getPelanggan! ");
      System.err.println(e.getMessage());
    }  
        return db;
    }
    
    public static int getLastOjek()
    {
        int id=0;
        query = "select max(id) as id from ojek";
        root = connect();
         try{
            rs = st.executeQuery(query);
        
    
         while (rs.next())
      {
          id = rs.getInt("id");
          System.out.println(id);
        }
      st.close();
      }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    } 
        return id;
    }
    
    public static int getLastPelanggan()
    {
        int id=0;
        query = "select max(id) as id from pelanggan";
        root = connect();
         try{
            rs = st.executeQuery(query);
        
    
         while (rs.next())
      {
          id = rs.getInt("id");
          System.out.println(id);
        }
      st.close();
      }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    } 
        return id;
    }
    
    public static boolean addPelanggan(Pelanggan input)
    {
        int id = input.getID();
        String nama = input.getNama();
        String email = input.getEmail();
        String telefon = input.getTelefon();
        Date dob = input.getDOB();
//         int dob4 =input.day();
//         int dob5 =input.month();
//         int dob6 =input.year();
       
        
        //String password = input.getPrivilege();
        query = "insert into pelanggan values("+id+",'"+nama+"','"+telefon+"','"+email+"','"+dob+"')";
        System.out.println(query +" ditambahkan");
        
        root = connect();
         try{
          st.executeUpdate(query);
          st.close();
          return true;
          }
        catch (Exception e)
        {
          System.err.println("Got an exception in pelanggan! ");
          System.err.println(e.getMessage());
          return false;
        }
        
    }
    
    
    public static boolean addOjek(Ojek input)
    {
        int id = input.getID();
        String nama = input.getNama();
        String email = input.getEmail();
        String telefon = input.getTelefon();
        String no_plat = Ojek.getNoPlat();
//         int dob1 =input.day();
//         int dob2 =input.month();
//         int dob3 =input.year();
        Date dob = input.getDOB();
       // String password = input.getPrivilege();
        query = "insert into ojek values("+id+",'"+nama+"','"+telefon+"','"+email+"','"+no_plat+"','"+dob+"')";
        System.out.println(query +" ditambahkan");
        
        root = connect();
         try{
           st.executeUpdate(query);
        
    
         
          st.close();
          }
        catch (Exception e)
        {
          System.err.println("Got an exception in ojek! ");
          System.err.println(e.getMessage());
          return false;
        }
        return true;
    }
}



