package assignment7.rodent;

public class Mouse extends Rodent
{
    public Mouse()
    {
        System.out.println("mouse called");
    }
    @Override
    public void eat()
    {
        System.out.println("eats cheese");
    }    
    @Override
    public void lives()
    {
        System.out.println("lives in cracks and holes");
    }

}
