package assignment7.innerclasses;

public class NewOuterClass {
    public static class NewInnerClass extends OuterClass.InnerClass
    {
        public NewInnerClass() {
            super("from new inner class");
        }
    }
}
