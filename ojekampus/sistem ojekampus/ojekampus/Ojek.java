
/**
 * Write a description of class OjeKampus here.
 * Class ini untuk mengisi databaseUser dari class lain   
 * @author Jeffry Kurniawan Zheta
 * @version 3/4/2017
 */
public class Ojek
{
  private static StatusOjek status=StatusOjek.Idle;
  private static Lokasi posisiSekarang;
  private static Pesanan pesanan_sekarang=null;
  private static int id;
  private static String nama;
 
   /**
    * @param id yang telah di set
    * @param nama yang telah diset 
    * @param posisi_sekarang yang telah di set
    * @return nothing 
    */
  public Ojek(int id, String nama, Lokasi posisi_sekarang){
      this.id=id;
      this.nama=nama;
      this.posisiSekarang=posisiSekarang;
      
    }
     /**
    * @param id yang telah di set 
    * @return nothing 
    */
  public void setID(int id) {
     this.id=id;
    }
     /**
    * @param nama yang telah di set 
    * @return nothing 
    */
  public void setNama(String nama){ 
      this.nama=nama;
    } 
     /**
    * @param pesan yang telah di set 
    * @return nothing 
    */
  public void setPesanan(Pesanan pesan) {
     pesanan_sekarang=pesan;
    } 
     /**
    * @param sekarang yang telah di set 
    * @return nothing
    */
  public void setPosisi(Lokasi sekarang){ 
    posisiSekarang=sekarang;
    } 
     /**
    * @param status saat ini 
    * @return nothing 
    */
  public void setStatus(StatusOjek status){
    this.status=status;
} 
 /**
    * @param nothing
    * @return 0 yang tidak berisi 
    */
  public int getID(){ 
    return id;}
     /**
    * @param nothing
    * @return nama yang sduah diisi 
    */
  public String getNama(){
    return nama; }
     /**
    * @param tidak da
    * @return null yang berarti tidak ada
    */
  public Pesanan getPesanan() {
   return pesanan_sekarang;}
    /**
    * @param nothing 
    * @return pisisiSekarang
    */
  public Lokasi getPosisi() {
    return posisiSekarang;}
     /**
    * @param nothing 
    * @return status yang berisi status saat ini 
    */
  public StatusOjek getStatus() {
    return status;}
     /**
    * @param nothing 
    * @return nothing 
    */
  public void printData() {
      System.out.println("Nama Ojek : "+ nama);
      System.out.println("ID Ojek : "+ id);
      System.out.println("Status Ojek : "+ status);
    } 
  
}
