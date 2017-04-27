
/**
 * Write a description of class SistemPengawas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SistemPengawas implements Runnable
{
    // instance variables - replace the example below with your own
    private Thread t;
    private String ThreadName;
    private static boolean program_run;
    private int waktu_cek;

    /**
     * Constructor for objects of class SistemPengawas
     */
    public SistemPengawas (String name, int waktu_cek) 
    {
        // initialise instance variables
        this.ThreadName=name;
        this.waktu_cek=waktu_cek;
        this.program_run=true;
        System.out.println("Creating " + ThreadName);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void run()
    {
        // put your code here
        while(program_run){
            System.out.println("Running " + ThreadName );
            
            try{
                  Thread.sleep(waktu_cek);
                  Administrasi.jalankanSistemPenugas();  
                    }catch(InterruptedException e){
                   System.out.println("Thread " + ThreadName + " interrupted.");
                }
        } 
        System.out.println("Thread " +  ThreadName + " exiting." );
    }
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void start()
    {
        // put your code here
       
        System.out.println( "Starting " +  ThreadName );
        if(t==null){ 
            t = new Thread (this, ThreadName);
            t.start();
        }
     } 
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void join() throws Exception
    {
        // put your code here
        try {
            t.join();
            
        } catch (InterruptedException e) { 
          System.out.println("false");   
        } 
    }
    
    public static void exit() {
        program_run=false;
    }
}
