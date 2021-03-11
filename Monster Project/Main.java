import java.util.Scanner;

public class Main
{

   public static void main(String[] args)
   {
      new Main();

   }

   public Main()
   {  
      boolean canFight=true;
      double playerhealth = 2;
      double playerattack = 30;
      findCreature();
      while(canFight==true) {
      canFight=fight();
      //TODO enemy attack method here
      }
   }

   private void findCreature()
   {
     
      System.out.println("A wild Creature Appears!");
      wsleep(1500);
      Monster mS = new Monster(0, 0);
      wsleep(1500);
      
   }

   private void wsleep(int sleepTime)
   {
      try
      {
         Thread.sleep(sleepTime);
      }
      // handle errors created by printing out our stack trace
      catch (InterruptedException e)
      {
         e.printStackTrace();
      }

   }
   private boolean fight() {
      Scanner input = new Scanner(System.in);
      boolean canFight = true;
      System.out.println("Type attack to attack or type run to run Away");
      String playerResponse = input.nextLine();
      while (!playerResponse.equals("attack")&&!playerResponse.equals("run"))
      {
         System.out.println("incorrect response either enter attack or run");
          playerResponse = input.nextLine();

      }
      if(playerResponse.equals("attack")) {
         
         System.out.println("bang");
         //TODO attack method here
        
         
      }
      else if(playerResponse.equals("run")) {
         
         System.out.println("run like the wind bullseye!");
        canFight=false;
         //TODO run method here
      }
      return canFight;

   }
}
