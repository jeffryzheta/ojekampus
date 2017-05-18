
/**
 * @author Jeffry Kurniawan Zheta
 * @version 4 Maret 2017
 * Class Pelanggan adalah class yang digunakan untuk memanggil objek Pelanggan
 * Objek Pelanggan dipanggil untuk mengambil ID dan Nama Pelanggan
 */

import java.util.Date;
import java.util.regex.*;
import java.util.GregorianCalendar;

public class Pelanggan extends User
{
    // instance variables - replace the example below with your own

//     /**
//      * Constructor for objects of class Pelanggan
//      */
//     public Pelanggan (int id, String nama, String telefon)
//     {
//         super(id,nama,telefon);
//         
//     }
    
    public Pelanggan (int id, String nama, String telefon, String email, Date dob)
    {
        super(id,nama,telefon);
        this.email=email;
        this.dob=dob;
        
    }
    
    
    
     /**
     * Constructor ini digunakan untuk assign awal objek Ojek.
     * @param id untuk assign awal id ojek
     * @param nama untuk assign awal nama ojek
     * @param posisiSekarang untuk assign awal posisi ojek
     * @return
     */
    public Pelanggan(int id, String nama)
    {
        super(id,nama);
        this.id=id;
        this.nama=nama;
    }

    public String toString()
    {
        if(DatabasePesanan.getPesanan(this) != null)
        {
            return "(Nama: " + nama + ", ID: " + id + ", Telefon: " + getTelefon() + ", Pengguna awal: " + DatabasePesanan.getPesanan(this).getPenggunaAwal() + ")";
        }
        else 
        {
            return "(Nama: " + nama + ", ID: " + id + ", Telefon: " + getTelefon()  + ")";
        }  
    }
}
