
/**
 * Write a description of class DatabaseUser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DatabaseUser
{
    private static String[] pelanggan_database;
    private static String[] ojek_database; 
    private static int id_ojek_terakhir; 
    private static int id_pelanggan_terakhir; 
    public static boolean addPelanggan(Pelanggan baru) {
        
    } 
    public static boolean removePelanggan(Pelanggan baru) {
        return false; 
    } 
    public static boolean addOjek(Ojek baru) {
        return false; 
    } 
    public static int removeOjek(int id) {
        return 0;
    } 
    public static int getIDOjekTerakhir(){
        return 0; 
    } 
    public static int getIDPelangganTerakhir(){
        return 0;
    }
    public static Ojek getUserOjek(int id) { 
        return 0; 
    } 
    public static String[] getOjekDatabase() {
        return ""; 
    }
    public static Pelanggan getUserPelanggan(int id){ 
        return ""; 
    } 
    public static String[] getPelangganDatabase() { 
        return ""; 
    } 
}
