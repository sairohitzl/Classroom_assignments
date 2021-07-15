package assignment7;
import assignment7.cycle.*;
import assignment7.cycleInterface.*;
import assignment7.innerclasses.*;
import assignment7.rodent.*;
import assignment7.Interfaces.MainClass;


public class MainDriver {
    public static void main(String[] args) {
        Rodent[] rodents = new Rodent[3];
        rodents[0] = new Mouse();
        rodents[1] = new Gerbil();
        rodents[2] = new Hamster();

        for (Rodent rodent : rodents) {
            rodent.eat();
            rodent.lives();
        }

        Cycle[] cycles = new Cycle[3];
        cycles[0] = new Unicycle();
        cycles[1] = new Bicycle();
        cycles[2] = new Tricycle();

        // Upcasting gives us the flexibility to access the parent class members but it is not possible
        // to access all the child class members using this feature.
        /*
        cycles[0].balance();
        cycles[1].balance();
        cycles[2].balance();
         */

        Unicycle cycle1 = (Unicycle) cycles[0];
        Bicycle cycle2 = (Bicycle) cycles[1];
        //Tricycle cycle3 = (Tricycle) cycles[2];

        cycle1.balance();
        cycle2.balance();
        // cannot call balance in Tricycle class because, Both Cycle and Tricycle doesn't have balance method.
        //cycle3.balance();

        MainClass obj = new MainClass();
        obj.method1WithParameter(obj);
        obj.method2WithParameter(obj);
        obj.method3WithParameter(obj);
        obj.method4WithParameter(obj);

        Unicycle2 uniCycle = new Unicycle2();
        uniCycle.factory();
        Bicycle2 biCycle = new Bicycle2();
        biCycle.factory();
        Tricycle2 triCycle = new Tricycle2();
        triCycle.factory();

        new NewOuterClass.NewInnerClass();
    }
}
