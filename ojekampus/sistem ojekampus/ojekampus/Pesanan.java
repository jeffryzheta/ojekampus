
/**
 * Write a description of class Pesanan here.
 * Class ini berisi fungsi-fungsi yang berkaitan dengan pemesana 
 * @author Jeffry Kurniawan Zheta 
 * @version 3/4/17 
 */
public class Pesanan
{
   //class ini banyak berisi non-static variable yang digunakan bermacam-macam
   private Ojek pelayan=null;
   private Pelanggan pengguna; 
   private String pelanggan_awal;
   private String pelanggan_akhir;
   private double biaya;
   private String layanan;
   private Lokasi lokasi_awal;
   private Lokasi lokasi_akhir;
   private boolean diproses=false;
   private boolean selesai=false; 
   
    /**
  * @param pengguna untuk mendapatkan pengguna yang sedang memakai jasa Ojek 
  * @param layanan untuk melihat tipe layanan saat ini 
  * @param lokasi_akhir untuk menampilkan lokasi akhir 
  * @param  lokasi_awal; untuk melihat lokasi akhir 
  * @param biaya untuk mendapatkan nilai biaya saat ini 
  * yang akan dikeluarkan oleh user. 
  * @return nothing 
  * 
  */
   public Pesanan(Pelanggan pengguna,String layanan,Lokasi lokasi_awal, Lokasi lokasi_akhir, String pelanggan_awal, String pelanggan_akhir, double biaya){
   // instance variables - replace the example below with your own
    this.pengguna=pengguna; 
    this.layanan=layanan;
    this.lokasi_akhir=lokasi_akhir;
    this.lokasi_awal=lokasi_awal;
    this.pelanggan_awal=pelanggan_awal;
    this.biaya=biaya;
    } 
    public Ojek getPelayan(){
        return pelayan;
    }
        
  /**
  * @param tidak digunakan karena tidak diperlukan 
  * @return mereturn nilai pengguna yang sudah didapatkan ketika melakukan getPelanggan pada class pelanggan
  * 
  */
    public Pelanggan getPelanggan(){  
      return pengguna;  
    }
    
      /**
  * @param nothing
  * @return "" jika tidak ada pengguna Awal yang dimasukkan 
  * 
  */
    public String getPenggunaAwal() {
     return pelanggan_awal;   
    } 
      /**
  * @param nothing
  * @return "" jika tidak diterima penggunaAkhir
  * 
  */
    public String getPenggunaAkhir() { 
     return pelanggan_akhir;   
    } 
  
          /**
  * @param nothing
  * @return biaya ini akan didapat dari nilai yang dimasukkan pada ojeKampus
  * 
  */
    public double getBiaya() { 
     return biaya;   
    } 
    
      /**
  * @param nothing
  * @return layanan karena belum ada tipe layanan yang di masukkan 
  * 
  */
    public String getTipeLayanan() { 
     return layanan;   
        
    } 
    
       /**
  * @param nothing
  * @return didapat dari class Lokasi dengan getLokasiAwal dan lokasi tersebut di save di dalam lokasi_awal
  * 
  */
    public Lokasi getLokasiAwal() {
    return lokasi_awal;    
        
    }
     /**
  * @param nothing
  * @return didapat dari class Lokasi dengan getLokasiAkhir dan lokasi tersebut di save di dalam lokasi_akhir
  * 
  */
    public Lokasi getLokasiAkhir() { 
    return lokasi_akhir;    
    } 
    
    /**
  * @param nothing
  * @return bernilai false atau true karen boolean, ini untuk melihat status dari pesanan, apakah sudah di ambil atau belum
  * 
  */
 public boolean getDiproses() {
    return diproses;
    } 
    
    /**
  * @param nothing
  * @return bernilai false atau true karen boolean, ini untuk melihat status dari pesanan, apakah sudah di ambil atau belum
  * 
  */
 public boolean getSelesai() {
    return selesai;
    } 
    
   public void setPelayan(Ojek pelayan){
       this.pelayan=pelayan; 
       
    } 
    
    public void setPelanggan(Pelanggan pengguna) {
        
        this.pengguna=pengguna;
        
    } 
    
        public void setPenggunaAwal(String pelanggan_awal) {
        
        this.pelanggan_awal =pelanggan_awal;
    } 
        public void setPenggunaAkhir(String pelanggan_akhir) {
        
        this.pelanggan_akhir =pelanggan_akhir;
    } 
        public void setBiaya(double biaya) {
        
        this.biaya = biaya;
    } 
     public void setTipeLayanan(TipeLayanan layanan){
        
      //this.layanan = layanan;
    } 
        public void setLokasiAwal(Lokasi lokasi_awal) {
        this.lokasi_awal=lokasi_awal;
        
    } 
    public void setLokasiAkhir(Lokasi lokasi_akhir) {
        this.lokasi_akhir=lokasi_akhir;
        
    }
    public void setStatusDiproses(Boolean diproses) {
       
        this.diproses=diproses;
        
    } 
    public void setStatusSelesai(Boolean selesai) {
        
        this.selesai=selesai;
    }    

     /**
  * @param nothing
  * @return null untuk menjaga agar getOjek tidak terus-menerus bertambah dari class Ojek
  * 
  */
    public Ojek getOjek() { 
    return pelayan; 
    } 

  

    

      /**
  * @param nothing
  * @return nothing
  * 
  */
    public void printData() { 
        System.out.println("Lokasi Pelanggan awal : "+ lokasi_awal.getNama());
        System.out.println("Lokasi Pelanggan akhir : "+ lokasi_akhir.getNama());
        System.out.println("Tipe Layanan : "+ getTipeLayanan());
    } 
    
   
   
   
    
}
