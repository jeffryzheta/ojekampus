
/**
 * Write a description of class DatabasePesanan here.
 * class ini digunakan untuk menambahkan ke data base pesanan yang sudah di buat dan menghapusnya juga
 * @author Jeffry Kurniawan Zheta
 * @version 3/4/2017
 */
public class DatabasePesanan
{
    private static Pesanan list_pesanan;
    /**
     * @param nothing
     * @return nothing
     */
    public DatabasePesanan() {
     // instance variables - replace the example below with your own
    } 
     /**
      * @param pesan berisi informasi pesanan yang diambil dari class Pesanan dan dimasukkan ke DB 
      * @return true berarti database akan siap dimasukkan setiap saat 
      */
    public static boolean addPesanan(Pesanan pesan){
        list_pesanan = pesan;
        System.out.println("pemasukan pemesanan kedalam list berhasil dilakukan"); 
    return true;
    
    }
    
     /**
      * @param pesan kali ini digunakan untuk menunjukkan yang mana yang dihapus 
      * @return true boolean yang berarti siap di hapus setiap saat 
      */
    public static boolean hapusPesanan(Pesanan pesan){ 
        pesan = list_pesanan;
        list_pesanan=null;
        System.out.println("pehapusan pemesanan dari list berhasil dilakukan");
    return true;
    }
   
     /**
      * @param nothing
      * @return list_pesanan yang diambil dalam class Pesanan
      */
    public static Pesanan getPesanan(){ 
    return list_pesanan;   
    } 
        
}
