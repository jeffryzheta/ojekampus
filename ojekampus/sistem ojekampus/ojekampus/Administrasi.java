
/**
 * Write a description of class Administrasi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
 
    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void pesananDitugaskan(Pesanan pesan, Ojek pelayan)
    {
        // put your code here
       pesan.setStatusSelesai(false);
       pesan.setStatusDiproses(true);
       pesan.setPelayan(pelayan);
       ojekAmbilPesanan(pesan, pelayan);
       
    }
    public static void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan) {
       pelayan.setStatus(StatusOjek.Jemput);
       pelayan.setPesanan(pesan);
    }
    public static void ojekLepasPesanan(Ojek pelayan){
        
        pelayan.setStatus(StatusOjek.Idle);
        pelayan.setPesanan(null);
       
    } 
    
    public static void pesananDibatalkan(Ojek pelayan){ 
       
        pelayan.getPesanan().setStatusSelesai(false);
        pelayan.getPesanan().setStatusDiproses(false);
        pelayan.setPesanan(null);
        ojekLepasPesanan(pelayan); 
    } 
    
    public static void pesananDibatalkan(Pesanan pesan){ 
      
        
    } 
    
    public static void pesananSelesai(Ojek pelayan) { 
        pelayan.getPesanan().setStatusSelesai(true);
        pelayan.getPesanan().setStatusDiproses(false);
        pelayan.getPesanan().setPelayan(null);
    }
    
}
