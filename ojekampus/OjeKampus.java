/**
 * @author Jeffry Kurniawan Zheta
 * @version 4 Maret 2017
 * Class OjeKampus adalah class yang mempunyai Main Method
 */
public class OjeKampus
{
    // instance variables - replace the example below with your own
    //public static Ojek ojek_rifqy;
    //public static DatabaseUser ojek_database;
    //public static Lokasi ojek_lokasi;
    //public static Pelanggan p_mikoriza;
    //public static DatabasePesanan p_database;
    //public static Lokasi per_mikoriza_awal;
    //public static Lokasi per_mikoriza_akhir;
    //public static Pesanan pes_mikoriza;
    //public static Administrasi administrasi;
    //private TipeLayanan layanan;
    /**
     * Constructor for objects of class OjeKampus
     */
    public OjeKampus()
    {   
    }

    /** Method ini berfungsi untuk menampilkan Main Method
       * 
       */
    public static void main (String [] args)
    {        
        Lokasi newLokasi1 = new Lokasi("McDonalds",2,11,"Kelapa Dua");
   Lokasi newLokasi2 = new Lokasi("KFC", 5,7,"Lenteng Agung");
   Lokasi newLokasi3 = new Lokasi("Kost Pinky",8,19,"Kukusan Teknik UI"); // digunakan untuk menambahkan lokasi awal ke dalam per_zheta_awal dengan memanggil class Lokasi
   Lokasi newLokasi4 = new Lokasi("Es Pocong",14,9, "Jalan Margonda"); //digunakan untuk menambahkan lokasi akhir ke dalam per_zheta_akhir dengan memanggil class Lokasi
   Lokasi newLokasi5 = new Lokasi("Wisma Makara", 15, 2, "Universitas Indonesia");
   Lokasi newLokasi6 = new Lokasi("Ruang Robotik", 7,6, "Fakultas Teknik UI");
   
   Ojek newOjek1 = new Ojek(DatabaseUser.getIDOjekTerakhir(), "Boss", newLokasi1, StatusOjek.Idle);
   newOjek1.setDOB(19,10,1996);
   newOjek1.setNoPlat("B3147SOT");
   DatabaseUser.addOjek(newOjek1);
   Ojek newOjek2 = new Ojek(DatabaseUser.getIDOjekTerakhir(), "Bossoka", newLokasi2, StatusOjek.Idle);
   newOjek2.setDOB(19,10,1996);
   newOjek2.setNoPlat("B3147SO");
   DatabaseUser.addOjek(newOjek2);
   Ojek newOjek3 = new Ojek(DatabaseUser.getIDOjekTerakhir(), "Bossako", newLokasi3, StatusOjek.Idle);
   newOjek3.setNoPlat("B3147S");
   newOjek3.setDOB(19,10,1996);
   DatabaseUser.addOjek(newOjek3);
   
   Pelanggan newPelanggan1 = new Pelanggan(1, "Rini", "08770877087");
   newPelanggan1.setDOB(19,10,1996);
   DatabaseUser.addPelanggan(newPelanggan1);
   Pesanan pesan1 = new Pesanan(newPelanggan1, TipeLayanan.BeliBarang, newLokasi1, newLokasi2, "Budi");
    try {
        DatabasePesanan.addPesanan(pesan1);
       
    }catch (PesananSudahAdaException err){
        err.getMessage();
    }
   Pelanggan newPelanggan2 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), "Rinia", "08120812081");
   newPelanggan2.setDOB(19,10,1996);
   DatabaseUser.addPelanggan(newPelanggan2);
   Pesanan pesan2 = new Pesanan(newPelanggan2, TipeLayanan.AntarOrang, newLokasi3, newLokasi4, "Budidayakan");
    try { 
        
       DatabasePesanan.addPesanan(pesan2);
       
    }catch (PesananSudahAdaException err){
       err.getMessage();
    }
   Pelanggan newPelanggan3 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), "Rinianty", "08780878087");
   newPelanggan3.setDOB(19,10,1996);
   DatabaseUser.addPelanggan(newPelanggan3);
   Pesanan pesan3 = new Pesanan(newPelanggan3, TipeLayanan.AntarBarang, newLokasi4, newLokasi5, "Budskuy");
    try { 

      DatabasePesanan.addPesanan(pesan3);
    }catch (PesananSudahAdaException err){
       err.getMessage();
    }
    try { 
      DatabasePesanan.addPesanan(pesan3);
    }catch (PesananSudahAdaException err){
       err.getMessage();
    }
   Administrasi.printAllDatabase();
   
   for (int i = 0;i<3;i++){
       Administrasi.jalankanSistemPenugas();
       }
       
    System.out.println("====================================================\n");
    System.out.println("==================Hasil Print Data==================\n");
    System.out.println("====================================================");
    System.out.println("\nSystem Penugas pada program ini berjalan lancar    :"); 
    System.out.println("====================================================");
    Administrasi.printAllDatabase();
    
    Administrasi.pesananDibatalkan(newPelanggan1);
    System.out.println("\nDatabase setelah terjadi pembatalan pembelian barang: :");
    System.out.println("====================================================");
    Administrasi.printAllDatabase();
    
    Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(newPelanggan2),DatabaseUser.getUserOjek(1))    ; 
    Administrasi.pesananDibatalkan(newOjek1);
    System.out.println("\nDatabase setelah terjadi pembatalan pesanan antar barang  :");
    System.out.println("====================================================");
    Administrasi.printAllDatabase();
    
    newOjek3.setStatus(StatusOjek.Antar);
    System.out.println("\nDatabase setelah setelah terjadi perubahan status AntarOrang :");
    System.out.println("====================================================");
    Administrasi.printAllDatabase();
    
    Administrasi.pesananSelesai(newPelanggan3);
    System.out.println("\nDatabase setelah menyelesaikan pesanan dan menghapus pesanan antar orang:");
    System.out.println("====================================================");
    Administrasi.printAllDatabase();
    }
    
    public static void antarBarang()
    {
    }
    
    public static void antarOrang()
    {
    }
    
    public static void ojekMembatalkan()
    {
    }
    
    public static void ojekMengubahStatus()
    {
    }
    
    public static void pembelianBarang()
    {
    }
    
    public static void penggunaMembatalkan()
    {
    }
    
    public static void penggunaMenghapusPesanan()
    {
    }
    
    public static void penggunaMenyelesaikanPesanan()
    {
    }
    
    public static void registrasiOjek()
    {
    }
    
    public static void registrasiPengguna()
    {
    }
}
