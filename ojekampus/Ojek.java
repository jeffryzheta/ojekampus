
/**
 * Write a description of class Ojek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ojek
{
  private static String status="idle";
  private static Lokasi posisiSekarang;
  private static Pesanan pesanan_sekarang=null;
  private static int id;
  private static String nama;
 
   /**
    * @param id yang telah di set
    * @param nama yang telah diset 
    * @param posisi_sekarang yang telah di set
    * @return tidak ada 
    */
  public Ojek(int id, String nama, Lokasi posisi_sekarang){
      this.id=id;
      this.nama=nama;
      this.posisiSekarang=posisiSekarang;
      
    }
     /**
    * @param id yang telah di set 
    * @return tidak ada 
    */
  public void setID(int id) {
     this.id=id;
    }
     /**
    * @param nama yang telah di set 
    * @return tidak ada 
    */
  public void setNama(String nama){ 
      this.nama=nama;
    } 
     /**
    * @param pesan yang telah di set 
    * @return tidak ada 
    */
  public void setPesanan(Pesanan pesan) {
     pesanan_sekarang=pesan;
    } 
     /**
    * @param sekarang yang telah di set 
    * @return tidak ada
    */
  public void setPosisi(Lokasi sekarang){ 
    posisiSekarang=sekarang;
    } 
     /**
    * @param status saat ini 
    * @return tidak ada 
    */
  public void setStatus(String status){
    this.status="idle";
} 
 /**
    * @param tidak ada
    * @return 0 yang tidak berisi 
    */
  public int getID(){ 
    return 0;}
     /**
    * @param tidak ada
    * @return nama yang sduah diisi 
    */
  public String getNama(){
    return nama; }
     /**
    * @param tidak da
    * @return null yang berarti tidak ada 
    */
  public Pesanan getPesanan() {
   return null;}
    /**
    * @param tidak ada 
    * @return pisisiSekarang
    */
  public Lokasi getPosisi() {
    return posisiSekarang;}
     /**
    * @param tidak ada 
    * @return status yang berisi status saat ini 
    */
  public String getStatus() {
    return status;}
     /**
    * @param tidak ada 
    * @return tidak ada 
    */
  public void printData() {
      System.out.println("Nama Ojek : "+ getNama());
      System.out.println("ID Ojek : "+ getID());
      System.out.println("Status Ojek : "+ getStatus());
    } 
  
}
