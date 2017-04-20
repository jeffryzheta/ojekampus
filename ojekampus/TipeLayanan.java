
/**
 * Enumeration class TipeLayanan - write a description of the enum class here
 * 
 * @author Jeffry Kurniawan Zheta
 * @version (version number or date here)
 */
public enum TipeLayanan
{
  AntarOrang("Antar Orang"),
  AntarBarang("Antar Barang"),
  BeliBarang("Beli Barang");  
  
  private String deskripsi;
  
  TipeLayanan (String deskripsi) 
  {
     this.deskripsi=deskripsi;
  }
    
  public String getdeskripsi()
  {
     return deskripsi;
  }
  
  public String toString()
  {
     return deskripsi;
  }
}
