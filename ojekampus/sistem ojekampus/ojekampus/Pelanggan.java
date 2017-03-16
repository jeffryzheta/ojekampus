
/**
 * Write a description of class OjeKampus here.
 * Class ini untuk mengisi databaseUser dari class lain   
 * @author Jeffry Kurniawan Zheta
 * @version 3/4/2017
 */
public class Pelanggan
{ 
   private static int id; 
   private static String nama; 
  /**
    * @param id digunakan untuk mengassign id dari pelanggan 
    * @param nama berisi nama pelanggan 
    * @return nothing 
    */
   public Pelanggan(int id, String nama){ 
    // instance variables - replace the example below with your own
   this.id=id;
   this.nama=nama;
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
     /**
    * @param nothing 
    * @return nothing
    */
    public void printData(){ 
    //temp = integer.toString(id.getID());
    System.out.println("ID pelanggan : "+ getID());
    System.out.println("Nama Pelanggan : "+ getNama());
    }
   
}
