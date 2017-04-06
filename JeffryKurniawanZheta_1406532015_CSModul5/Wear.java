
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
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    public void setWeapon(String name, double dmg);
    public String getWeapon();
    public void setArmor(String name, double def);
    public String getArmor();
    public double getWeaponDmg();
    public double getArmorDef();
    
}
