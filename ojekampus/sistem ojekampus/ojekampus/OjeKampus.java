
/**
 * Write a description of class OjeKampus here.
 * Class ini core dari program, digunakan untuk banyak hal
 * di single line command akan di jelaskan 
 * @author Jeffry Kurniawan ZHeta
 * @version 3/4/2017
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
    public static void main(String args[]){ 
    DatabaseUser ojek_data = new DatabaseUser(); //ini untuk menambahkan data ojek kedalam DatavaseUser
    Lokasi ojek_lokasi = new Lokasi("Kost Jawa",14, 06, "Kukusan Teknik UI"); //menambahkan lokasi yang diinginkan ke dalam ojek_lokasi 
                                                                              //dengan parameter yang sesuai dengan class Lokasi               
    Ojek ojek_jeffry = new Ojek(ojek_data.getIDOjekTerakhir(), "Jeffry", ojek_lokasi); //digunakan untuk memanggil class Ojek sesuai dengan parameternya
                                                                                       // dan memasukkan datanya ke dalam ojek_jeffry 
    Pelanggan p_zheta = new Pelanggan(ojek_data.getIDPelangganTerakhir(), "Zheta"); //digunakan untuk memanggil class pelanggan dan memasukkan data 
                                                                                    //kedalam p_zheta
    
    Lokasi per_zheta_awal = new Lokasi("Kost Pinky",5,3,"Kukusan Teknik UI"); // digunakan untuk menambahkan lokasi awal ke dalam per_zheta_awal dengan memanggil class Lokasi
    
    Lokasi per_zheta_akhir = new Lokasi("Es Pocong",2,0, "Jalan Margonda"); //digunakan untuk menambahkan lokasi akhir ke dalam per_zheta_akhir dengan memanggil class Lokasi
    
  
    Pesanan pes_zheta = new Pesanan(p_zheta,"Antar Jemput", per_zheta_awal, per_zheta_akhir,"Nindya", "Valda", 15000); //memanggil class pesanan untuk menambah pesanan baru
    
    ojek_data.addOjek(ojek_jeffry); //menambahkan ojek_jeffry yang sesuai dengan parameter addOjek ke dalam database (ojek baru)
   
    ojek_data.addPelanggan(p_zheta);//menambahkan p_zheta yang sesuai dengan parameter addPelanggan ke dalam database (pelanggan baru)
    DatabasePesanan pesanan_data = new DatabasePesanan(); //menginisiasi database baru jika ada pesanan_data 
    pesanan_data.addPesanan(pes_zheta);//menambahkan pes_zheta sebagai pesanan baru ke dalam database 
    
    ojek_jeffry.printData(); //menampilkan isi ojek_jeffry 
    
    p_zheta.printData();//menampilkan pelanggan zheta
    
    ojek_jeffry.setNama("Zheta"); //mengatur nama ojek jeffry
    
    p_zheta.setNama("Jeffry"); //mengatur nama pelanggan 
    
    ojek_jeffry.printData(); //menampilkan ojek_jeffry 
    p_zheta.printData();//menampillkan pelanggan zheta
    
    pes_zheta.printData();  //menampilkan pesana zheta
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

}
}
