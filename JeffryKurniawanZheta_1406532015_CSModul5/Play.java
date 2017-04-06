import java.util.Random;
/**
 * Write a description of class Play here.
 * 
 * @author Jeffry Kurniawan Zheta 
 * @version 6/4/2017
 */
public class Play
{
    // instance variables - replace the example below with your own
    private Hero player ;
    private Monster enemy;
    private Random rand;
    private int enemyCount;
    /**
     * Constructor for objects of class Play
     */
    private Play()
    {

       initialize();
       System.out.println("Let the war begin!" +
       "\nHero = " + player.getName() + ", level = " + player.getLevel() +
       "\nEnemy = " + enemy.getName() + ", level = " + player.getLevel());
       for (int i = 1; !player.isDead(); i++)
       {   
           print(i);
           // kode anda
           if (enemy.isDead())
           {
               System.out.println("Enemy died! get ready to face the new one!");
               // kode anda
               System.out.println("Congrats you are leveled up! your Level = " + player.getLevel());
            }
        }
        System.out.println("Hero mati pada level " + player.getLevel());
   }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private void initialize()
    {
        // put your code here
       rand = new Random();
       player = new Hero("Zheta",1);
       setRank(player.getName(),100);
       player.setWeapon("Samurai",50);
       player.setArmor("Snake Skin",50);
       enemyCount = 1;
       initializeEnemy();
    }
    private void initializeEnemy()
    {
        // put your code here
       enemy = new Monster("Kaneki",enemyCount);
       enemy.setRank(setRank(enemy.getName(),(rand.nextInt(50)+50)));
       enemy.setWeapon("Spear",(rand.nextInt(25)+5));
       enemy.setArmor("Wood",(rand.nextInt(25)+5));
    }
    private void print(int i)
    {
        // put your code here
        System.out.println("\nRound = " + i +
       "\nKill count = " + (enemyCount - 1) +
       "\nHero health = " + player.getHP() + ", Enemy health = " + enemy.getHP());
    }
    private Rank setRank(String name,int power){
//       if(player.getLevel()== 1 || player.getLevel() == 4 || player.getLevel() == 7)
//        {
//            return new Normal(name,power);
//        }
//        
//        else if(player.getLevel()== 2 || player.getLevel() == 5 || player.getLevel() == 8)
//        {
//            return new Tank(name,power);
//        }
//        
//        else if(player.getLevel()== 3 || player.getLevel() == 6 || player.getLevel() == 9)
//        {
//            return new Damager(name,power);
//        }
return null;
    }
    
    private void attackTurn(Entity attacker, Entity defender)
    {
        // put your code here
        
    }
    public void main(String[] args)
    {
        // put your code here
        
    }
}
