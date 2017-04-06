
/**
 * Write a description of class Entity here.
 * 
  * @author Jeffry Kurniawan Zheta 
 * @version 6/4/2017
 */
public class Entity implements Wear
{
    // instance variables - replace the example below with your own
    protected String name;
    protected String weapon; 
    protected String armor;
    protected int level;
    protected int health;
    protected int maxHP;
    protected int strength;
    protected double weaponDmg;
    protected double armorDef;
    protected double attack;
    protected double defense;
    protected boolean dead;
    protected Rank rank;
    

    /**
     * Constructor for objects of class Entity
     */
    public Entity(String name, int level )
    {
        // initialise instance variables
        
        fullHP();
    }
    
    protected void levelUp(){
    level = level+1;}
        
    protected void setHP(double diff){
    this.health= health;
}
    
    protected int getDamage(double def, double opRank){
    double damage = (1+ (((((2*level)/5)+2)*attack*(weaponDmg/armorDef))/50))*opRank*def;
    return (int) damage;
}
    
    protected void setPower() {
    double attack = strength * (1+ (weaponDmg/100));
    double defense = strength* (1+ (armorDef/100));
} 
    
    protected String getName() {
    return name;}
    
    protected int getLevel(){
    return level;} 
    
    protected int getHP() {
    return maxHP;} 
    
    protected boolean isDead() {
    return dead;} 
    
   protected void setRank(Rank rank) {}
    
   protected Rank getRank() { 
   return rank;} 
    
    protected double getAttack() {
    return attack;} 
    
    protected double getDefense() {
    return defense;} 
    
    public void setWeapon(String name, double dmg){
    setPower();} 
    
    public String getWeapon(){
    return weapon;} 
    
    public void setArmor(String name, double def){
    setPower();} 
    
    public String getArmor(){
    return armor;} 
    
    public double getWeaponDmg() {
    return weaponDmg;} 
    
    public double getArmorDef() {
    return armorDef;} 
    
    protected void fullHP(){} 
    
    protected void quote(){} 
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    
}
