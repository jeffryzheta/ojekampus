
/**
 * Write a description of class OjeKampus here.
 * Class ini core dari program, digunakan untuk banyak hal
 * di single line command akan di jelaskan 
 * @author Jeffry Kurniawan ZHeta
 * @version 3/20/2017
 */
public class OjeKampus
{
/**
 * @param nothing
 * @return nothing
 * 
 */  
public OjeKampus()
    {
        // initialise instance variables
        
    }
/** 
 * @param adalah String args[] digunakan untuk menunjukkan 
 * argument dari tipe data String yang diterima Java app jika 
 * dijalankan.
 * @return tidak digunakan karena dalam bentuk void 
 */
    public static void main(String[] args){ 
    
  /* DatabaseUser ojek_data = new DatabaseUser(); //ini untuk menambahkan data ojek kedalam DatavaseUser
    Lokasi ojek_lokasi = new Lokasi("Kost Jawa",14, 06, "Kukusan Teknik UI"); //menambahkan lokasi yang diinginkan ke dalam ojek_lokasi                                                                           //dengan parameter yang sesuai dengan class Lokasi               
    Ojek ojek_jeffry = new Ojek(ojek_data.getIDOjekTerakhir(), "Jeffry", ojek_lokasi); //digunakan untuk memanggil class Ojek sesuai dengan parameternya
    // dan memasukkan datanya ke dalam ojek_jeffry 
    Pelanggan p_zheta = new Pelanggan(ojek_data.getIDPelangganTerakhir(), "Zheta"); //digunakan untuk memanggil class pelanggan dan memasukkan data 
    //kedalam p_zheta
    Pesanan pes_zheta = new Pesanan(p_zheta,TipeLayanan.AntarOrang, per_zheta_awal, per_zheta_akhir,"Nindya", "Valda", 15000); //memanggil class pesanan untuk menambah pesanan baru
    ojek_data.addOjek(ojek_jeffry); //menambahkan ojek_jeffry yang sesuai dengan parameter addOjek ke dalam database (ojek baru)
    ojek_data.addPelanggan(p_zheta);//menambahkan p_zheta yang sesuai dengan parameter addPelanggan ke dalam database (pelanggan baru)
    DatabasePesanan pesanan_data = new DatabasePesanan(); //menginisiasi database baru jika ada pesanan_data 
    pesanan_data.addPesanan(pes_zheta);//menambahkan pes_zheta sebagai pesanan baru ke dalam database 
    */
   /* 
    Ojek newOjek = new Ojek(34, "Boss", newLokasi1);
    
    Pelanggan newPelanggan = new Pelanggan(34, "Bro");
    Pesanan newPesanan = new Pesanan(newPelanggan, TipeLayanan.AntarOrang, newLokasi1, newLokasi2, "Bima", "Dodi", 20000);
    
    DatabaseUser newDBUser = new DatabaseUser();
    newDBUser.addPelanggan(newPelanggan);
    newDBUser.addOjek(newOjek);
    DatabasePesanan newDBPesanan = new DatabasePesanan();
    newDBPesanan.addPesanan(newPesanan);*/
    
   /* ojek_jeffry.printData(); //menampilkan isi ojek_jeffry 
    p_zheta.printData();//menampilkan pelanggan zheta
    ojek_jeffry.setNama("Zheta"); //mengatur nama ojek jeffry
    p_zheta.setNama("Jeffry"); //mengatur nama pelanggan 
    ojek_jeffry.printData(); //menampilkan ojek_jeffry 
    p_zheta.printData();//menampillkan pelanggan zheta
    pes_zheta.printData();  //menampilkan pesana zheta
    
    System.out.println("Ojek dengan nama "+ newOjek.getNama() + " dan ID :"+ newOjek.getID() +" memiliki status "+ newOjek.getStatus());
    System.out.println("Pelanggan dengan nama " + newPelanggan.getNama()+" memiliki ID "+ newPelanggan.getID());
    System.out.println("" + newPesanan.getPenggunaAwal()+ " di "+ newPesanan.getLokasiAwal().getNama()+" "+ newPesanan.getPenggunaAkhir()+" di "+ newPesanan.getLokasiAkhir().getNama()+ " dengan layanan "+ newPesanan.getTipeLayanan()+ " status "+ newPesanan.getDiproses()+ " status "+ newPesanan.getSelesai());
    */
     
 /*   
    Ojek ojek_7 = new Ojek(19, "jeffry", newLokasi1);
   
    ojek_7.setNama("Jeffry");
    ojek_7.setNoPlat("B124UA");
    Pelanggan pelanggan_7 = new Pelanggan(19, "Zheta");
    pelanggan_7.setNama("zheta");
    pelanggan_7.setDOB(19,10,1996);
    pelanggan_7.setTelepon("082213297020");
    Pesanan newPesanan = new Pesanan(pelanggan_7, TipeLayanan.AntarOrang, newLokasi1, newLokasi2, "Bima", "Dodi", 20000);
    
    System.out.println("Cetak dengan printData");
    System.out.println("Objek dari ojek : "+ ojek_7);
    System.out.println("Objek dari pelanggan : "+ pelanggan_7); 
    pelanggan_7.getDOB();
    
  

Administrasi newAdmin = new Administrasi(); 
if(ojek_7.getStatus()==StatusOjek.Idle){
 newAdmin.pesananDitugaskan(newPesanan, ojek_7); 
System.out.println("Status Ojek sedang "+ ojek_7.getStatus() + " Bisa mengantar");
}
else if(ojek_7.getStatus()==StatusOjek.Antar || ojek_7.getStatus()==StatusOjek.Jemput){
 newAdmin.pesananDibatalkan(ojek_7); 
System.out.println("Pesanan dibatalkan");
}*/
    /*  String temp;
    Pelanggan pelanggan1 = new Pelanggan();
    pelanggan1.setID(90);
    pelanggan1.setNama("zheta");
    temp = Integer.toString(pelanggan1.getID());
    System.out.println("ID Pelanggan= "+temp);
    System.out.println("Nama Pelanggan= "+ pelanggan1.getNama());
    
    Ojek ojek1 = new Ojek();
    ojek1.setID();
    ojek1.setNama("abang");
    temp = Integer.toString(ojek1.getID());
    System.out.println("ID Driver= "+temp);
    System.out.println("Nama Driver= "+ ojek1.getNama());
    */
  
   Lokasi newLokasi1 = new Lokasi("McDonalds",11,12,"Kelapa Dua");
   Lokasi newLokasi2 = new Lokasi("KFC", 13,14,"Lenteng Agung");
   Lokasi newLokasi3 = new Lokasi("Kost Pinky",5,3,"Kukusan Teknik UI"); // digunakan untuk menambahkan lokasi awal ke dalam per_zheta_awal dengan memanggil class Lokasi
   Lokasi newLokasi4 = new Lokasi("Es Pocong",2,9, "Jalan Margonda"); //digunakan untuk menambahkan lokasi akhir ke dalam per_zheta_akhir dengan memanggil class Lokasi
   Lokasi newLokasi5 = new Lokasi("Wisma Makara", 10, 7, "Universitas Indonesia");
   Lokasi newLokasi6 = new Lokasi("Ruang Robotik", 19,33, "Fakultas Teknik UI");
   
   Ojek newOjek1 = new Ojek(DatabaseUser.getIDOjekTerakhir(), "Boss", newLokasi1);
   newOjek1.setDOB(19,10,1996);
   newOjek1.setNoPlat("B3147SOT");
   DatabaseUser.addOjek(newOjek1);
   Ojek newOjek2 = new Ojek(DatabaseUser.getIDOjekTerakhir(), "Bossoka", newLokasi2);
   newOjek2.setDOB(19,10,1996);
   newOjek2.setNoPlat("B3147SO");
   DatabaseUser.addOjek(newOjek2);
   Ojek newOjek3 = new Ojek(DatabaseUser.getIDOjekTerakhir(), "Bossako", newLokasi3);
   newOjek3.setNoPlat("B3147S");
   newOjek3.setDOB(19,10,1996);
   DatabaseUser.addOjek(newOjek3);
   
   Pelanggan newPelanggan1 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), "Rini", "08770877087");
   newPelanggan1.setDOB(19,10,1996);
   DatabaseUser.addPelanggan(newPelanggan1);
   Pelanggan newPelanggan2 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), "Rinia", "08120812081");
   newPelanggan2.setDOB(19,10,1996);
   DatabaseUser.addPelanggan(newPelanggan2);
   Pelanggan newPelanggan3 = new Pelanggan(DatabaseUser.getIDPelangganTerakhir(), "Rinianty", "08780878087");
   newPelanggan3.setDOB(19,10,1996);
   DatabaseUser.addPelanggan(newPelanggan3);
   
  try { DatabasePesanan.addPesanan(new Pesanan(newPelanggan1, TipeLayanan.BeliBarang, newLokasi4, newLokasi5, "Budi", "Budian"));
   DatabasePesanan.addPesanan(new Pesanan(newPelanggan2, TipeLayanan.AntarBarang, newLokasi1, newLokasi6, "Budskuy", "Budianduk"));
   DatabasePesanan.addPesanan(new Pesanan(newPelanggan3, TipeLayanan.AntarOrang, newLokasi3, newLokasi2, "Budidayakan"));
}catch (PesananSudahAdaException err){
    err.getMessage();
}
    Administrasi.printAllDatabase();
    for(int i=0; i<3; i++) { 
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
    try {DatabasePesanan.hapusPesanan(newPelanggan3);}
    catch (PesananOlehPelangganDitemukanException err) {
        
        err.getMessage();}

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
