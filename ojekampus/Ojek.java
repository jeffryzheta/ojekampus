
/**
 * Write a description of class OjeKampus here.
 * Class ini untuk mengisi databaseUser dari class lain   
 * @author Jeffry Kurniawan Zheta
 * @version 3/4/2017
 */
import java.util.Date;
import java.util.regex.*;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat; 

public class Ojek extends User
{
          private StatusOjek status;
          private Lokasi posisiSekarang;
          private Pesanan pesanan_sekarang;
          private int id;
          private String nama, email, no_plat, telepon;
          private GregorianCalendar newCalendar;
          private Date dob;
      
  
       /**
        * @param id yang telah di set
        * @param nama yang telah diset 
        * @param posisi_sekarang yang telah di set
        * @return nothing 
        */
      public Ojek(int id, String nama, Lokasi posisi_sekarang){
          super(id,nama);
          this.posisiSekarang=posisiSekarang;
        }
//          /**
//         * @param id yang telah di set 
//         * @return nothing 
//         */
//       public void setID(int id) {
//          this.id=id;
//         }
//          /**
//         * @param nama yang telah di set 
//         * @return nothing 
//         */
//       public void setNama(String nama){ 
//           this.nama=nama;
//         } 
//           /**
//         * @param nama yang telah di set 
//         * @return nothing 
//         */
//       public boolean setTelefon(String telepon){ 
//           Pattern pattern = Pattern.compile("0[0-9]{2}([0-9-][0-9]{2,4}){2,3}");
//           Matcher matcher = pattern.matcher(telepon);
//           this.telepon=telepon;
//           if(matcher.matches()){
//               return true;
//             }
//               else {
//           return false;
//         }
//         } 
//           /**
//         * @param nama yang telah di set 
//         * @return nothing 
//         */
//       public boolean setEmail(String email){ 
//           Pattern pattern = Pattern.compile("[a-zA-Z]+[a-z]+[@]+[a-z]+.[a-z]+");
//           Matcher matcher = pattern.matcher(email);
//           this.email=email;
//           if(matcher.matches()){
//               return true;
//             }
//               else {
//           return false;
//         }
//         } 
//           /**
//         * @param nama yang telah di set 
//         * @return nothing 
//         */
//      public void setDOB(int day, int month, int year){ 
//         
//         newCalendar = new GregorianCalendar(year, month, day);
//      
//     } 
//           /**
//         * @param nama yang telah di set 
//         * @return nothing 
//         */
      public boolean setNoPlat(String no_plat){ 
          Pattern pattern = Pattern.compile("[A-Z]{1,2}[1-9][0-9]{1,3}[A-Z]{1,3}");
          Matcher matcher = pattern.matcher(no_plat);
          this.no_plat=no_plat;
          if(matcher.matches()){
              return true;
            }
              else {
          return false;
        } }
          /**
        * @param nama yang telah di set 
        * @return nothing 
        */
      public void setStatus(StatusOjek status){ 
          this.status=status;
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
//      /**
//         * @param nothing
//         * @return 0 yang tidak berisi 
//         */
//       public int getID(){ 
//         return id;}
//          /**
//         * @param nothing
//         * @return nama yang sduah diisi 
//         */
//       public String getNama(){
//         return nama; }
//           /**
//         * @param nothing
//         * @return nama yang sduah diisi 
//         */
//     public String getTelefon(){
//       return telepon; }
//           /**
//         * @param nothing
//         * @return nama yang sduah diisi 
//         */
//       public String getEmail(){
//         return email; }
//           /**
//         * @param nothing
//         * @return nama yang sduah diisi 
//         */
//       public Date getDOB(){
//           int year = newCalendar.get(newCalendar.YEAR);
//           int month = newCalendar.get(newCalendar.MONTH);
//           int dayOfMonth  = newCalendar.get(newCalendar.DAY_OF_MONTH);
//           dob =newCalendar.getTime();
//           SimpleDateFormat format = new SimpleDateFormat("yyyy MMM dd");
//           System.out.println("Tampilkan Date manual" );
//           System.out.println(year+"/"+month+"/"+dayOfMonth);
//           System.out.println("Tampilkan tanggal dengan SimpleDateFormat yyyy MM dd");
//           System.out.println(format.format(dob));
//           format = new SimpleDateFormat("yyyy--MMM--dd");
//           System.out.println("Tampilkan tanggal dengan SimpleDateFormat yyy--MM--dd");
//           System.out.println(format.format(dob));
//           return dob; }
//           /**
//         * @param nothing
//         * @return nama yang sduah diisi 
//         */
      public String getNoPlat(){
        return no_plat; }
    
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
    //      /**
    //     * @param nothing 
    //     * @return nothing 
    //     */
    //   public void printData() {
    //       System.out.println("Nama Ojek : "+ nama);
    //       System.out.println("ID Ojek : "+ id);
    //       System.out.println("Status Ojek : "+ status);
    //     } 
      public String toString() { 
            String str = new String();
//           if (pesanan_sekarang==null) {
//               return "nama Ojek : "+ nama +" . Status Ojek : " +status+ ". Ojek: " + id + " Nomer Plat "+no_plat ;
//             }
//           else 
//           { 
//               return "nama Ojek : " + nama + ". Status Ojek : " + status + ", id Ojek: " +id + " Nomer Plat "+no_plat+" , Nama Pelanggan : "+ pesanan_sekarang.getPelanggan().getNama();
//     
//             }
        return str;
        }
}

