
/**
 * Write a description of class DatabasePesanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DatabasePesanan
{
    // instance variables - replace the example below with your own
    private static Pesanan list_pesanan;
    public DatabasePesanan() {
    
    } 
    public static boolean addPesanan(Pesanan pesan){
        list_pesanan = pesan;
        System.out.println("pemasukan pemesanan :"+ list_pesanan +" kedalam list berhasil dilakukan"); 
    return true;
    
    }
    
    public static boolean hapusPesanan(Pesanan pesan){ 
        pesan = list_pesanan;
        list_pesanan=null;
        System.out.println("pehapusan pemesanan :"+ list_pesanan +" dari list berhasil dilakukan");
    return true;
    }
   
    public static Pesanan getPesanan(){ 
    return list_pesanan;   
    } 
        
}
