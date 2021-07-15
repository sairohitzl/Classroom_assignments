package Assignment10;
public class Assignment10 
{
    public static void main(String[] args){
        SList<String> sl = new SList<String>();
        System.out.println(sl);
        SListIterator<String> slIter = sl.iterator();
        slIter.insert("One");
        slIter.insert("Two");
        slIter.insert("Three");
        slIter.insert("Four");
        slIter.insert("Five");
        System.out.println(sl);
        SListIterator<String> slIter2 = sl.iterator();
        slIter2.remove("Five");
        System.out.println(sl);
        SListIterator<String> slIter3 = sl.iterator();
        slIter3.remove("Three");
        System.out.println(sl);
    }
}
