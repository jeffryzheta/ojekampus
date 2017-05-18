
/**
 * Write a description of class Initiation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class Initiation
{
    // instance variables - replace the example below with your own
    private static boolean x=true;
    public static ArrayList<Ojek> dbojek = new ArrayList<Ojek>();
    public static ArrayList<Pelanggan> dbpelanggan = new ArrayList<>();

    /**
     * Constructor for objects of class Initiation
     */
    public Initiation()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void mainInit()
    {
        
        
        if(x)
        {
            
            
            dbojek = Cloud.getOjekDatabase();
            dbpelanggan = Cloud.getPelangganDatabase();
           
            for(Ojek treshold : dbojek){
                DatabaseUser.add_init(treshold);
            }
            for(Pelanggan treshold : dbpelanggan){
                DatabaseUser.add_init(treshold);
            }
            x=false;
            System.out.println("========================Initiation completed==============================");
        }
        else System.out.println("=====================Inisiasi telah dilakukan sebelumnya===================================");
        
        Administrasi.printAllDatabase();
    }
    
     public static ArrayList<Ojek> getInitOjek()
    {
        
       return dbojek;
    }
    
     public static ArrayList<Pelanggan> getInitPelanggan()
    {
        
       return dbpelanggan;
    }
}
