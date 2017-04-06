
/**
 * Write a description of class Tank here.
 * 
 * @author Jeffry Kurniawan Zheta 
 * @version 6/4/2017
 */
public abstract class Tank implements Rank
{
    // instance variables - replace the example below with your own
    private String attackName;
    private int attackPower;
    private static double rank=0.8;
    /**
     * Constructor for objects of class Tank
     */
    public Tank(String name, int power)
    {
        // initialise instance variables
       
    }

    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setAttackName(String name) {} 
    public String getAttackName() {
    return attackName;}
    public void setAttackPower(int power){} 
    public int getAttackPower(){
    return attackPower;} 
    public double getRank(){
    return rank;} 
    
}
