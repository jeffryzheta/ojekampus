
/**
 * @author Jeffry Kurniawan Zheta
 * @version 4 Maret 2017
 * Class Pelanggan adalah class yang digunakan untuk memanggil objek Pelanggan
 * Objek Pelanggan dipanggil untuk mengambil ID dan Nama Pelanggan
 */

import java.util.Date;
import java.util.regex.*;
import java.util.GregorianCalendar;

public class User
{
    protected int id;
    protected String nama;
    protected String telefon; 
    protected static String email;
    protected static Date dob;
    protected static int day, month, year; 
    /**
     * Constructor for objects of class Pelanggan
     */
    public User (int id, String nama, String telefon)
    {
        this.id = id;
        this.nama = nama;
        this.telefon = telefon;
        this.email=email;
        this.dob=dob;
    }
    
//      public User (int id, String nama, String telefon, String Email, Date dob)
//     {
//         this.id = id;
//         this.nama = nama;
//         this.telefon = telefon;
//         this.email=email;
//         this.dob=dob;
//     }
    
    /**
     * Constructor ini me-assign id dan nama pada kelas User
     * @param id belum digunakan
     * @param nama belum digunakan
     * @return 
     */
    public User(int id, String nama)
    {
        this.id=id;
        this.nama=nama;
    }

    /** Method ini berfungsi untuk mengambil (get) ID pelanggan
     * @return id , id dari pelanggan
     */
    public int getID()
    {
        return id;        
    }
    
    public int day(){
        return day;
    }
    
    public int month(){
        return month;
    }
    
    public int year(){
        return year;
    }
    
    public static Date getDOB()
    {
        return dob;
    }
    
    /** Method ini berfungsi untuk mengambil (get) nama pelanggan
    * @return nama , nama dari pelanggan
    */
    public String getNama()
    {
        return nama;
    }
   
    
    public static boolean setTelefon (String telefon)
    {
        Pattern pola = Pattern.compile("\\d{1,12}");
        Matcher sama = pola.matcher(telefon);
        if(sama.matches())
        {
            telefon = telefon;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean setEmail(String email)
    {
     
        Pattern pola = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher sama = pola.matcher(email);
        if(sama.matches())
        {
            email = email;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static void setDOBint (int day, int month, int year)
    {
        //dob =  new GregorianCalendar(year, month, day).getTime();
        day=day;
        month=month;
        year=year;
    }
    
    public static void setDOB (int day, int month, int year)
    {
         GregorianCalendar calendar;
        calendar = new GregorianCalendar(year,month-1, day);
        dob = calendar.getTime();
    }
    
    /** Method ini berfungsi untuk menentukan (set) id pelanggan
    * @parameter id , id dari pelanggan
    */
    public void setID (int id)
    {
        this.id = id;
    }
    
    /** Method ini berfungsi untuk menentukan (set) nama pelanggan
    * @parameter nama , nama dari pelanggan
    */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    public String getTelefon()
    {
        return telefon;
    }
    
    public static String getEmail()
    {
        return email;
    }
}
