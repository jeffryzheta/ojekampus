
/**
 * Abstract class Hero - write a description of the class here
 * 
 * @author Jeffry Kurniawan Zheta 
 * @version 6/4/2017
 */
public class  Monster extends Entity
{
    // instance variables - replace the example below with your own
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
    */
    public Monster(String name, int level){
        super(name,level);}
    
    public void quote(){
    System.out.println("I am the strongest Monster");}
    
    public void fullHP(){
      maxHP = ((level^2)/10)+5;
      strength = (((level^2)/10)+5)/2;
    } 

  
}
