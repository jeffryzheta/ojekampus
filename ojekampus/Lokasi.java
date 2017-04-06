
/**
 * Write a description of class OjeKampus here.
 * Class ini untuk mengisi menunjukkan segala jenis lokasi 
 * @author Jeffry Kurniawan Zheta
 * @version 3/4/2017
 */
public class Lokasi
{
   private double x;
   private double y;
   private String nama_lokasi; 
   private String keterangan_lokasi;
  
   
    /**
    * @param nama_lokasi berisi nama lokasi saat ini 
    * @param x berarti nilai longitude 
    * @param x berarti nilai latitude
    * @param keterangan_lokasi berisi keterangan lokasi yang ditambahkan user
    * @return nothing 
    */
   public Lokasi(String nama_lokasi, double x, double y, String keterangan_lokasi){
    this.nama_lokasi = nama_lokasi;
    this.x=x;
    this.y=y;
    this.keterangan_lokasi=keterangan_lokasi;
    }
    public void printData()
    {
        System.out.println("Koordinat x:" +x);
        System.out.println("Koordinat y:" +y);
        System.out.println("Keterangan Lokasi:" +keterangan_lokasi);
    }
   /**
    * @param nothing 
    * @return x yang dimasukkan user  
    */
    public double getX(){
        return 0;
    } 
    /**
    * @param nothing 
    * @return y yang dimakkan user  
    */
     public double getY(){
         return 0;
    }
    /**
    * @param nothing 
    * @return nama_lokasi yang dimasukkan user  
    */
   public String getNama() {  
    return nama_lokasi;
    } 
    
    /**
    * @param nothing 
    * @return x yang dimasukkan user  
    */
    public String getKeteranganLokasi(){ 
    return keterangan_lokasi;
    } 
    /**
    * @param x yang telah di set 
    * @return nothing 
    */
    public void setX(double x){
        this.x=x;
    } 
     /**
    * @param y yang telah di set 
    * @return nothing 
    */
   public void setY(double y){
       this.y=y;
    } 
     /**
    * @param nama_lokasi yang telah di set 
    * @return nothing 
    */
    public void setNama(String nama_lokasi){
    this.nama_lokasi = nama_lokasi;
    }
     /**
    * @param keterangan_lokasi yang telah di set 
    * @return nothing 
    */
    public void setKeteranganLokasi(String keterangan_lokasi){ 
        this.keterangan_lokasi= keterangan_lokasi;
       
    } 
     public String toString()
    {
        return "daerah "+this.nama_lokasi + "("+this.x+","+this.y+") di "+this.keterangan_lokasi;
    }
    
}
