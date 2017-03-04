
/**
 * Write a description of class OjeKampus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OjeKampus
{
    // instance variables - replace the example below with your own
    public OjeKampus()
    {
        // initialise instance variables
        
    }
public static void main(String args[]){ 
    DatabaseUser ojek_data = new DatabaseUser();
    Lokasi ojek_lokasi = new Lokasi("Kost Jawa",14, 06, "Kukusan Teknik UI");
    Ojek ojek_jeffry = new Ojek(ojek_data.getIDOjekTerakhir(), "Jeffry", ojek_lokasi);
    
    Pelanggan p_zheta = new Pelanggan(ojek_data.getIDPelangganTerakhir(), "Zheta");
    
    Lokasi per_zheta_awal = new Lokasi("Kost Pinky",5,3,"Kukusan Teknik UI");
    
    Lokasi per_zheta_akhir = new Lokasi("Es Pocong",2,0, "Jalan Margonda");
    
    Pesanan pes_zheta = new Pesanan(p_zheta,"Antar Jemput", per_zheta_awal, per_zheta_akhir,"Nindya", "Valda", 15000);
    
    ojek_data.addOjek(ojek_jeffry);
    ojek_data.addPelanggan(p_zheta);
    DatabasePesanan pesanan_data = new DatabasePesanan();
    pesanan_data.addPesanan(pes_zheta);
    
    ojek_jeffry.printData();
    p_zheta.printData();
    
    ojek_jeffry.setNama("Zheta");
    p_zheta.setNama("Jeffry");
    
    ojek_jeffry.printData();
    p_zheta.printData();
    
    pes_zheta.printData(); 
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
