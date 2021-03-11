import java.util.Random;

public class MonsterData
{
   // variable creation
   private String monsterName;// monsters name
   private double monsterMaxHealth;// amount of health monster has
   private double monsterMaxMana;// amount of mana monster has
   private int monsterDef;// monsters defence
   private int monsterStr;// strength statistic of monster
   private int monsterDex;// dexterity statistic of monster
   private int monsterInt;// intelligence statistic of monster

   public MonsterData(int monsterIndex)
   {
      Random randPick = new Random();

      switch (monsterIndex)
      {
         case 0:
            this.monsterName = "Dracula the Vampire";
            this.monsterMaxHealth = randPick.nextInt(400) + 300;
            this.monsterMaxMana = randPick.nextInt(50) + 100;
            this.monsterDef = randPick.nextInt(10) + 3;
            this.monsterStr = randPick.nextInt(10) + 3;
            this.monsterDex = randPick.nextInt(10) + 3;
            this.monsterInt = randPick.nextInt(10) + 3;
            break;
         case 1:
            this.monsterName = "Thraal the Orc";
            this.monsterMaxHealth = randPick.nextInt(400) + 300;
            this.monsterMaxMana = randPick.nextInt(50) + 100;
            this.monsterDef = randPick.nextInt(4) + 3;
            this.monsterStr = randPick.nextInt(10) + 3;
            this.monsterDex = randPick.nextInt(4) + 1;
            this.monsterInt = randPick.nextInt(3) + 1;
            break;
         case 2:
            this.monsterName = "Thane the Vampire";
            this.monsterMaxHealth = randPick.nextInt(400) + 300;
            this.monsterMaxMana = randPick.nextInt(50) + 100;
            this.monsterDef = randPick.nextInt(10) + 3;
            this.monsterStr = randPick.nextInt(10) + 3;
            this.monsterDex = randPick.nextInt(8) + 3;
            this.monsterInt = randPick.nextInt(10) + 5;
            break;
         case 3:
            this.monsterName = "Anduin the Dragon";
            this.monsterMaxHealth = randPick.nextInt(400) + 300;
            this.monsterMaxMana = randPick.nextInt(50) + 100;
            this.monsterDef = randPick.nextInt(10) + 9;
            this.monsterStr = randPick.nextInt(10) + 9;
            this.monsterDex = randPick.nextInt(10) + 9;
            this.monsterInt = randPick.nextInt(10) + 9;
            break;
      }

   }

   public String getMonsterName()
   {
      return this.monsterName;
   }

   public double getMaxHealth()
   {

      return this.monsterMaxHealth;
   }

   public double getMaxMana()
   {

      return this.monsterMaxMana;
   }

   public int getMonsterDef()
   {

      return this.monsterDef;
   }

   public int getMonsterStr()
   {

      return this.monsterStr;
   }

   public int getMonsterDex()
   {

      return this.monsterDex;
   }

   public int getMonsterInt()
   {

      return this.monsterInt;
   }

}