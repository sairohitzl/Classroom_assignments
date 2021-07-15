package sai.assignment;

public class Singleton 
{
    String str;

    public static Singleton init(String s)
    {
      str=s;
      return (new Singleton());
    }

    public void printString()
    {
        System.out.println(str);
    }
}
   