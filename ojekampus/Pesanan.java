
/**
 * Write a description of class Pesanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
   private Ojek pelayan;
   private Pelanggan pengguna; 
   private String pelanggan_awal;
   private String pelanggan_akhir;
   private double biaya;
   private TipeLayanan layanan;
   private Lokasi lokasi_awal;
   private Lokasi lokasi_akhir;
   private boolean diproses;
   private boolean diabatalkan; 
   
   public Pesanan(){} 
   public boolean getStatusPesanan() {
    return false;
    } 
   public void pesananDiambil(Ojek pelayan) {
    
    }
   public Pelanggan getPelanggan() {
   return "";    
       
    }
   public Ojek getOjek() {
   return "";    
       
       
    } 
    public void pesananDibatalkan() { 
        
        
    } 
    public Lokasi getLokasiAwal() {
    return "";    
        
    }
    public Lokasi getLokasiAkhir() { 
    return "";    
    } 
    public tipeLayanan getTipeLayanan() { 
     return "";   
        
    } 
    public String getPenggunaAwal() {
     return "";   
    } 
    public String getPenggunaAkhir() { 
     return "";   
    } 
    public double getBiaya() { 
     return 0;   
    } 
    public String toString() { 
     return "";   
    } 
    
   
   
   
    
}
