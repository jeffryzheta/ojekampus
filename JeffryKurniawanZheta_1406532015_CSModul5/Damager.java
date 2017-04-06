
/**
 * Write a description of class Damager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Damager implements Rank
{
    // instance variables - replace the example below with your own
    private String attackName;
    private int attackPower;
    private static double rank = 1.25;

    /**
     * Constructor for objects of class Damager
     */
    public Damager(String name, int power)
    {
        // initialise instance variables
        attackName = name;
        attackPower = power;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  name untuk nama serangan
     * @return nothing
     */
    public void setAttack(String name){
        
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing 
     * @return attackName nama  untuk serangan
     */
    public String getAttackName(){
        return attackName;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  power kekuatan untuk serangan
     * @return nothing
     */
    public void setAttackPower(int power){
        
    }
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param nothing
     * @return attackPower kekuatan serangan
     */
    public int getAttackPower(){
        return attackPower;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param nothing
     * @return rank kenaikan rankz
     */
    public double getRank(){
        return rank;
    }
}
