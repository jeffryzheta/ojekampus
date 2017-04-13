
/**
 * Write a description of class Administrasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.lang.Math;
import java.util.ArrayList;
public class Administrasi
{
    // instance variables - replace the example below with your own
 
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
       
    }
    private static Pesanan cariPesananIdle(){
      for (Pesanan list : DatabasePesanan.getDatabase()) {
            if (list.getStatusDiproses()==false && list.getStatusSelesai()==false)
            {
                return list;
            }
        }          
     return null;
       
    } 
    public static void jalankanSistemPenugas(){
        Pesanan pesan = cariPesananIdle();
        Ojek pelayan = temukanOjekTerdekat(pesan);
        pesananDitugaskan(pesan, pelayan);
    } 

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void pesananDitugaskan(Pesanan pesan, Ojek pelayan)
    {
        // put your code here
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(true);
       pesan.setPelayan(pelayan);
       ojekAmbilPesanan(pesan, pelayan);
       
    }
    public static void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan) {
       pelayan.setStatus(StatusOjek.Jemput);
       pelayan.setPesanan(pesan);
//        pesan.setPelayan(pelayan);
    }
    public static void ojekLepasPesanan(Ojek pelayan){
        
        pelayan.setStatus(StatusOjek.Idle);
        pelayan.setPesanan(null);
       
    } 
    
    public static void pesananDibatalkan(Pesanan pesan){ 
       
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.getPelayan().setPesanan(null);
        ojekLepasPesanan(pesan.getPelayan()); 
    } 
    public static void pesananDibatalkan(Pelanggan pengguna) { 
      for (Pesanan list : DatabasePesanan.getDatabase()) {
            if(pengguna.getID() == list.getPelanggan().getID()) {
                list.setStatusSelesai(false);
                list.setStatusDiproses(false);
                list.getPelayan().setPesanan(null);
                ojekLepasPesanan(list.getPelayan());
            }
        }  
        
    } 
     public static void pesananDibatalkan (Ojek pelayan)
    {
        pelayan.getPesanan().setStatusSelesai(false); 
        pelayan.getPesanan().setStatusDiproses(false); 
        pelayan.setPesanan(null); 
        ojekLepasPesanan(pelayan); 
    }
    
    public static void pesananSelesai(Pelanggan pengguna) { 
       for (Pesanan list : DatabasePesanan.getDatabase()) {
            if(pengguna.getID() == list.getPelanggan().getID()) {
                list.setStatusSelesai(true);
                list.setStatusDiproses(false);
                list.getPelayan().setPesanan(null);
                ojekLepasPesanan(list.getPelayan());
            }
        }
    }
    
    public static void pesananSelesai(Pesanan pesan) { 
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setPelayan(null);
        
    } 
    
     public static void pesananSelesai (Ojek pelayan)
    {
        pelayan.getPesanan().setStatusSelesai(true); 
        pelayan.getPesanan().setStatusDiproses(false); 
        pelayan.setPesanan(null); 
        ojekLepasPesanan(pelayan);
    }
    
    
    public static void printAllDatabase() {
      System.out.println("Database Pesanan: " + DatabasePesanan.getDatabase());
      System.out.println("\nDatabase Ojek: " + DatabaseUser.getOjekDatabase());
      System.out.println("\nDatabase Pelanggan: " + DatabaseUser.getPelangganDatabase());
    } 
    
    public static void printOjekDatabase() {
       System.out.println("Database Ojek: " + DatabaseUser.getOjekDatabase());  
    } 
    
    public static void printPelangganDatabase() {
      System.out.println("Database Pelanggan: " + DatabaseUser.getPelangganDatabase());  
    } 
    
    public static void printPesananDatabase() 
    {
       System.out.println("Database Pesanan: " + DatabasePesanan.getDatabase()); 
    } 
    
    private static Ojek temukanOjekTerdekat(Pesanan pesan){
        double xOjek;
        double yOjek;
        double xPesan;
        double yPesan;
        double min=0;
        double now;
        int i = 0;
        int index = 0;
        int jarak = 0;
        ArrayList<Ojek> ojek_database = DatabaseUser.getOjekDatabase();
        
        for (Ojek list : ojek_database) {
            
            if (list.getStatus() == StatusOjek.Idle)
            {
                xOjek = list.getPosisi().getX();
                yOjek = list.getPosisi().getY();
                xPesan = pesan.getLokasiAwal().getX();
                yPesan = pesan.getLokasiAwal().getY();
                
                if(i==0) {
                    min = Math.sqrt(Math.pow(xOjek-xPesan, 2) + Math.pow(yOjek-yPesan, 2));
                    index = jarak;
                }
                
                now = Math.sqrt(Math.pow(xOjek-xPesan, 2) + Math.pow(yOjek-yPesan, 2));
                
                if(now < min) {
                    min = now;
                    index = jarak;
                }
                
                i++;
            }
            jarak++;            
        }
        
        return ojek_database.get(index);
    }
    
}
