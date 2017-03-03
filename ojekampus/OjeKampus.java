
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
    String temp;
    Pelanggan pelanggan1 = new Pelanggan();
    pelanggan1.setID(90);
    pelanggan1.setNama("zheta");
    temp = Integer.toString(pelanggan1.getID());
    System.out.println("ID Driver= "+temp);
    System.out.println("Nama Driver= "+ pelanggan1.getNama());
    
    Ojek ojek1 = new Ojek();
    ojek1.setID(90);
    ojek1.setNama("abang");
    temp = Integer.toString(ojek1.getID());
    System.out.println("ID Driver= "+temp);
    System.out.println("Nama Driver= "+ ojek1.getNama());
    

}
}
