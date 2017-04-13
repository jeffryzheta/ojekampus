import java.util.regex.*;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 
import java.util.Date;
/**
 * Abstract class User - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class User
{
    // instance variables - replace the example below with your own
    protected Date dob;
    protected String email;
    protected int id;
    protected String nama; 
    protected String telepon;
    protected GregorianCalendar newCalendar;
    
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public User(int id, String nama)
    {
        // put your code here
        this.id=id;
        this.nama=nama;
        
    }
    
    public Date getDOB(){
      int year = newCalendar.get(newCalendar.YEAR);
      int month = newCalendar.get(newCalendar.MONTH);
      int dayOfMonth  = newCalendar.get(newCalendar.DAY_OF_MONTH);
      dob =newCalendar.getTime();
      //SimpleDateFormat format = new SimpleDateFormat("yyyy MMM dd");
      //System.out.println("Tampilkan Date manual" );
      //System.out.println("Tanggal lahir pelanggan : "+ year+"/"+month+"/"+dayOfMonth);
//       System.out.println("Tampilkan tanggal dengan SimpleDateFormat yyyy MM dd");
//       System.out.println(format.format(dob));
//       format = new SimpleDateFormat("yyyy--MMM--dd");
//       System.out.println("Tampilkan tanggal dengan SimpleDateFormat yyy--MM--dd");
//       System.out.println(format.format(dob));
      return dob;
    } 
    
    public String getEmail() {
        return email; 
    } 
    
    public int getID(){
         return id; 
    } 
    
    public String getNama(){ 
         return nama; 
    } 
    
    public String getTelepon(){
        return telepon; 
    } 
    public void setDOB(int day, int month, int year){
      newCalendar = new GregorianCalendar(year, month, day);
    
      this.dob=dob;
    } 
    
    public boolean setEmail(String email){
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
    
    public void setID(int id){
        this.id=id;
    } 
    
    public void setNama(String nama){
         this.nama=nama;
    } 
    
    public boolean setTelepon(String telepon){ 
        Pattern pattern = Pattern.compile("0[0-9]{2}([0-9-][0-9]{2,4}){2,3}");
        Matcher matcher = pattern.matcher(telepon);
    this.telepon=telepon;
      if(matcher.matches()){
          return true;
        }
          else {
      return false;
    } 
    } 
}
