
/**
 * Write a description of class User here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelanggan
{
    // instance variables - replace the example below with your own
   private static int id; 
   private static String nama; 
  // String temp;
   public Pelanggan(int id, String nama){ 
   this.id=id;
   this.nama=nama;
    } 
    public int getID() { 
        return id; 
    }
    public String getNama() { 
        return nama; 
    } 
    public void setID(int id) { 
       this.id=id;
    } 
    public void setNama(String nama){ 
       this.nama=nama;
    } 
    public void printData(){ 
    //temp = integer.toString(id.getID());
    System.out.println("ID pelanggan : "+ getID());
    System.out.println("Nama Pelanggan : "+ getNama());
    }
   
}
