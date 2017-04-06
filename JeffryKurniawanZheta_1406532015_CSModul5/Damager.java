import java.lang.*;
/**
 * Write a description of class Damager here.
 * 
 * @author Jeffry Kurniawan Zheta 
 * @version 6/4/2017
 */
public abstract class Damager implements Rank
{
    // instance variables - replace the example below with your own
    private String attackName;
    private int attackPower;
    private static double rank=1.25;

    /**
     * Constructor for objects of class Damager
     */
    public Damager (String name, int power )
    {
        // initialise instance variables
        
    }
    public void setAttackName(String name) {} 
    public String getAttackName() {
    return attackName;}
    public void setAttackPower(int power){} 
    public int getAttackPower(){
    return attackPower;} 
    public double getRank(){
    return rank;} 
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
 
}
