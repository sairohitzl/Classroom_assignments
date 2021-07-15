package Assignment8;
import java.util.Scanner;
public class Driving {
    public void enterConditions()
    {
        Scanner sc=new Scanner(System.in);
        try{
        
        System.out.println("enter age: ");
        int age=sc.nextInt();
        if(age<18)
        {
            throw new MinorException("age should be above 18");
        }

        System.out.println("enter alcohol level: ");
        double alcoholLevel=sc.nextDouble();
        if(alcoholLevel>28.1)
        {
            throw new DrunkAndDriveException("arrested & vehicle seized & counselling");
        }

        System.out.println("enter documents status: ");
        char c=sc.next().charAt(0);
        
        if(c=='N' || c=='n')
        {
            throw new NoDocumentsException("vehicle seized visit court and pay fine");
        }
        
    }

    catch(Exception e)
    {
        System.out.println(e);
    }

    finally
    {
        System.out.println("judicial procedure will we undertaken");
    }
    
}
public static void main(String[] args) {
    Driving drv=new Driving();
    drv.enterConditions();
}
}
