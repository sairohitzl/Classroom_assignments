package assignment7.rodent;

public class Gerbil extends Rodent 
{
    public Gerbil()
    {
        System.out.println("gerbil called.");
    }
    @Override
    public void eat()
    {
        System.out.println("eats dry grass,grains,insects");
    }
    @Override
    public void lives()
    {
        System.out.println("burrows in fields");
    }
}
