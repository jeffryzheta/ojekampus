
/**
 * Write a description of class OjeKampus here.
 * Class ini untuk mengisi databaseUser dari class lain   
 * @author Jeffry Kurniawan Zheta
 * @version 3/4/2017
 */
import java.util.ArrayList; 
import java.util.Objects;
public class DatabaseUser
{
    private static ArrayList<Pelanggan> pelanggan_database = new ArrayList<>();
    private static ArrayList<Ojek> ojek_database = new ArrayList<>();
    private static int id_ojek_terakhir=1; 
    private static int id_pelanggan_terakhir=1; 
   /**
    * @param baru yang diambil dari class Pelanggan untuk ditambahkan 
    * @return nothing
    */
    public DatabaseUser(Pelanggan baru) {
    
    } 
    /**
    * @param baru direfer dari class Pelanggan
    * @return true berarti akan membuat siap di tambahkan kapan saja
    */
    public static boolean addPelanggan(Pelanggan baru) {
       /* pelanggan_database = baru; 
         System.out.println("Penambahan Pelanggan kedalam database berhasil dilakukan");
        */
        for (Pelanggan list : pelanggan_database) {
            if(baru.getID()==list.getID() && list instanceof Pelanggan) {
               System.out.println("\n-----------Gagal memasukkan ke database--------------\n");
               return false;

            }
        }
        
        pelanggan_database.add(baru);
        id_pelanggan_terakhir=baru.getID();
        System.out.println("\n-----------Berhasil memasukkan ke database--------------\n");
        return true;
       
    } 
    
    /**
    * @param id direfer dari class Pelanggan
    * @return true berarti akan membuat siap di dihapus kapan saja
    */
    public static boolean removePelanggan(int id) {
        for (Pelanggan list : pelanggan_database) {
            if(id == list.getID() && list instanceof Pelanggan) {
                pelanggan_database.remove(list);
                return true;
            }
        }
        return false; 
    } 
    /**
    * @param baru direfer dari class Ojek
    * @return true berarti akan membuat siap di tambahkan kapan saja
    */
    public static boolean addOjek(Ojek baru) {
     //   ojek_database = baru; 
     for (Ojek list : ojek_database) {
            if(baru.getID()==list.getID() && list instanceof Ojek) {
                System.out.println("Ojek baru gagal ditambahkan ke dalam database");
                return false;
            }
        }
        ojek_database.add(baru);
        id_ojek_terakhir=baru.getID();
        System.out.println("Ojek baru berhasil ditambahkan ke dalam database");
        return true; 
    } 
     /**
    * @param id direfer dari class Ojek
    * @return true berarti akan membuat siap di dihapus kapan saja
    */
    public static boolean removeOjek(int id) {
        for (Ojek list : ojek_database) {
            if(id == list.getID() && list instanceof Ojek) {
                ojek_database.remove(list);
                return true;
            }
        }
        return false;
    } 
    /**
    * @param nothing
    * @return id yang terisi pada ojek yang terakhir
    */
    public static int getIDOjekTerakhir(){
        return id_ojek_terakhir; 
    } 
    /**
    * @param nothing
    * @return id yang terisi pada pelanggan yang terakhir
    */
    public static int getIDPelangganTerakhir(){
        return id_pelanggan_terakhir;

    }
    
    public static ArrayList<Ojek>  getOjekDatabase() {
        
        return ojek_database;
    }
     public static ArrayList<Pelanggan> getPelangganDatabase() {
        
        return pelanggan_database;
    }
    /**
    * @param nothing
    * @return data dalam database 
    */
    public static Ojek getUserOjek(int id) 
    { 
         for (Ojek list : ojek_database) {
            if(id == list.getID() && list instanceof Ojek) {
                return list;
            }
        }
        return null;
        //return ojek_database;
    }
     /**
    * @param nothing
    * @return data dalam database 
    */
    public static Pelanggan getUserPelanggan(int id){ 
         for (Pelanggan list : pelanggan_database) {
            if(id == list.getID() && list instanceof Pelanggan) {
                return list;
            }
        }
        return null;
        //return pelanggan_database;
    } 
        
}
   