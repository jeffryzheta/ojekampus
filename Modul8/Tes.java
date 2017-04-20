
import java.util.Random;
/**
 * Write a description of class Play here.
 * 
 * @author Jeffry Kurniawan Zheta 
 * @version 6/4/2017
 */
public class Tes {
   private static Random rand;
   private static int tomiDelay=0,tomaDelay=0,tomoDelay=0;
       
   
    public static void main(String[] args){
        rand = new Random();
        String nama1 = "Tomi";
        String nama2 = "Toma";
        String nama3 = "Tomo";
        do {
            tomoDelay = rand.nextInt(100) + 1;
        }while(tomoDelay > 100);
        
        do{
            tomaDelay = rand.nextInt(100) + 1;
        }while(tomaDelay > tomoDelay);
        
        do{
            tomiDelay = rand.nextInt(100) + 1;
        }while(tomiDelay < tomaDelay || tomiDelay < tomoDelay);
        
        Thread tampil1 =new Thread(new LombaHitung(nama1, tomiDelay));
         
        tampil1.start();
         
        Thread tampil2 =new Thread(new LombaHitung(nama2, tomaDelay));
         
        tampil2.start();
        
        Thread tampil3 = new Thread(new LombaHitung(nama3, tomoDelay));
        tampil3.start();
     
    }
 
}