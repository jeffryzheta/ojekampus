
/**
 * Write a description of class OjeKampus here.
 * Class ini untuk mengisi databaseUser dari class lain   
 * @author Jeffry Kurniawan Zheta
 * @version 3/4/2017
 */
import java.util.regex.*;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.Date;
public class Pelanggan
{ 
   private int id; 
   private String nama, telefon, email;
   private Date dob;
   private GregorianCalendar newCalendar;
  /**
    * @param id digunakan untuk mengassign id dari pelanggan 
    * @param nama berisi nama pelanggan 
    * @return nothing 
    */
   public Pelanggan(int id, String nama, String telefon){ 
    // instance variables - replace the example below with your own
   this.id=id;
   this.nama=nama;
   setTelepon(telefon);
    } 
    /**
    * @param nothing 
    * @return id yang sudah dimasukkan dari class lain 
    */
    public int getID() { 
        return id; 
    }
     /**
    * @param nothing 
    * @return nama yang sudah dimasukkan dari class lain atau class ini 
    */
    public String getNama() { 
        return nama; 
    } 
     public String getEmail() { 
        return email; 
    } 
    /**
    * @param id yang sudah di set 
    * @return nothing  
    */
    public boolean setTelepon(String telefon) { 
    Pattern pattern = Pattern.compile("0[0-9]{2}([0-9-][0-9]{2,4}){2,3}");
    Matcher matcher = pattern.matcher(telefon);
    this.telefon=telefon;
      if(matcher.matches()){
          return true;
        }
          else {
      return false;
    } 
}
      /**
    * @param id yang sudah di set 
    * @return nothing  
    */
    public boolean setEmail(String email) { 
      Pattern pattern = Pattern.compile("[a-zA-Z]+[a-z]+[@]+[a-z]+.[a-z]+");
      Matcher matcher = pattern.matcher(email);
      this.email=email;
      if(matcher.matches()){
          return true;
        }
          else {
      return false;
    }
    } 
   public void setDOB(int day, int month, int year){ 
        newCalendar = new GregorianCalendar(year, month, day);
    
      this.dob=dob;
    }
    /**
    * @param id yang sudah di set 
    * @return nothing  
    */
    public void setID(int id) { 
       this.id=id;
    } 
     /**
    * @param nama yang telah dimasukkan 
    * @return nothing
    */
    public void setNama(String nama){ 
       this.nama=nama;
    } 
   public String getTelepon() { 
        return telefon; 
    } 
     /**
    * @param nothing 
    * @return nothing
    */
  public void printData(){ 
    //temp = integer.toString(id.getID());
    System.out.println("ID pelanggan : "+ getID());
    System.out.println("Nama Pelanggan : "+ getNama());
}
     public Date getDOB(){
      int year = newCalendar.get(newCalendar.YEAR);
      int month = newCalendar.get(newCalendar.MONTH);
      int dayOfMonth  = newCalendar.get(newCalendar.DAY_OF_MONTH);
      dob =newCalendar.getTime();
      SimpleDateFormat format = new SimpleDateFormat("yyyy MMM dd");
      //System.out.println("Tampilkan Date manual" );
      System.out.println("Tanggal lahir pelanggan : "+ year+"/"+month+"/"+dayOfMonth);
      /*System.out.println("Tampilkan tanggal dengan SimpleDateFormat yyyy MM dd");
      System.out.println(format.format(dob));
      format = new SimpleDateFormat("yyyy--MMM--dd");
      System.out.println("Tampilkan tanggal dengan SimpleDateFormat yyy--MM--dd");
      System.out.println(format.format(dob));*/
      return dob; }
      
      public String toString()
      { 
      if(DatabasePesanan.getPesanan(this) != null)
        {
            return "(Nama: " + nama + ", ID: " + id + ", Telefon: " + telefon + ", Pengguna awal: " + DatabasePesanan.getPesanan(this).getPenggunaAwal() + ")";
        }
        else 
        {
            return "(Nama: " + nama + ", ID: " + id + ", Telefon: " + telefon  + ")";
        }  
    
    }
   
}
