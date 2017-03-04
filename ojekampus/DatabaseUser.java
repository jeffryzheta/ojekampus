
/**
 * Write a description of class DatabaseUser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DatabaseUser
{
    private static Pelanggan pelanggan_database;
    private static Ojek ojek_database; 
    private static int id_ojek_terakhir=1; 
    private static int id_pelanggan_terakhir=1; 
    public DatabaseUser(/*Pelanggan baru*/) {
    
    } 
    
    public static boolean addPelanggan(Pelanggan baru) {
        pelanggan_database = baru; 
         System.out.println("Penambahan Pelanggan kedalam database berhasil dilakukan");
        return true;
    } 
    public static boolean removePelanggan(int id) {
        pelanggan_database=null;
        return true; 
    } 
    public static boolean addOjek(Ojek baru) {
        ojek_database = baru; 
        System.out.println("Penambahan Ojek kedalam database berhasil dilakukan");
        return true; 
    } 
    public static boolean removeOjek(int id) {
        ojek_database=null;
        return true;
    } 
    public static int getIDOjekTerakhir(){
        return id_ojek_terakhir; 
    } 
    public static int getIDPelangganTerakhir(){
        return id_pelanggan_terakhir;

    }
    public static Ojek getUserOjek() 
    { return ojek_database;
    }
    public static Pelanggan getUserPelanggan(){ 
        
        return pelanggan_database;
    } 
        
}
   