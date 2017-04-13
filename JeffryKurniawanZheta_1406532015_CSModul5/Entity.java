
/**
 * Abstract Class Entity - Write a description of class Entity here.
 * 
  * @author Jeffry Kurniawan Zheta 
 * @version 6/4/2017
 */
public abstract class Entity implements Wear
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
         this.name = name;
        this.level = level;
        fullHP();
    }
    
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    
    protected void levelUp(){
        level += 1;
        fullHP();
    }
        
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  tiff digunakan untuk melihat apakah player masih bisa bermain atau healthnya sudah habis
     * @return nothing  
     */ 
    protected void setHP(double diff){
     health -= (int) diff;
        if(health <= 0){
            dead = true;
        }
}
    
 /**
     * An example of a method - replace this comment with your own
     * 
     * @param  def yang merupakan defense dari musuh
     * @param opRank adalah rank dari opponent (musuh) 
     * @return damage merupakan damage yang dihasilkan
     */     
protected int getDamage(double def, double opRank){
    int power=1;
    return(int)(1+((((2*level)/5)+2)*getRank().getAttackPower()*(int)(attack/defense)/50)*def*opRank);
}
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    protected void setPower() {
    double attack = strength * (1+ (weaponDmg/100));
    double defense = strength* (1+ (armorDef/100));
} 
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return name untuk nama dari monster maupun hero  
     */ 
    protected String getName() {
    return name;}
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return level yang digunakan untuk perhitungan damage dll
     */ 
    protected int getLevel(){
    return level;} 
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return maxHP untuk melihat health dari player 
     */ 
    protected int getHP() {
    return maxHP;} 
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return dead untuk melihat apakah player sudah mati atau belum (pengecekan)  
     */ 
    protected boolean isDead() {
    return dead;} 
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  rank yang merupakan Rank yang musuh atau rank hero
     * @return nothing  
     */ 
   protected void setRank(Rank rank) {
   this.rank = rank; }
     /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return rank  yang merupakan Rank yang musuh atau rank hero
     */ 
   protected Rank getRank() { 
   return rank;} 
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return attack merupakan kekuatan attack  
     */ 
    protected double getAttack() {
    return attack;} 
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return defense kekuatan bertahan 
     */ 
    protected double getDefense() {
    return defense;} 
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  name untuk nama senjata 
     * param dmg untuk damage yang dimiliki
     * @return nothing
     */ 
    public void setWeapon(String name, double dmg){
     weaponDmg = dmg;
    setPower();} 
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return weapon untuk nama senjata 
     */ 
    public String getWeapon(){
    return weapon;} 
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  name untuk nam armor 
     * @param def untuk kemampuan bertahan dri armor 
     * @return nothing  
     */ 
    public void setArmor(String name, double def){
   armorDef = def;
    setPower();} 
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return armor yang merupakan nama armor   
     */ 
    public String getArmor(){
    return armor;} 
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return weaponDmg adalah damage dari sebuah senjata   
     */ 
    public double getWeaponDmg() {
    return weaponDmg;} 
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return armorDef adalah kemampuan bertahan dari senjata 
     */ 
    public double getArmorDef() {
    return armorDef;} 
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    protected void fullHP(){} 
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    protected void quote(){} 
    

  
    
}
