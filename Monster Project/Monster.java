import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public class Monster extends MonsterSpawn
{

   public Monster(double monsterX, double monsterY)
   {
      super.updateRandomMonster();
      super.updateMonsterDetails(this.monsterIndex);
     super.printStats();
   }

   public Monster(int monsterIndex, double monsterX, double monsterY)
   {
      super.updateMonsterDetails(this.monsterIndex);
      super.printStats();
   }

   private void monsterRoar(int tempMonsterIndex)
   {
      System.out.println(tempMonsterIndex);
   }
}
