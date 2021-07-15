package sai.assignment;

public class Main 
{
public static void  main(String[] args) 
{
    
    Data dataObj= new Data();
    dataObj.printData();                        // works
    //dataObj.printDemo();                  // does not work because local variable's need to be initialized
    Singleton s1=Singleton.init("demo");             
                                        //Cannot make a static reference to the non-static field str
    s1.printString();


}
}
