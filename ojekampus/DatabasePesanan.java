
/**
 * @author Jeffry Kurniawan Zheta
 * @version 4 Maret 2017
 * Class DatabasePesanan adalah class yang digunakan untuk memanggil objek DatabasePesanan
 * Objek DatabasePesanan dipanggil untuk menyimpan data pesanan.
 */
import java.util.ArrayList;
import java.util.Objects;
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static ArrayList<Pesanan> listPesanan = new ArrayList<>();
    /** Method ini berfungsi untuk menghapus pesanan 
    * @return true, berfungsi mengembalikan nilai true pada method.
    */
    public static boolean hapusPesanan(Pesanan pesan) throws PesananTidakDitemukanException
    {
        Administrasi adm = new Administrasi();
        for(Pesanan list:listPesanan)
        {
            if(list.getPelanggan().equals(pesan.getPelanggan()))
            {
                if(!(list.getPelayan().equals(null)))
                {
                    adm.pesananSelesai(pesan);
                    return true;
                }
            }
            else
            {
                throw new PesananTidakDitemukanException(pesan);
            }
        }
        throw new PesananTidakDitemukanException(pesan);
    }
    
    /** Method ini berfungsi untuk menghapus pesanan 
    * @return true, berfungsi mengembalikan nilai true pada method.
    */
    public static boolean hapusPesanan(Pelanggan pengguna) throws PesananOlehPelangganDitemukanException
    {
        Administrasi adm = new Administrasi();
        for(Pesanan list:listPesanan)
        {
            if(list.getPelanggan().equals(pengguna))
            {
                if(!(list.getPelayan().equals(null)))
                {
                    adm.pesananSelesai(pengguna);
                    return true;
                }
            }
            else
            {
                throw new PesananOlehPelangganDitemukanException(pengguna);
            }
        }
        throw new PesananOlehPelangganDitemukanException(pengguna);
        //mencari pesanan yang dilakukan oleh pelanggan.
        //Jika pesanan tersebut sudah memiliki pelayan, pesanan tersebut dijadikan selesai secara administrasi.
    }
    
    /** Method ini berfungsi untuk mengambil (get) pesanan 
    * @return listPesanan, berfungsi mengembalikan nilai ke listPesanan.
    */
    public static Pesanan getPesanan(Pelanggan pengguna)
    {
        for (Pesanan list : listPesanan) {
           if(pengguna.equals(list.getPelanggan())) {
               return list;
            }
       }
       return null;
       //mencari pesanan yang sedang dilakukan pengguna
    }
    
    public static ArrayList<Pesanan> getDatabase()
    {
        return listPesanan;
    }
    
    public static boolean addPesanan(Pesanan pesan)throws PesananSudahAdaException
    {
       for (Pesanan list : listPesanan) {
           if( pesan.getPelanggan().equals(list.getPelanggan())) 
           {
               throw new PesananSudahAdaException(list);
           }
       }
       
       listPesanan.add(pesan);
       return true;
       //Pesanan hanya akan berhasil apabila pelanggan yang memesan tidak sedang melakukan pemesanan lainnya.
    }
}
    
