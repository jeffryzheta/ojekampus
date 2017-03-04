
/**
 * Write a description of class OjeKampus here.
 * Class ini untuk mengisi databaseUser dari class lain   
 * @author Jeffry Kurniawan Zheta
 * @version 3/4/2017
 */
public class DatabaseUser
{
    private static Pelanggan pelanggan_database;
    private static Ojek ojek_database; 
    private static int id_ojek_terakhir=1; 
    private static int id_pelanggan_terakhir=1; 
   /**
    * @param baru yang diambil dari class Pelanggan untuk ditambahkan 
    * @return tidak ada 
    */
    public DatabaseUser(/*Pelanggan baru*/) {
    
    } 
    /**
    * @param baru direfer dari class Pelanggan
    * @return true berarti akan membuat siap di tambahkan kapan saja
    */
    public static boolean addPelanggan(Pelanggan baru) {
        pelanggan_database = baru; 
         System.out.println("Penambahan Pelanggan kedalam database berhasil dilakukan");
        return true;
    } 
    
    /**
    * @param id direfer dari class Pelanggan
    * @return true berarti akan membuat siap di dihapus kapan saja
    */
    public static boolean removePelanggan(int id) {
        pelanggan_database=null;
        return true; 
    } 
    /**
    * @param baru direfer dari class Ojek
    * @return true berarti akan membuat siap di tambahkan kapan saja
    */
    public static boolean addOjek(Ojek baru) {
        ojek_database = baru; 
        System.out.println("Penambahan Ojek kedalam database berhasil dilakukan");
        return true; 
    } 
     /**
    * @param id direfer dari class Ojek
    * @return true berarti akan membuat siap di dihapus kapan saja
    */
    public static boolean removeOjek(int id) {
        ojek_database=null;
        return true;
    } 
    /**
    * @param tidak ada
    * @return id yang terisi pada ojek yang terakhir
    */
    public static int getIDOjekTerakhir(){
        return id_ojek_terakhir; 
    } 
    /**
    * @param tidak ada
    * @return id yang terisi pada pelanggan yang terakhir
    */
    public static int getIDPelangganTerakhir(){
        return id_pelanggan_terakhir;

    }
    /**
    * @param tidak ada
    * @return data dalam database 
    */
    public static Ojek getUserOjek() 
    { return ojek_database;
    }
     /**
    * @param tidak ada
    * @return data dalam database 
    */
    public static Pelanggan getUserPelanggan(){ 
        
        return pelanggan_database;
    } 
        
}
   