
/**
 * @author Jeffry Kurniawan Zheta
 * @version 4 Maret 2017
 * Class Ojek adalah class yang digunakan untuk memanggil objek Ojek
 * Objek Ojek dipanggil untuk mengambil ID, nama, status, dan lokasi ojek.
 */
import java.util.Date;
import java.util.regex.*;
import java.util.GregorianCalendar;

public class Ojek extends User
{
    private static StatusOjek status;    
    private static Lokasi posisi_sekarang;
    private Pesanan pesanan_sekarang;
    private static String no_plat;
    
     /**
     * Constructor ini digunakan untuk assign awal objek Ojek.
     * @param id untuk assign awal id ojek
     * @param nama untuk assign awal nama ojek
     * @param posisiSekarang untuk assign awal posisi ojek
     * @return
     */
    public Ojek(int id, String nama)
    {
        super(id,nama);
        this.id=id;
        this.nama=nama;
    }

//     /**
//      * Constructor for objects of class Ojek
//      */
//     public Ojek(int id, String nama, Lokasi posisi_sekarang, String plat, String telp)
//     {
//        super(id, nama, telp);
//        this.posisi_sekarang = posisi_sekarang;
//        this.status=status;
//        this.no_plat = no_plat;
//     }
    
    /**
     * Constructor for objects of class Ojek
     */
    public Ojek(int id, String nama, String telefon, String email, String telp, Date dob)
    {
       super(id, nama, telp);
       this.no_plat = no_plat;
       this.telefon=telefon;
       this.email=email;
       this.dob=dob;

    }
    
     /** Method ini berfungsi untuk menentukan (set) pesanan ojek
    * @parameter pesanan_sekarang , pesanan sekarang dari ojek
    */
    public void setPesanan(Pesanan pesan)
    {
        pesanan_sekarang = pesan;
    }
    
     /** Method ini berfungsi untuk menentukan (set) posisi Ojek
    * @parameter posisi_sekarang , posisi sekarang dari ojek
    */
    public static void setPosisi(Lokasi sekarang)
    {
        posisi_sekarang = sekarang;
    }
    
     /** Method ini berfungsi untuk menentukan (set) status Ojek
    * @parameter status , status dari ojek
    */
    public void setStatus(StatusOjek status)
    {
        this.status=status;
    }
    
     /** Method ini berfungsi untuk mendapatkan (get) pesanan Ojek
    * @return pesanan_sekarang , pesanan dari ojek
    */
    public Pesanan getPesanan()
    {
        return pesanan_sekarang;
    }
    
    /** Method ini berfungsi untuk mendapatkan (get) posisi Ojek
    * @return posisi_sekarang , posisi dari ojek
    */
    public Lokasi getPosisi()
    {
        return posisi_sekarang;
    }
    
    /** Method ini berfungsi untuk mendapatkan (get) pesanan Ojek
    * @return status , status dari ojek
    */
    public static StatusOjek getStatus()
    {
        return status;
    }

    public static String getNoPlat()
    {
        return no_plat;
    }
    
    public static boolean setNoPlat (String no_plat)
    {
        Pattern pola = Pattern.compile("\\D\\d{1,4}\\D{2,3}");
        Matcher sama = pola.matcher(no_plat);
        if(sama.matches())
        {
            no_plat = no_plat;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String toString()
    {
        if(pesanan_sekarang == null) {
            return "(Nama: " + nama + ", ID: " + id + ", Status: " + status + ")";
        }
        else {
            return "(Nama: " + nama + ", ID:  " + id + ", Status " + status + ", Pesanan saat ini: " + pesanan_sekarang.getPelanggan().getNama() + ")";
        }
    }
}
