import java.util.*;
public class InputStringChecker
{
   private static final char[] alphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
   private static final HashSet<Character> mySet = new HashSet(Arrays.asList(alphabets));


   public boolean checker(String input)
   {
    input=input.toLowerCase();
     int stringLength=input.length();
     for(int i=0;i<stringLength;i++)
     {
         if(input.charAt(i)==' ')
         {
             continue;
         }
         if(!mySet.contains(input.charAt(i)))
         {
            return false;
         }
     }
     return true;
   }          

   // time complexity is O(N)

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String userInput=sc.nextLine();
        sc.close();
        InputStringChecker isc=new InputStringChecker();
        boolean result=isc.checker(userInput);
        if(result)
        {
            System.out.println("input string contains every known alphabet");
        }
        else
        {
            System.out.println("does not contain every alphabet try again!");
        }
        
    }
}
