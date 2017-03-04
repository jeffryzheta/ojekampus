
/**
 * Write a description of class OjeKampus here.
 * Class ini untuk mengisi menunjukkan segala jenis lokasi 
 * @author Jeffry Kurniawan Zheta
 * @version 3/4/2017
 */
public class Lokasi
{
   private static double x;
   private static double y;
   private static String nama_lokasi; 
   private static String keterangan_lokasi;
   
    /**
    * @param nama_lokasi berisi nama lokasi saat ini 
    * @param x berarti nilai longitude 
    * @param x berarti nilai latitude
    * @param keterangan_lokasi berisi keterangan lokasi yang ditambahkan user
    * @return tidak ada 
    */
   public Lokasi(String nama_lokasi, double x, double y, String keterangan_lokasi){
    this.nama_lokasi=nama_lokasi;
    this.x=x;
    this.y=y;
    this.keterangan_lokasi=keterangan_lokasi;
    }
   /**
    * @param tidak ada 
    * @return x yang dimasukkan user  
    */
    public double getX(){
        return x;
    } 
    /**
    * @param tidak ada 
    * @return y yang dimasukkan user  
    */
     public double getY(){
         return y;
    }
    /**
    * @param tidak ada 
    * @return nama_lokasi yang dimasukkan user  
    */
   public String getNama() { 
    return nama_lokasi;
    } 
    /**
    * @param tidak ada 
    * @return x yang dimasukkan user  
    */
    public String getKeteranganLokasi(){ 
    return nama_lokasi;
    } 
    /**
    * @param x yang telah di set 
    * @return tidak ada 
    */
    public void setX(double x){
    } 
     /**
    * @param y yang telah di set 
    * @return tidak ada 
    */
   public void setY(double y){
    } 
     /**
    * @param nama_lokasi yang telah di set 
    * @return tidak ada 
    */
    public void setNama(String nama_Lokasi){
    
    }
     /**
    * @param keterangan_lokasi yang telah di set 
    * @return tidak ada 
    */
    public void getKeteranganLokasi(String keterangan_lokasi){ 
        
    } 
    
}
