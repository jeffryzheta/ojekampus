
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
    public DatabaseUser() {
    
    } 
    
    public static boolean addPelanggan(Pelanggan baru) {
        return false;
    } 
    public static boolean removePelanggan(int id) {
        return false; 
    } 
    public static boolean addOjek(Ojek baru) {
        return false; 
    } 
    public static boolean removeOjek(int id) {
        return false;
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
   