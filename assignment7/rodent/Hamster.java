package assignment7.rodent;

public class Hamster extends Rodent
{
   public Hamster()
   {
       System.out.println("hamster called");
   }
   @Override
   public void eat()
   {
        System.out.println("eats grams/nuts");
   }
   @Override
   public void lives()
   {
        System.out.println("lives in wheels");
   }

}
