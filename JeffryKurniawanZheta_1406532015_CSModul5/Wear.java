
/**
 * Write a description of interface Wear here.
 * 
 * @author Jeffry Kurniawan Zheta 
 * @version 6/4/2017
 */
public interface Wear
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param name untuk nama senjata 
     * @param dmg untuk damage yang dimiliki
     * @return nothing 
     */
    public void setWeapon(String name, double dmg);
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    public String getWeapon();
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  name untuk nama armor
     * @param def untuk kemampuan bertahan
     * @return nothing  
     */ 
    public void setArmor(String name, double def);
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    public String getArmor();
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    public double getWeaponDmg();
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    public double getArmorDef();
    
}
