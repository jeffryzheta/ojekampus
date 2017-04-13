
/**
 * Write a description of class DatabasePesanan here.
 * class ini digunakan untuk menambahkan ke data base pesanan yang sudah di buat dan menghapusnya juga
 * @author Jeffry Kurniawan Zheta
 * @version 3/4/2017
 */
import java.util.ArrayList;
import java.util.Objects;

public class DatabasePesanan
{
    private static ArrayList<Pesanan> list_pesanan= new ArrayList<Pesanan>();
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
    public static boolean addPesanan(Pesanan pesan) throws PesananSudahAdaException {

      for (Pesanan list : list_pesanan) {
           if( list.getPelanggan().equals(list.getPelanggan())) {
               if(list.getPelanggan().getID()== pesan.getPelanggan().getID());
               throw new PesananSudahAdaException(pesan);
               //return false;
           }
       }
       
       list_pesanan.add(pesan);
       return true;
      
    } 
    public static boolean hapusPesanan (Pesanan pesan) throws PesananTidakDitemukanException{
        for (Pesanan list : list_pesanan) {
           if( list.getPelanggan().equals(list.getPelanggan())) {
               if(list.getPelanggan().getID()== pesan.getPelanggan().getID());
              list_pesanan.remove(list);
               return true;
           }
       } 
       throw new PesananTidakDitemukanException(pesan);
            //return false;
    } 
     /**
      * @param pesan kali ini digunakan untuk menunjukkan yang mana yang dihapus 
      * @return true boolean yang berarti siap di hapus setiap saat 
      */
   public static boolean hapusPesanan(Pelanggan pengguna) throws PesananOlehPelangganDitemukanException { 
        /*pesan = list_pesanan;
        list_pesanan=null;
        System.out.println("pehapusan pemesanan dari list berhasil dilakukan");*/
       for (Pesanan list : list_pesanan) {
           if(pengguna.equals(list.getPelanggan())) {
               list_pesanan.remove(list);
               return true;
            }
            
       }
       throw new PesananOlehPelangganDitemukanException(pengguna);
       //return false;
       
    }
  /*  public static boolean hapusPesanan(Pelanggan pengguna) {
        if(pengguna.getNama()==pengguna) { 
            Pesanan.pesananSelesai();
        }
    }*/
    public static Pesanan getPesanan(Pelanggan pengguna){ 
       for (Pesanan list : list_pesanan) {
           if(pengguna.equals(list.getPelanggan())) {
               return list;
            }
       }
      
       return null;
    } 
     public static ArrayList<Pesanan> getDatabase()
    {
        return list_pesanan;
    }
        
}
