
/**
 * Write a description of class Play here.
 * 
 * @author Jeffry Kurniawan Zheta 
 * @version 6/4/2017
 */
class LombaHitung implements Runnable{
  
    private String nama;
    private int delay;
    private int hitung;
    
    public LombaHitung(String nama, int delay)
    
    { 
        this.nama=nama;
        this.delay=delay;
        hitung= 0; 
        System.out.println(nama+ " hadir"); 
        System.out.println(nama + " bersiap");
    }
    @Override
     
    
    public void run(){
       System.out.println(nama + " mulai menghitung");
     for(int i =0; i<24; i++){
     
     System.out.println("Kontestan " + nama + " menghitung " + i);
     try{
     Thread.sleep(delay);
     }catch(InterruptedException e){
     e.printStackTrace();
     }}
     System.out.println("Kontestan " + nama + " selesai menghitung ");
    }
    
    public String getNama(){
        return nama; 
    }
     
    public int getDelay(){
        return delay; 
    }
}
 
 
 

