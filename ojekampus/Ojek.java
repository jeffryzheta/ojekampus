
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
 
  public Ojek(int id, String nama, Lokasi posisi_sekarang){
      this.id=id;
      this.nama=nama;
      this.posisiSekarang=posisiSekarang;
      
    }
  public void setID(int id) {
     this.id=id;
    }
  public void setNama(String nama){ 
      this.nama=nama;
    } 
  public void setPesanan(Pesanan pesan) {
     pesanan_sekarang=pesan;
    } 
    
  public void setPosisi(Lokasi sekarang){ 
    posisiSekarang=sekarang;
    } 
  public void setStatus(String status){
    this.status="idle";
} 
  public int getID(){ 
    return 0;}
  public String getNama(){
    return nama; } 
  public Pesanan getPesanan() {
   return null;} 
  public Lokasi getPosisi() {
    return posisiSekarang;} 
  public String getStatus() {
    return status;} 
  public void printData() {
      System.out.println("Nama Ojek : "+ getNama());
      System.out.println("ID Ojek : "+ getID());
      System.out.println("Status Ojek : "+ getStatus());
    } 
  
}
