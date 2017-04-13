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
       int i;
       initialize();
       System.out.println("Let the war begin!" +
       "\nHero = " + player.getName() + ", level = " + player.getLevel() +
       "\nEnemy = " + enemy.getName() + ", level = " + player.getLevel());
       for (i = 0; !player.isDead(); i++)
       {   
           print(i);
           // kode anda
           if (enemy.isDead())
           {
               System.out.println("Enemy died! get ready to face the new one!");
               // kode anda
               player.levelUp();
               System.out.println("Congrats you are leveled up! your Level = " + player.getLevel());
                enemyCount++;
                initializeEnemy();
                i = 0;
            }
        }
        System.out.println("Hero mati pada level " + player.getLevel());
   }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing 
     * @return  nothing
     */
    private void initialize()
    {
        // put your code here
       rand = new Random();
       player = new Hero("Zheta",1);
       player.setRank(setRank(player.getName(), 1));
       player.setWeapon("Samurai",50);
       player.setArmor("Snake Skin",50);
       enemyCount = 1;
       initializeEnemy();
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    private void initializeEnemy()
    {
        // put your code here
       enemy = new Monster("Kaneki",enemyCount);
       enemy.setRank(setRank(enemy.getName(),(rand.nextInt(50)+50)));
       enemy.setWeapon("Spear",(rand.nextInt(25)+5));
       enemy.setArmor("Wood",(rand.nextInt(25)+5));
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    private void print(int i)
    {
        // put your code here
       System.out.println("\nRound = " + i + "\nKill count = " + (enemyCount - 1) +
            "\nHero health = " + player.getHP() + ", Enemy health = " + enemy.getHP());
        if(i % 2 == 0){
            System.out.println("Hero Menyerang");
            player.quote();
            attackTurn(player, enemy);
        }
        else{
            System.out.println("Monster Menyerang");
            enemy.quote();
            attackTurn(enemy, player);
        }
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  name untuk nama hero  
     * @param power untuk perhitungan kekuatan
     * @return rank untuk melihat pertambahan rank 
     */ 
    private Rank setRank(String name,int power){
     if(player.getLevel() == 1 || ((player.getLevel() % 3) - 1 == 0)){
            return new Normal(name, power);
        }
        else if(player.getLevel() == 2 || ((player.getLevel() % 3) - 2 == 0)){
            return new Tank(name, power);
        }
        else if(player.getLevel() == 3 || ((player.getLevel() % 3) == 0)){
            return new Damager(name, power);
        }
        else return null;
       
    }
    
   /**
     * An example of a method - replace this comment with your own
     * 
     * @param  nothing
     * @return nothing  
     */ 
    public static void main(String[] args)
    {
        // put your code here
          Play newGame = new Play();
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  attacker dari class entity (penyerang)
     * @param  defender dari class entity (bertahan)
     * @return nothing  
     */ 
     private void attackTurn(Entity attacker, Entity defender)
    {
        // put your code here
        defender.setHP(attacker.getDamage(attacker.getRank().getRank(), defender.getRank().getRank()));
        System.out.println("Damage = " + attacker.getDamage(attacker.getRank().getRank(), defender.getRank().getRank()));
    }
    
}
