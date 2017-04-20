class Tampilkan implements Runnable{
 
 
@Override
 
public void run(){
 
for(int i =0; i<5; i++){
 
System.out.println(i);
 
try{
 
Thread.sleep(100);
 
}catch(InterruptedException e){
 
e.printStackTrace();
 
}
 
}
 
}
 
 }
 
 
 
public class ContohThread {
 
public static void main(String[] args){
 
Thread tampil1 =new Thread(new Tampilkan());
 
tampil1.start();
 
 
 
Thread tampil2 =new Thread(new Tampilkan());
 
tampil2.start();
 
}
 
}
