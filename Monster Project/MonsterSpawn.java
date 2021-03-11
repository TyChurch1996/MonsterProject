
import java.util.Random;

public class MonsterSpawn
{
   protected String monsterName;// monsters name
   protected double monsterMaxHealth;// amount of health monster has
   protected double monsterMaxMana;// amount of mana monster has
   protected int monsterDef;// monsters defense
   protected int monsterStr;// strength statistic of monster
   protected int monsterDex;// dexterity statistic of monster
   protected int monsterInt;// intelligence statistic of monster
   protected int monsterIndex;
   private Random randPick;

   public MonsterSpawn()
   {
      randPick = new Random();

   }

   protected final void updateRandomMonster()
   {
      this.monsterIndex = randPick.nextInt(4);

   }

   protected void spawnMonster(int monsterIndex, double monsterX, double monsterY)
   {

      Monster spawn1 = new Monster(monsterIndex, monsterX, monsterY);

   }

   protected void spawnMonster(double monsterX, double monsterY)
   {

      Monster spawn1 = new Monster(monsterIndex, monsterX, monsterY);

   }

   protected void printStats()
   {
      System.out
               .printf("Monster Index: %-6d \nMonster Name: %-6s \nMonster Max Health: %-6s \nMonster Max Mana: %-6s\nMonster Max Def: %-6s\nMonster Max Str: %-6s\nMonster Max Dex: %-6s\nMonster Max Int: %-6s\n",
                       this.monsterIndex, this.monsterName, this.monsterMaxHealth,
                       this.monsterMaxMana, this.monsterDef, this.monsterStr,this.monsterDex,this.monsterInt);

   }

   protected void updateMonsterDetails(int monsterIndex)
   {
      MonsterData md = new MonsterData(monsterIndex);

      this.monsterName = md.getMonsterName();
      this.monsterDef = md.getMonsterDef();
      this.monsterMaxHealth = md.getMaxHealth();
      this.monsterMaxMana = md.getMaxMana();
      this.monsterStr = md.getMonsterStr();
      this.monsterDex = md.getMonsterDex();
      this.monsterInt = md.getMonsterInt();

   }

}
