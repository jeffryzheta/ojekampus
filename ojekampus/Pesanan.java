
/**
 * Write a description of class Pesanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pesanan
{
    // instance variables - replace the example below with your own
   private Ojek pelayan=null;
   private Pelanggan pengguna; 
   private String pelanggan_awal;
   private String pelanggan_akhir;
   private double biaya;
   private String layanan;
   private Lokasi lokasi_awal;
   private Lokasi lokasi_akhir;
   private boolean diproses=false;
   private boolean diabatalkan=false; 
   
   public Pesanan(Pelanggan pengguna,String layanan,Lokasi lokasi_awal,
   Lokasi lokasi_akhir, String pelanggan_awal, String pelanggan_akhir, double biaya){
    this.pengguna=pengguna; 
    this.layanan=layanan;
    this.lokasi_akhir=lokasi_akhir;
    this.lokasi_awal=lokasi_awal;
    this.pelanggan_awal=pelanggan_awal;
    this.biaya=biaya;
    } 
   public boolean getStatusPesanan() {
    return false;
    } 
    public Pelanggan getPelanggan() { 
      return pengguna;  
    }
    public Ojek getOjek() { 
    return null; 
    } 

    public Lokasi getLokasiAwal() {
    return lokasi_awal;    
        
    }
    public Lokasi getLokasiAkhir() { 
    return lokasi_akhir;    
    } 
    public String getTipeLayanan() { 
     return "";   
        
    } 
    public String getPenggunaAwal() {
     return "";   
    } 
    public String getPenggunaAkhir() { 
     return "";   
    } 
    public double getBiaya() { 
     return biaya;   
    } 
    public void printData() { 
        System.out.println("Lokasi Pelanggan awal : "+ getLokasiAwal());
        System.out.println("Lokasi Pelanggan akhir : "+ getLokasiAkhir());
        System.out.println("Tipe Layanan : "+ getTipeLayanan());
    } 
    
   
   
   
    
}
