import java.io.File;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class FileSearch 
{

    static Pattern pt=Pattern.compile("^[a-zA-Z0-9]+$");
    static Matcher mt;

    public static void printFileNames(String directory) throws Exception
    {
        File dir = new File(directory);
        File[] fileNames = dir.listFiles();


        if(fileNames != null && fileNames.length > 0)
        {
            for(File file : fileNames)
            {
                if(file.isDirectory())
                {
                    printFileNames(file.getAbsolutePath());
                }
                else 
                {
                    mt = pt.matcher(file.getName());
                    if(mt.matches())
                    {
                        System.out.println("file name: "+file.getName()+" abolute path is: "+file.getAbsolutePath());
                    }
                    
                }
            }
        }
    }
        
      
       
       

        /*while(directory!="" || directory!=null) 
        {
            File dir=new File(directory);
            for(File fr:dir.listFiles())
            {
        
                mt = pt.matcher(fr.getName());
                if(mt.matches())
                    {
                        System.out.println("file name: "+fr.getName()+" abolute path is: "+fr.getAbsolutePath());
                    }

            }
            directory=sc.nextLine();
       

        }
        sc.close();
    }*/

    public static void main(String[] args) 
    {
    
    try
    {    
    Scanner sc=new Scanner(System.in);
    String directory=sc.next();
    printFileNames(directory);
    sc.close();
    }
    catch(Exception ex)
    {
        System.out.println("exited");
    }
}
}

